public static void COMB_MOD ( ) {
  {
    int max = 510000 ;
    int mod = 10 * 9 + 7 ;
    int [ ] fac = new int [ max_n ] ;
    int [ ] finv = new int [ max_n ] ;
    int [ ] inv = new int [ max_n ] ;
    fac [ 0 ] = fac [ 1 ] = 1 ;
    finv [ 0 ] = finv [ 1 ] = 1 ;
    inv [ 1 ] = 1 ;
    max = max_n ;
    mod = mod ;
    maesyori ( ) ;
  }
  {
    for ( int i = 2 ;
    i < max ;
    i ++ ) {
      fac [ i ] = fac [ i - 1 ] * i % mod ;
      inv [ i ] = mod - inv [ mod % i ] * ( mod / i ) % mod ;
      finv [ i ] = finv [ i - 1 ] * inv [ i ] % mod ;
    }
  }
  {
    int n , k ;
    int h , w , a , b ;
    if ( n < k ) return 0 ;
    if ( n < 0 || k < 0 ) return 0 ;
    return fac [ n ] * ( finv [ k ] * finv [ n - k ] % mod ) % mod ;
  }
}
