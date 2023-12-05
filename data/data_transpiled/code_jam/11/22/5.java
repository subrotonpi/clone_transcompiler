public static double calc ( List < Point > pts , double minDist ) {
  double nextPos = - 10e7 ;
  double maxDelta = 0 ;
  double islandDelta = 0 ;
  for ( int i = 0 ;
  i < pts . size ( ) ;
  i ++ ) {
    double pos = pts . get ( i ) . getX ( ) ;
    int count = pts . get ( i ) . getCount ( ) ;
    if ( pos > nextPos ) {
      maxDelta = Math . max ( islandDelta , maxDelta ) ;
      islandDelta = ( count - 1 ) * minDist ;
      nextPos = pos + count * minDist ;
    }
    else {
      double lastPos = nextPos + ( count - 1 ) * minDist ;
      double delta = lastPos - pos ;
      islandDelta = Math . max ( delta , islandDelta ) ;
      nextPos = lastPos + minDist ;
    }
  }
  maxDelta = Math . max ( islandDelta , maxDelta ) ;
  return maxDelta / 2.0 ;
}
