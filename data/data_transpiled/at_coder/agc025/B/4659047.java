public static int N = Integer . parseInt ( input ) {
  int A = 0 , B = 0 , K = Integer . parseInt ( input . readLine ( ) ) ;
  int MOD = 998244353 ;
  int [ ] F = new int [ N + 1 ] ;
  int [ ] Fi = new int [ N + 1 ] ;
  int [ ] I = new int [ N + 1 ] ;
  for ( int i = 2 ;
  i <= N ;
  i ++ ) {
    F [ i ] = ( F [ i - 1 ] * i ) % MOD ;
    I [ i ] = MOD - I [ MOD % i ] * ( MOD / i ) % MOD ;
    Fi [ i ] = Fi [ i - 1 ] * I [ i ] % MOD ;
  }
  if ( A > B ) {
    A = B ;
    B = A ;
  }
  int Rk = Math . min ( N , K / A ) ;
  int Ans = 0 ;
  for ( int i = 0 ;
  i < Rk + 1 ;
  i ++ ) {
    int R = i ;
    if ( ( K - ( A * R ) ) % B != 0 ) {
      continue ;
    }
    int C = ( K - ( A * R ) ) / B ;
    if ( C > N ) {
      continue ;
    }
    int Rc = F [ N ] * ( Fi [ R ] * Fi [ N - R ] % MOD ) % MOD ;
    int Cc = F [ N ] * ( Fi [ C ] * Fi [ N - C ] % MOD ) % MOD ;
    Ans += ( Rc * Cc ) % MOD ;
  }
  System . out . println ( Ans % MOD ) ;
  return 0 ;
}
