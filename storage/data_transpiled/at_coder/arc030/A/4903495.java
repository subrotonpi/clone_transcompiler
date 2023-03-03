public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int k = Integer . parseInt ( input ( ) ) ;
  if ( n >= 2 * k ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
  if ( getClass ( ) . isClassPresent ( Test . class ) ) {
    Test . main ( args ) ;
  }
}
