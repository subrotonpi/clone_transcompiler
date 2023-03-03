public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  do {
    n -= a ;
    if ( n <= 0 ) {
      System . out . println ( "Ant" ) ;
      return ;
    }
    n -= b ;
    if ( n <= 0 ) {
      System . out . println ( "Bug" ) ;
      return ;
    }
  }
  while ( n <= 0 ) ;
  if ( getClass ( ) . equals ( "java.lang.Integer" ) ) {
    new Main ( ) ;
  }
}
