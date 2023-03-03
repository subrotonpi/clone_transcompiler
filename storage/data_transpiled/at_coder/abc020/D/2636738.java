public static int [ ] parse ( String input ) {
  int n = Integer . parseInt ( input ) , k = Integer . parseInt ( input ) ;
  int MOD = 10 * 9 + 7 ;
  /* Devisor */
  ArrayList < Integer > l = new ArrayList < > ( ) ;
  int i = 1 ;
  while ( i * i <= n ) {
    if ( n % i == 0 ) {
      l . add ( i ) ;
      l . add ( n / i ) ;
    }
    i ++ ;
  }
  /* GCD */
  if ( n > x ) {
    n = x ;
  }
  while ( n > 0 ) {
    n = n % n ;
  }
  /* GCD */
  int [ ] d = Devisor ( k ) ;
  Map < Integer , Integer > dd = new HashMap < > ( ) ;
  int ans = 0 ;
  for ( int i = d . length - 1 ;
  i >= 0 ;
  i -- ) {
    int x = d [ i ] ;
    int y = n / x ;
    int a = x * y * ( y + 1 ) / 2 % MOD ;
    for ( int j = i + 1 ;
    j < d . length ;
    j ++ ) {
      int z = d [ j ] ;
      if ( z % x == 0 ) {
        a -= dd . get ( z ) ;
      }
    }
    dd . put ( x , a ) ;
    ans += a * k / gcd ( k , x ) ;
    ans %= MOD ;
  }
  System . out . println ( ans ) ;
  return dd . values ( ) ;
}
