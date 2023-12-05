public static int [ ] solve ( int n , int a , int b , int k ) {
  int p = 998244353 ;
  int [ ] inv ;
  /* get inv */
  inv = new int [ n + 1 ] ;
  inv [ 1 ] = 1 ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    inv [ i ] = ( - ( p / i ) * inv [ p % i ] ) % p ;
  }
  /* get nCr */
  inv = getinv ( n ) ;
  int [ ] nCr = new int [ n + 1 ] ;
  nCr [ 0 ] = 1 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    nCr [ i ] = ( nCr [ i - 1 ] * ( n - i + 1 ) * inv [ i ] ) % p ;
  }
  /* solve */
  int ans = 0 ;
  nCr = getnCr ( n ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ( k - a * i ) < 0 || ( k - a * i ) % b != 0 ) {
      continue ;
    }
    int j = ( k - a * i ) / b ;
    if ( a * i + b * j == k && 0 <= j && j <= n ) {
      ans += nCr [ i ] * nCr [ j ] ;
      ans %= p ;
    }
  }
  return ans ;
}
