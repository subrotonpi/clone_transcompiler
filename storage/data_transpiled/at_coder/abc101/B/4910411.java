public static void input ( Scanner in ) {
  int s = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    s += in . nextInt ( ) ;
  }
  if ( ( in . nextInt ( ) % s ) == 0 ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
