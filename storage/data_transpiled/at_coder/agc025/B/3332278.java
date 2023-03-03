public static int [ ] getInv ( int N ) {
  int [ ] inv = new int [ N + 1 ] ;
  inv [ 0 ] = 1 ;
  inv [ 1 ] = 1 ;
  for ( int i = 2 ;
  i <= N ;
  i ++ ) {
    inv [ i ] = ( - ( Q / i ) * inv [ Q % i ] ) % Q ;
  }
  return inv ;
}
