@ VisibleForTesting static int [ ] solve ( int k ) {
  int [ ] arr ;
  int base ;
  int [ ] arr ;
  /* Solve the number of elements in the array */
  if ( k == 0 ) {
    arr = new int [ 50 ] ;
  }
  else {
    arr = new int [ k ] ;
    for ( int i = 0 ;
    i < 50 ;
    i ++ ) arr [ i ] = 50 - i ;
    for ( int i = k ;
    i < 50 ;
    i ++ ) arr [ i ] = 0 ;
  }
  /* Solve the number of elements in the array */
  if ( k <= 50 ) {
    arr [ 0 ] = 50 ;
  }
  else {
    arr = new int [ k ] ;
    for ( int i = 1 ;
    i < 51 ;
    i ++ ) arr [ i ] = 1 ;
    base = ( k - 1 ) / 50 ;
    for ( int i = 0 ;
    i < 50 ;
    i ++ ) arr [ i ] += base - 1 ;
    for ( int i = k - base * 50 ;
    i < 50 ;
    i ++ ) arr [ i ] ++ ;
  }
  /* Solve the number of elements in the array */
  int K = Integer . parseInt ( input ( ) ) ;
  System . out . println ( 50 ) ;
  System . out . println ( ( K ) ) ;
  /* Solve the number of elements in the array */
  ans = 0 ;
  N = arr . length ;
  Arrays . sort ( arr ) ;
  do {
    taken = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      taken [ i ] = arr [ i ] / N ;
      arr [ i ] -= taken [ i ] * N ;
    }
    int takenSum = Arrays . binarySearch ( arr , taken ) ;
    if ( takenSum == 0 ) break ;
    ans += takenSum ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) As [ i ] += ( takenSum - taken [ i ] ) ;
  }
  while ( ans > 0 ) ;
  return arr ;
}
