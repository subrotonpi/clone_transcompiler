public static void input ( Scanner scanner ) {
  int N = scanner . nextInt ( ) ;
  int SN = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    SN += Integer . parseInt ( scanner . nextLine ( ) ) ;
  }
  if ( Integer . parseInt ( scanner . nextLine ( ) ) % SN == 0 ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
