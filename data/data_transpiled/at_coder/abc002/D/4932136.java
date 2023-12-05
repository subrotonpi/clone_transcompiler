private static int [ ] [ ] scan ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int [ ] [ ] rel = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int x = Integer . parseInt ( input ) ;
    int y = Integer . parseInt ( input ) ;
    rel [ x - 1 ] [ y ] = y ;
    rel [ y - 1 ] [ x ] = y ;
  }
  int ans = 1 ;
  for ( int i = 1 ;
  i < 1 << n ;
  i ++ ) {
    int [ ] group = new int [ n ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( i >> j & 1 ) group [ j ] = j + 1 ;
    }
    if ( Arrays . binarySearch ( rel [ j - 1 ] , group ) > 0 ) ans = Math . max ( ans , group . length ) ;
  }
  System . out . println ( ans ) ;
  return rel ;
}
