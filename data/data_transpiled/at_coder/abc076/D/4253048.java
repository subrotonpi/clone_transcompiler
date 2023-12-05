public static double calcArea ( double vEnd , double vStart , double vMax , double dt ) {
  double koutenV = ( vEnd + vStart + dt ) / 2 ;
  double koutenT = koutenV - vStart ;
  double area ;
  if ( 0 < koutenT && koutenT < dt ) {
    area = ( vStart + koutenV ) * koutenT / 2 ;
    area += ( vEnd + koutenV ) * ( dt - koutenT ) / 2 ;
    area -= Math . max ( 0 , ( koutenV - vMax ) ) * Math . pow ( 2 , koutenT ) ;
  }
  else {
    area = ( vStart + vEnd ) * dt / 2 ;
  }
  return area ;
}
