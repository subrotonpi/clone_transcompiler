static final int MOD = 10 * 9 + 7 ;
{
  int max = ( int ) Math . sqrt ( N ) ;
  int [ ] seachList = new int [ N + 1 ] ;
  for ( int i = 2 ;
  i <= N ;
  i ++ ) {
    seachList [ i ] = i ;
  }
  int [ ] primeNum = new int [ max ] ;
  while ( seachList [ 0 ] <= max ) {
    primeNum [ 0 ] = seachList [ 0 ] ;
    int tmp = seachList [ 0 ] ;
    seachList = new int [ max ] ;
    for ( int i = 0 ;
    i < max ;
    i ++ ) {
      if ( i % tmp != 0 ) {
        primeNum [ i ] = seachList [ i ] ;
        tmp = seachList [ i ] ;
      }
    }
  }
  primeNum [ 0 ] = seachList [ 0 ] ;
  return primeNum [ 0 ] ;
}
