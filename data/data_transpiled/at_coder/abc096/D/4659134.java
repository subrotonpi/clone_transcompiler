public static int [ ] primes ( int n ) {
  boolean [ ] isPrime = new boolean [ n + 1 ] ;
  isPrime [ 0 ] = false ;
  isPrime [ 1 ] = false ;
  for ( int i = 2 ;
  i <= ( int ) ( n * 0.5 ) ;
  i ++ ) {
    if ( ! isPrime [ i ] ) continue ;
    for ( int j = i * 2 ;
    j <= n ;
    j += i ) {
      isPrime [ j ] = false ;
    }
  }
  return primes ( n + 1 ) ;
}
