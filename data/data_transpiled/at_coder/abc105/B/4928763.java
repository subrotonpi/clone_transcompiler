public static int N = Integer . parseInt ( input ) {
  int i = 0 ;
  int j = 0 ;
  for ( i = 0 ;
  i < N / 4 + 1 ;
  i ++ ) {
    for ( j = 0 ;
    j < N / 7 + 1 ;
    j ++ ) {
      if ( 4 * i + 7 * j == N ) {
        System . out . println ( "Yes" ) ;
        quit ( ) ;
      }
    }
  }
  System . out . println ( "No" ) ;
  return 0 ;
}
