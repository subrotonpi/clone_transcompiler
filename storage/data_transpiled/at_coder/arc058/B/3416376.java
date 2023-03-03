public static void input ( ) {
  int H = Integer . parseInt ( input . readLine ( ) ) ;
  int W = Integer . parseInt ( input . readLine ( ) ) ;
  int A = Integer . parseInt ( input . readLine ( ) ) ;
  int B = Integer . parseInt ( input . readLine ( ) ) ;
  int MOD = 10 * 9 + 7 ;
  int [ ] fact = new int [ H + W + 1 ] ;
  fact [ 0 ] = 1 ;
  for ( int i = 1 ;
  i <= H ;
  i ++ ) {
    fact [ i ] = ( fact [ i - 1 ] * i ) % MOD ;
  }
  HashMap < Integer , Integer > u = new HashMap < Integer , Integer > ( ) ;
  for ( int i = B ;
  i < W ;
  i ++ ) {
    int t = fact [ i + H - A - 1 ] * Math . pow ( fact [ i ] * fact [ H - A - 1 ] , MOD - 2 , MOD ) ;
    u . put ( i + 1 , t % MOD ) ;
  }
  int ans = 0 ;
  for ( Map . Entry < Integer , Integer > e : u . entrySet ( ) ) {
    int t = fact [ W - e . getKey ( ) + A - 1 ] * Math . pow ( fact [ W - e . getKey ( ) ] * fact [ A - 1 ] , MOD - 2 , MOD ) % MOD ;
    ans = ( ans + t * e . getValue ( ) ) % MOD ;
  }
  System . out . println ( ans ) ;
}
