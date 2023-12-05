static void f ( File f ) throws IOException {
  File out = new File ( "A_Rnd2.in" ) ;
  int cases = Integer . parseInt ( f . getCanonicalPath ( ) . substring ( 0 , f . getCanonicalPath ( ) . length ( ) - 1 ) ) ;
  /* isok */
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    if ( a [ i ] > i ) {
      /* return false */
      return false ;
    }
  }
  /* maxindex */
  int max = - 1 ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    if ( a [ i ] == 1 ) {
      max = i ;
    }
  }
  for ( int i = 0 ;
  i < cases ;
  i ++ ) {
    int n = Integer . parseInt ( f . getCanonicalPath ( ) . substring ( 0 , f . getCanonicalPath ( ) . length ( ) - 1 ) ) ;
    int [ ] a = new int [ n ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      String s = f . getCanonicalPath ( ) . substring ( 0 , f . getCanonicalPath ( ) . length ( ) - 1 ) ;
      a [ j ] = maxindex ( new int [ s . length ( ) ] ) ;
    }
    System . out . println ( a ) ;
    int ct = 0 ;
    int row = 0 ;
    while ( ( ! isok ( a ) ) && ( row < a . length ) ) {
      int m = - 1 ;
      for ( int j = row ;
      j < a . length ;
      j ++ ) {
        if ( a [ j ] <= row ) {
          m = j ;
          break ;
        }
      }
      a = Arrays . copyOf ( a , row ) ;
      a [ row ] = a [ j ] ;
      System . out . println ( a ) ;
      ct += m - row ;
      row ++ ;
    }
    System . out . println ( ct ) ;
    out . println ( "Case #" + ( i + 1 ) + ": " + ct ) ;
  }
}
