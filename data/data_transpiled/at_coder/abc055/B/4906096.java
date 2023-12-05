public static void input ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int mod = 10 * 9 + 7 ;
  int ans = 1 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    ans *= i ;
    ans %= mod ;
  }
  System . out . println ( ans ) ;
}
