@ VisibleForTesting static Iterable < Integer > sieve ( int n ) {
  boolean [ ] isPrime = new boolean [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    isPrime [ i ] = true ;
  }
  isPrime [ 0 ] = false ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    if ( isPrime [ i - 1 ] ) {
      int j = 2 * i ;
      while ( j <= n ) {
        isPrime [ j - 1 ] = false ;
        j += i ;
      }
    }
  }
  int [ ] table = new int [ n + 1 ] ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    table [ i ] = i ;
  }
  return sieve ( isPrime , table ) ;
}
