static int n ( int m , int ... A ) throws IOException {
  int [ ] D = new int [ 2 * m + 2 ] ;
  int cur = 0 ;
  int S = 0 ;
  for ( int a = 0 , b = 0 ;
  a < A . length ;
  a ++ ) {
    S += ( b - a ) % m ;
    b += m * ( b < A . length ) ;
    int k = b - a ;
    if ( k > 1 ) {
      D [ a + 2 ] ++ ;
      D [ b + 1 ] -= k ;
      D [ b + 2 ] += k - 1 ;
    }
  }
  for ( int i = 1 ;
  i <= 2 * m ;
  i ++ ) {
    D [ i ] += D [ i - 1 ] ;
  }
  return S ;
}
