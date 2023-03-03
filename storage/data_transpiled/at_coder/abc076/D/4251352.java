public static double calcArea ( double vEnd , double vStart , double vMax , double dt ) {
  double koutenV = ( vEnd + vStart + dt ) / 2 ;
  double koutenT = koutenV - vStart ;
  double koutenTLimit1 = Math . max ( vMax - vStart , 0 ) ;
  double koutenTLimit2 = Math . min ( vEnd + dt - vMax , dt ) ;
  double area ;
  if ( 0 < koutenT && koutenT < dt ) {
    area = ( vStart + koutenV ) * koutenT / 2 ;
    area += ( vEnd + koutenV ) * ( dt - koutenT ) / 2 ;
    area -= ( koutenTLimit2 - koutenTLimit1 ) * Math . max ( 0 , ( koutenV - vMax ) ) / 2 ;
  }
  else {
    area = ( vStart + vEnd ) * dt / 2 ;
  }
  return area ;
}
int n = Integer . parseInt ( input ( ) ) ;
int [ ] t = new int [ n ] ;
for ( int i = 0 ;
i < n ;
i ++ ) {
  t [ i ] = Integer . parseInt ( input ( ) ) ;
}
int [ ] v = new int [ n ] ;
for ( int i = 0 ;
i < n ;
i ++ ) {
  v [ i ] = Integer . parseInt ( input ( ) ) ;
}
int [ ] maxVelocity = new int [ n ] ;
maxVelocity [ 0 ] = 0 ;
for ( int i = 1 ;
i < n ;
i ++ ) {
  int maxVelocity_ = Math . min ( v [ i - 1 ] , v [ i ] , maxVelocity [ i - 1 ] + t [ i - 1 ] , Integer . MAX_VALUE - Integer . MAX_VALUE ) ;
  maxVelocity [ i ] = maxVelocity_ ;
}
maxVelocity [ 0 ] = 0 ;
int ok = 0 ;
while ( ok == 0 ) {
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    if ( Math . abs ( ( maxVelocity [ i + 1 ] - maxVelocity [ i ] ) / t [ i ] ) > 1 ) {
      maxVelocity [ i ] = maxVelocity [ i ] - 1 ;
      break ;
    }
  }
  else {
    ok = 1 ;
  }
}
double ans = 0 ;
for ( int i = 0 ;
