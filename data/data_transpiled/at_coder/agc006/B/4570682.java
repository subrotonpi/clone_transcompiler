public static int N = Integer . parseInt ( input ) {
  int x = input . nextInt ( ) ;
  int s = 2 * N - 1 ;
  if ( x == 1 || x == 2 * N - 1 ) {
    System . out . println ( "No" ) ;
  }
  else {
    System . out . println ( "Yes" ) ;
    for ( int i = 0 ;
    i < s ;
    i ++ ) {
      System . out . println ( 1 + ( x - N + i ) % s ) ;
    }
  }
  return s ;
}
