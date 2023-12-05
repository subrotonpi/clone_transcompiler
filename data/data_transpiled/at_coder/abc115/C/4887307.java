public static void input ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int K = Integer . parseInt ( input . readLine ( ) ) ;
  Arrays . sort ( h ) ;
  int ans = 10 * 9 ;
  for ( int i = 0 ;
  i <= N - K ;
  i ++ ) {
    ans = Math . min ( ans , h [ i + K - 1 ] - h [ i ] ) ;
  }
  System . out . println ( ans ) ;
}
