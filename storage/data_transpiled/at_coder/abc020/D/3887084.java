public static int N = Integer . parseInt ( input ) {
  int MOD = 10 * 9 + 7 ;
  /* Calculate the number of divisors */
  ArrayList < Integer > ret = new ArrayList < > ( ) ;
  int m = 1 ;
  while ( m * m <= n ) {
    if ( n % m == 0 ) {
      ret . add ( m ) ;
      if ( m * m != n ) {
        ret . add ( n / m ) ;
      }
    }
    m ++ ;
  }
  Collections . sort ( ret ) ;
  /* Calculate the factors */
  HashSet < Integer > ret = new HashSet < > ( ) ;
  int m = 2 ;
  while ( m * m <= n ) {
    while ( n % m == 0 ) {
      n /= m ;
      ret . add ( m ) ;
    }
    m ++ ;
  }
  if ( n > 1 ) {
    ret . add ( n ) ;
  }
  /* Sum the coprime */
  int maxn = 0 ;
  int [ ] factors = calcFactors ( k ) ;
  for ( int b = 0 ;
  b < 1 << factors . length ;
  b ++ ) {
    int sign = 1 ;
    int mul = 1 ;
    for ( int i = 0 ;
    i < factors . length ;
    i ++ ) {
      if ( ( b & ( 1 << i ) ) != 0 ) {
        sign *= - 1 ;
        mul *= factors [ i ] ;
      }
    }
    ret . add ( sign * mul * ( maxn / mul ) * ( maxn / mul + 1 ) / 2 ) ;
    ret %= MOD ;
  }
  /* Calculate the sum of the divisors */
  int [ ] divisors = calcDivisors ( K ) ;
  int ans = 0 ;
  for ( int d : divisors ) {
    ans += K * sumCoprime ( N / d , K / d ) ;
    ans %= MOD ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
