@ VisibleForTesting static double ceil ( double input ) {
  int H = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  double ans = Double . POSITIVE_INFINITY ;
  for ( int h = 1 ;
  h <= H ;
  h ++ ) {
    double m = Math . min ( h * W , ( H - h ) * ( W / 2 ) ) ;
    double M = Math . max ( h * W , ( H - h ) * ( W / 2 ) ) ;
    ans = Math . min ( ans , M - m ) ;
    m = Math . min ( h * W , ( ( H - h ) / 2 ) * ( W ) ) ;
    M = Math . max ( h * W , ( ( H - h ) / 2 ) * ( W ) ) ;
    ans = Math . min ( ans , M - m ) ;
  }
  for ( int w = 1 ;
  w <= W ;
  w ++ ) {
    double m = Math . min ( w * H , ( W - w ) * ( H / 2 ) ) ;
    double M = Math . max ( w * H , ( W - w ) * ( W / 2 ) ) ;
    ans = Math . min ( ans , M - m ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
