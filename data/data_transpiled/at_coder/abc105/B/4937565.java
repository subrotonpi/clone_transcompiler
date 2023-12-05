public static int N = Integer . parseInt ( input ) {
  for ( int i = 0 ;
  i <= 26 ;
  i ++ ) {
    for ( int j = 0 ;
    j <= 18 ;
    j ++ ) {
      if ( 4 * i + 7 * j == N ) {
        System . out . println ( "Yes" ) ;
        exit ( ) ;
      }
    }
  }
  System . out . println ( "No" ) ;
  return 0 ;
}
