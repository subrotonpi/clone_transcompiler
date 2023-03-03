@ Nullable public static String compute ( int L , int X , int ijk ) {
  String [ ] M = {
    "sijk" , "iSkJ" , "jKSi" , "kjIS" , }
    ;
    Map < Integer , String > MUL = new HashMap < Integer , String > ( ) ;
    /* change case */
    if ( Character . isLowerCase ( M [ 0 ] . charAt ( 0 ) ) ) {
      return Character . toUpperCase ( M [ 0 ] . charAt ( 0 ) ) ;
    }
    else {
      return Character . toLowerCase ( M [ 0 ] . charAt ( 0 ) ) ;
    }
    /* init map */
    for ( int i = 0 ;
    i < M [ 0 ] . length ( ) ;
    i ++ ) {
      String a = M [ 0 ] [ i ] ;
      for ( int j = 0 ;
      j < M [ 0 ] . length ( ) ;
      j ++ ) {
        String b = M [ 0 ] [ j ] ;
        MUL . put ( a , b , M [ i ] [ j ] ) ;
        MUL . put ( a . toUpperCase ( ) , b , changeCase ( M [ i ] [ j ] ) ) ;
        MUL . put ( a , b . toUpperCase ( ) , M [ i ] [ j ] ) ;
      }
    }
    /* mul */
    return MUL . get ( a ) . get ( b ) ;
    /* min left */
    char r = 's' ;
    for ( int i : xrange ( s . length ( ) ) ) {
      r = mul ( r , s [ i ] ) ;
      if ( r == c ) {
        return i + 1 ;
      }
    }
    /* min right */
    char r = 's' ;
    for ( int i : xrange ( s . length ( ) ) ) {
      r = mul ( s [ s . length ( ) - i - 1 ] , r ) ;
      if ( r == c ) {
        return i + 1 ;
      }
    }
    /* compute */
    int ijk4 = ijk * 4 ;
    Integer left = minLeft ( ijk4 , 'i' ) ;
    Integer right = minRight ( ijk4 , 'k' ) ;
    if ( left == null || right == null ) {
      return "NO" ;
    }
    if ( left + right > L * X ) {
      return "NO" ;
    }
    /* parse */
    L = Integer . parseInt ( System . in . readLine ( ) . trim ( ) ) ;
    X = Integer .