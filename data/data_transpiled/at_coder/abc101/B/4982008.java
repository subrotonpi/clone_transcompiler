public static void input ( Scanner scanner ) {
  int cnt = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    cnt += scanner . nextInt ( ) ;
  }
  if ( Integer . parseInt ( scanner . nextLine ( ) ) % cnt == 0 ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
