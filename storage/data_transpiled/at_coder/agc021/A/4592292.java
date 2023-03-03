public static void input ( Scanner input ) {
  int K = input . nextInt ( ) ;
  int c = Integer . parseInt ( input . next ( ) ) ;
  String [ ] restNum = input . next ( ) . split ( " " ) ;
  int ans ;
  if ( K == 1 || new HashSet < > ( Arrays . asList ( restNum ) ) . equals ( "9" ) ) {
    ans = c + 9 * ( K - 1 ) ;
  }
  else {
    ans = c - 1 + 9 * ( K - 1 ) ;
  }
  System . out . println ( ans ) ;
}
