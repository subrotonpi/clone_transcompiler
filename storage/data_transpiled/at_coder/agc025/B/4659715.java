public static int [ ] getinv ( int n ) {
  int [ ] inv = new int [ n + 1 ] ;
  inv [ 1 ] = 1 ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    inv [ i ] = ( - ( p / i ) * inv [ p % i ] ) % p ;
  }
  return inv ;
}
