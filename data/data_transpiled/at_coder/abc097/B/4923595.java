public static int x = Integer . parseInt ( input ) {
  int [ ] y = new int [ 11 ] ;
  for ( int i = 1 ;
  i <= 33 ;
  i ++ ) {
    for ( int j = 2 ;
    j <= 11 ;
    j ++ ) {
      if ( i * j <= x ) {
        y [ i ] = j ;
      }
    }
  }
  System . out . println ( max ( y ) ) ;
  return y . length ;
}
