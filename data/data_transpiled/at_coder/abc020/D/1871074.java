public static int d_LCMrush ( int N , int K ) {
  int MOD = 10 * 9 + 7 ;
  int [ ] tmp = new int [ N ] ;
  int i = 1 ;
  while ( i * i <= K ) {
    if ( K % i == 0 ) {
      tmp [ 0 ] = i ;
      tmp [ 1 ] = K / i ;
    }
    i ++ ;
  }
  int [ ] divisor = new int [ N ] ;
  Arrays . sort ( tmp ) ;
  Arrays . sort ( divisor ) ;
  int [ ] lcm_sum = new int [ divisor . length ] ;
  for ( int i = 0 ;
  i < divisor . length ;
  i ++ ) {
    int time = N / divisor [ i ] ;
    multiply [ i ] = divisor [ i ] * time * ( time + 1 ) / 2 ;
    for ( int j = 0 ;
    j < i ;
    j ++ ) {
      if ( divisor [ j ] % divisor [ i ] == 0 ) {
        multiply [ i ] = ( multiply [ i ] + MOD - multiply [ j ] ) % MOD ;
      }
    }
    lcm_sum [ i ] = ( multiply [ i ] * K / divisor [ i ] ) % MOD ;
  }
  ans = Integer . parseInt ( lcm_sum ) % MOD ;
  return ans ;
}
