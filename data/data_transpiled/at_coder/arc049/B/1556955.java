public static double N ( Scanner input ) {
  int N = input . nextInt ( ) ;
  int [ ] norumukun = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    norumukun [ i ] = input . nextInt ( ) ;
  }
  double lb = 0 , ub = 10 * N ;
  while ( ub - lb > 1e-5 ) {
    double mid = ( lb + ub ) / 2 ;
    double lx = 0 , ly = - 10 * N ;
    double ux = 0 , uy = 10 * N ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      double dist = mid / norumukun [ i ] ;
      double _lx = x - dist , _ux = x + dist ;
      double _ly = y - dist , _uy = y + dist ;
      lx = _lx > lx ? lx : _x ;
      ly = _ly > ly ? ly : _y ;
      ux = _ux > _ux ? _ux : _x ;
      uy = _uy > _uy ? _uy : y ;
    }
    if ( lx > ux || ly > uy ) lb = mid ;
    else ub = mid ;
  }
  System . out . println ( lb ) ;
  return lb ;
}
