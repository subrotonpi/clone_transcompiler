@ VisibleForTesting static void main ( final String input ) {
  final int mod = 10 * 9 + 7 ;
  final int N = 10 * 5 + 11 ;
  int [ ] fac = new int [ N ] , finv = new int [ N ] , inv = new int [ N ] ;
  {
    cmbInit ( ) ;
    fac [ 0 ] = fac [ 1 ] = finv [ 0 ] = finv [ 1 ] = inv [ 1 ] = 1 ;
    for ( int i = 2 ;
    i < N ;
    i ++ ) {
      fac [ i ] = fac [ i - 1 ] * i % mod ;
      inv [ i ] = mod - inv [ mod % i ] * ( mod / i ) % mod ;
      finv [ i ] = finv [ i - 1 ] * inv [ i ] % mod ;
    }
  }
  {
    int n = Integer . parseInt ( input ) ;
    int [ ] a = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) a [ i ] = Integer . parseInt ( input ) ;
    int ac = a [ i ] ;
    int [ ] sames = Arrays . copyOf ( a , n ) ;
    sames [ 0 ] = ac ;
    int sameLen = sames [ 0 ] + ( n - sames [ 1 ] ) ;
    cmbInit ( ) ;
    System . out . println ( n ) ;
    for ( int i = 1 ;
    i < n ;
    i ++ ) {
      int nums = cmbMod ( n + 1 , i + 1 ) - cmbMod ( sameLen , i ) ;
      if ( nums < 0 ) nums += mod ;
      System . out . println ( nums ) ;
    }
    System . out . println ( 1 ) ;
  }
}
