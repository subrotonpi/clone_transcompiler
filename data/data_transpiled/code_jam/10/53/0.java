public static void test ( int casenum , int [ ] [ ] vs ) {
  for ( int j = 0 ;
  j < vs . length ;
  j ++ ) {
    for ( int i = 0 ;
    i < vs . length ;
    i ++ ) {
      vs [ i ] [ j ] = Integer . parseInt ( scanner . nextLine ( ) ) ;
    }
  }
  Map < Integer , Integer > ve = new HashMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i < vs . length ;
  i ++ ) {
    int [ ] v = vs [ i ] ;
    ve . put ( v [ 0 ] , v [ 1 ] ) ;
  }
  int [ ] v = ve . keySet ( ) . toArray ( ) ;
  int switches = 0 ;
  List < Integer > v1 = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < ve . keySet ( ) . size ( ) ;
  i ++ ) {
    int [ ] z = ve . keySet ( ) . toArray ( ) ;
    while ( ( z [ 0 ] > 1 ) && ( z [ 1 ] > 1 ) ) {
      for ( int i = 0 ;
      i < v1 . size ( ) ;
      i ++ ) {
        int loc = v1 . get ( i ) ;
        if ( ! ( v [ loc - 1 ] == 0 ) ) v [ loc - 1 ] = 0 ;
        if ( ! ( v [ loc + 1 ] == 0 ) ) v [ loc + 1 ] = 0 ;
        v [ loc - 1 ] += v [ loc ] >> 1 ;
        v [ loc + 1 ] += v [ loc ] >> 1 ;
        switches += v [ loc ] >> 1 ;
        v [ loc ] &= 1 ;
      }
      v1 . clear ( ) ;
    }
  }
  System . out . println ( "Case #" + casenum + ": " + switches ) ;
}
