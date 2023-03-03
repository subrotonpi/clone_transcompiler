public static int [ ] readIntList ( Scanner input ) {
  int N = input . nextInt ( ) , K = input . nextInt ( ) ;
  int [ ] w = new int [ N ] ;
  int [ ] p = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    w [ i ] = input . nextInt ( ) ;
    p [ i ] = input . nextInt ( ) ;
  }
  int low = 0 , high = 100 ;
  while ( ( high - low ) > 1e-10 ) {
    int mid = ( high + low ) / 2 ;
    List l = new ArrayList ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      l . add ( ( p [ i ] - mid ) * w [ i ] ) ;
    }
    int s = l . size ( ) ;
    if ( s >= 0 ) low = mid ;
    else high = mid ;
  }
  return l ;
}
