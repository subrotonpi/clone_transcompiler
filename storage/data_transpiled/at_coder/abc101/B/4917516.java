public static void input ( Scanner input ) {
  int S = 0 ;
  for ( int i = 0 ;
  i < N . length ( ) ;
  i ++ ) {
    S += Integer . parseInt ( input . nextLine ( ) ) ;
  }
  if ( Integer . parseInt ( input . nextLine ( ) ) % S == 0 ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
