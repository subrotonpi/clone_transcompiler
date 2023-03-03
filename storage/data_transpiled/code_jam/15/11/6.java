static String compute ( int N , int [ ] m ) {
  final int nmin = 0 ;
  int nmax = 0 ;
  int maxdelta = 0 ;
  for ( int i : xrange ( 1 , N ) ) {
    if ( m [ i ] < m [ i - 1 ] ) {
      final int delta = m [ i - 1 ] - m [ i ] ;
      nmin += delta ;
      if ( delta > maxdelta ) {
        maxdelta = delta ;
      }
    }
  }
  for ( int i : xrange ( 1 , N ) ) {
    nmax += Math . min ( maxdelta , m [ i - 1 ] ) ;
  }
  return nmin + " " + nmax ;
}
