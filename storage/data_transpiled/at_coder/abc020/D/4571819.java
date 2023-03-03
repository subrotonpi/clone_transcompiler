public static int N = Integer . parseInt ( input ) {
  final long K = Integer . parseInt ( input . nextLine ( ) ) ;
  final long Mod = 1000000007 ;
  {
    final List < Integer > res = new ArrayList < > ( ) ;
    int i = 2 ;
    while ( i * i <= k ) {
      if ( i * i > k ) break ;
      if ( k % i == 0 ) {
        res . add ( i ) ;
        while ( k % i == 0 ) k /= i ;
      }
      i ++ ;
    }
    if ( k != 1 ) res . add ( k ) ;
    return res . size ( ) ;
  }
  private static long sum_gcd_one ( int n , int k ) {
    final List < Integer > d = list_prime_divisor ( k ) ;
    long plus = 0 ;
    long minus = 0 ;
    for ( int i = 0 ;
    i < 1 << d . size ( ) ;
    i ++ ) {
      int cpi = i ;
      long ll = 1 ;
      int cnt = 0 ;
      for ( int j : d ) {
        if ( cpi % 2 == 1 ) {
          cnt ++ ;
          ll *= j ;
        }
        cpi /= 2 ;
      }
      if ( cnt % 2 == 0 ) {
        plus += s ( n / ll ) * ll ;
        plus %= Mod ;
      }
      else {
        minus += s ( n / ll ) * ll ;
        minus %= Mod ;
      }
    }
    plus += ( Mod - minus ) ;
    plus %= Mod ;
    return plus ;
  }
  private static long s ( int n ) {
    return ( ( ( n + 1 ) * n ) / 2 ) % Mod ;
  }
  long ans = 0 ;
  final List < Integer > div = new ArrayList < > ( ) ;
  int i1 = 1 ;
  while ( i1 * i1 <= K ) {
    if ( K % i1 == 0 ) {
      div . add ( i1 ) ;
      if ( K / i1 != i1 ) {
        final int i2 = K / i1 ;
        div . add ( i2 ) ;
      }
    }
    i1 ++ ;
  }
  Collections . sort ( div ) ;
  for ( int i3 : div ) ans += K * sum_gcd_one ( N / i3 , K / i3 ) % Mod ;
  ans %= Mod ;
  System . out . println ( ans ) ;
  return ans ;
}
