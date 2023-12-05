static final int [ ] product ( int [ ] seq ) {
  final int [ ] result = new int [ seq . length ] ;
  int i ;
  int j ;
  int i ;
  int min = seq . length ;
  for ( i = 0 ;
  i < i ;
  i ++ ) {
    result [ i ] = product ( seq [ i ] ) ;
  }
  /* Find divisors */
  result [ 0 ] = 1 ;
  for ( i = xrange ( 1 , ( int ) Math . sqrt ( i ) ) + 1 ;
  i < N ;
  i ++ ) {
    if ( i % i == 0 ) {
      if ( L <= i && i <= H ) result [ i ] = i ;
      if ( L <= x / i && x / i <= H ) result [ i ] = x / i ;
    }
  }
  /* Find multiples */
  result [ 0 ] = 1 ;
  for ( i = xrange ( 1 , ( int ) Math . sqrt ( i ) ) ;
  i < N ;
  i ++ ) {
    result [ i ] = findDivisors ( i , L , H ) ;
  }
  return result ;
}
