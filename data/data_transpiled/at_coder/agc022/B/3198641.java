@ VisibleForTesting static int gcd ( int x , int y ) {
  if ( x < y ) {
    x = y ;
    y = x ;
  }
  int r = x % y ;
  int res = r == 0 ? y : gcd ( y , r ) ;
  return res ;
}
