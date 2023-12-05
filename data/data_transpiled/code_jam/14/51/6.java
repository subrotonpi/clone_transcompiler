static double solve ( int N , int p , int q , int r , int s ) {
  final int [ ] A = new int [ N ] ;
  final int [ ] S = new int [ N ] ;
  int psum = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = s + ( ( i * p + q ) % r ) ;
    A [ i ] = a ;
    psum = psum + a ;
    S [ i ] = psum ;
  }
  int mingain = psum ;
  int minpgain = psum ;
  int hpi = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int j = hpi ;
    while ( j <= i ) {
      int pgain = Math . max ( S [ j ] , S [ i ] - S [ j ] ) ;
      int gain = Math . max ( S [ j ] , S [ i ] - S [ j ] , psum - S [ i ] ) ;
      mingain = Math . min ( mingain , gain ) ;
      if ( 2 * S [ j ] > S [ i ] ) break ;
      if ( pgain <= minpgain ) hpi = j ;
      j = j + 1 ;
    }
  }
  return ( double ) ( psum - mingain ) / psum ;
}
