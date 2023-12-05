@ GwtIncompatible ( "System.out.println" ) private static int [ ] [ ] readInts ( ) {
  int [ ] [ ] count = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    count [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  }
  int [ ] [ ] reads = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    reads [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  }
  int N = reads [ 0 ] ;
  int [ ] [ ] D1 = reads [ 1 ] ;
  int [ ] [ ] D2 = reads [ 2 ] ;
  int NN = 2 * N ;
  {
    int [ ] deg = new int [ N ] [ ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      deg [ i ] = ( int ) count [ i ] [ 0 ] ;
    }
  }
  int [ ] [ ] group = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int [ ] p = deg [ i ] ;
    int hp = p >> 1 ;
    if ( ( p & 1 ) == 0 ) {
      return ( group [ i ] [ 0 ] & 1 ) ^ ( group [ i ] [ 1 ] & 1 ) ;
    }
    else {
      return group [ i ] [ 0 ] & 1 ;
    }
  }
  int [ ] [ ] pts = new int [ NN ] [ N * NN ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    pts [ i ] = ( pts [ i ] [ 0 ] & 1 ) ;
  }
  for ( int i = 0 ;
  i < N * NN ;
  i ++ ) {
    pts [ i ] [ N * NN ] = group [ i ] [ 1 ] & 1 ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    pts [ i ] [ N * NN ] = group [ i ] [ 2 ] & 1 ;
  }
  System . out . println ( pts [ N * NN ] ) ;
  return pts ;
}
