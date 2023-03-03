public static void main ( String [ ] args ) {
  if ( args . length == 0 ) {
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( n == 1 ) {
      System . out . println ( "Hello World" ) ;
    }
    if ( n == 2 ) {
      int a = Integer . parseInt ( input . nextLine ( ) ) ;
      int b = Integer . parseInt ( input . nextLine ( ) ) ;
      System . out . println ( a + b ) ;
    }
  }
}
