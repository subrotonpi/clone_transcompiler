public static int n , int a , int b , int k ;
int p = 998244353 ;
{
  int [ ] inv = new int [ n + 1 ] ;
  inv [ 0 ] = 0 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    inv [ i ] = Math . pow ( i , p - 2 , p ) ;
  }
  return inv [ 0 ] ;
}
{
  int [ ] nCr = new int [ n + 1 ] ;
  nCr [ 0 ] = 1 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    nCr [ i ] = ( nCr [ i - 1 ] * ( n - i + 1 ) * inv [ i ] ) % p ;
  }
  return nCr [ 0 ] ;
}
