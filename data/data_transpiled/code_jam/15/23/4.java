@ VisibleForTesting static int solve ( int N , List < Hiker > hikers ) {
  final int N = hikers . size ( ) ;
  final int [ ] D = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  ++ i ) {
    D [ i ] = hikers . get ( i ) . getD ( ) ;
  }
  final int [ ] M = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  ++ i ) {
    M [ i ] = hikers . get ( i ) . getM ( ) ;
  }
  final List < InterleavedEdge > intersects = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  ++ i ) {
    intersects . add ( new InterleavedEdge ( ( 360 - D [ i ] ) * M [ i ] , M [ i ] , i ) ) ;
  }
  heapify ( intersects ) ;
  int best = N ;
  int current = best ;
  final Set < Integer > set = new HashSet < > ( ) ;
  while ( current <= 2 * N ) {
    final int m = heapify ( intersects ) ;
    if ( ! set . contains ( i ) ) {
      current -- ;
      best = Math . min ( best , current ) ;
      set . add ( i ) ;
    }
    else {
      current ++ ;
    }
    heapify ( intersects ) ;
  }
  return best ;
}
