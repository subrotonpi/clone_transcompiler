@ VisibleForTesting static int solve ( int N ) {
  final Scanner cin = new Scanner ( System . in ) ;
  final int [ ] isp = new int [ 1000500 ] ;
  isp [ 0 ] = isp [ 1 ] = 0 ;
  final int LL = isp . length ;
  final int [ ] prims = new int [ LL ] ;
  for ( int i : xrange ( 2 , LL ) ) {
    if ( ! isp [ i ] ) continue ;
    prims [ i ] = i ;
    int j = i * i ;
    while ( j < LL ) {
      isp [ j ] = 0 ;
      j += i ;
    }
  }
  return N ;
}
