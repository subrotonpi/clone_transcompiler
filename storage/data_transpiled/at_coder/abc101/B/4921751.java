public static void input ( ) {
  N = input . nextInt ( ) ;
  S = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( Integer . parseInt ( N ) % S == 0 ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
