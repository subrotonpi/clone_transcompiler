public static int [ ] getN ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) , K = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  for ( int mod = K + 1 ;
  mod <= N ;
  mod ++ ) {
    ans += ( mod - K ) * ( N / mod ) + max ( N % mod - max ( K - 1 , 0 ) , 0 ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
