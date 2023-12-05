public static int N = Integer . parseInt ( input ) {
  for ( int x = 0 ;
  x < 26 ;
  x ++ ) {
    for ( int y = 0 ;
    y < 15 ;
    y ++ ) {
      if ( ( 4 * x + 7 * y ) == N ) {
        System . out . println ( "Yes" ) ;
        exit ( ) ;
      }
    }
  }
  System . out . println ( "No" ) ;
  return 0 ;
}
