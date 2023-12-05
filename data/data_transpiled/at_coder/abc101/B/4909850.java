public static void input ( Scanner scanner ) {
  int N = scanner . nextInt ( ) ;
  int SN = 0 ;
  for ( String n : scanner . nextLine ( ) . split ( " " ) ) {
    SN += Integer . parseInt ( n ) ;
  }
  if ( Integer . parseInt ( scanner . nextLine ( ) ) % SN == 0 ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
