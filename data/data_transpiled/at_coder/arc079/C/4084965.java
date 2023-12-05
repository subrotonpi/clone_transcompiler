@ VisibleForTesting static int [ ] binarySearch ( ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < Integer > As = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    As . add ( i , input . nextInt ( ) ) ;
  }
  int ans = 0 ;
  while ( true ) {
    final int [ ] taken = new int [ N ] ;
    for ( int i = 0 ;
    i < taken . length ;
    i ++ ) {
      taken [ i ] = as . get ( i ) / N ;
      As . set ( i , taken [ i ] ) ;
    }
    int takenSum = taken [ N ] ;
    if ( takenSum == 0 ) break ;
    ans += takenSum ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) As . set ( i , ( takenSum - taken [ i ] ) ) ;
  }
  return ans ;
}
