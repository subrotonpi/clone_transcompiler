public static int [ ] getInv ( int n ) {
  int [ ] inv = new int [ n + 1 ] ;
  inv [ 1 ] = 1 ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    inv [ i ] = ( - ( MOD / i ) * inv [ MOD % i ] ) % MOD ;
  }
  return inv ;
}
