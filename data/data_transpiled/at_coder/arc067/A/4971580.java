static final int input ( ) {
  final int N = Integer . parseInt ( input ( ) ) ;
  int ans = 0 ;
  int s = 0 ;
  final int [ ] primes = new int [ N ] ;
  primes [ 0 ] = 2 ;
  int i = 3 ;
  while ( i <= N ) {
    Arrays . fill ( primes [ i ] , i % p != 0 ) && primes [ s ++ ] == i ;
  }
  final int [ ] l = new int [ primes . length ] ;
  for ( int i = 0 ;
  i < l . length ;
  i ++ ) {
    l [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < l . length ;
  i ++ ) {
    int j = 1 ;
    while ( p * j <= N ) {
      l [ i ] += ( N / ( p * j ) ) ;
      j ++ ;
    }
  }
  ans = 1 ;
  for ( int n : l ) {
    ans *= ( n + 1 ) ;
  }
  System . out . println ( ans % ( 10 * 9 + 7 ) ) ;
  return ans ;
}
