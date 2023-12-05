static int count ( int B , int M [ ] , int t ) {
  final int s = 0 ;
  for ( int i : xrange ( B ) ) {
    s += t / M [ i ] ;
    if ( t % M [ i ] != 0 ) s ++ ;
  }
  return s ;
}
