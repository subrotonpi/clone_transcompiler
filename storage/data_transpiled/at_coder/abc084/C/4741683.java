static void print ( int n ) {
  int [ ] [ ] csf = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    csf [ i ] = tuple ( Integer . parseInt ( input ( ) ) ) ;
  }
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    int ans = csf [ i ] [ 0 ] + csf [ i ] [ 1 ] ;
    for ( int j = i + 1 ;
    j < n - 1 ;
    j ++ ) {
      int [ ] here = csf [ j ] ;
      ans = Math . max ( ans , here [ 1 ] ) ;
      int rm = ans % here [ 2 ] ;
      if ( rm != 0 ) ans += here [ 2 ] - rm ;
      ans += here [ 0 ] ;
    }
    System . out . println ( ans ) ;
  }
  System . out . println ( 0 ) ;
}
