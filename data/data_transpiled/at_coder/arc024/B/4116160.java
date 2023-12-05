public static int bTrees ( int N , int [ ] Color ) {
  if ( new HashSet ( Color ) . size ( ) == 1 ) return - 1 ;
  int [ ] colorCycle = Color . clone ( ) ;
  colorCycle [ 0 ] = Color [ 0 ] ;
  int colorContinuity = 1 ;
  int tmpContinuity = 1 ;
  for ( int k = 0 ;
  k < N * 2 ;
  k ++ ) {
    if ( colorCycle [ k ] == colorCycle [ k - 1 ] ) tmpContinuity ++ ;
    else {
      colorContinuity = Math . max ( colorContinuity , tmpContinuity ) ;
      tmpContinuity = 1 ;
    }
  }
  int ans = ( ( colorContinuity - 1 ) / 2 ) + 1 ;
  return ans ;
}
