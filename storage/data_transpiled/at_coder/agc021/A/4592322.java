public static void input ( Scanner input ) {
  int K = input . nextInt ( ) ;
  int c = Integer . parseInt ( input . next ( ) ) ;
  String restNum = input . next ( ) ;
  int ans ;
  if ( restNum . equals ( "9" * ( K - 1 ) ) ) {
    ans = c + 9 * ( K - 1 ) ;
  }
  else {
    ans = c - 1 + 9 * ( K - 1 ) ;
  }
  System . out . println ( ans ) ;
}
