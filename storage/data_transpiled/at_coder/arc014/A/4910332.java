public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( n % 2 == 0 ) {
    System . out . println ( "Blue" ) ;
  }
  else {
    System . out . println ( "Red" ) ;
  }
  if ( getClass ( ) . isClassPresent ( Color . class ) ) {
    new Main ( ) . run ( ) ;
  }
}
