public static double print ( double H , double W ) {
  double ans = Double . MIN_VALUE ;
  double k ;
  for ( int h = 1 ;
  h < H ;
  h ++ ) {
    if ( ( H - h ) % 2 == 0 ) {
      k = Math . max ( h * W , ( H - h ) * W / 2 ) - Math . min ( h * W , ( H - h ) * W / 2 ) ;
      if ( ans > k ) ans = k ;
    }
  }
  System . out . println ( ans ) ;
  for ( int w = 1 ;
  w < W ;
  w ++ ) {
    if ( ( W - w ) % 2 == 0 ) {
      k = Math . max ( w * H , ( W - w ) * H / 2 ) - Math . min ( w * W , ( W - w ) * W ) ;
      if ( ans > k ) ans = k ;
    }
    else {
      k = Math . max ( w * H , ( ( W - w ) * W ) * H ) - Math . min ( w * W , ( W - w ) * W ) ;
      if ( ans > k ) ans = k ;
    }
  }
  for ( int h = 1 ;
  h < H ;
  h ++ ) {
    if ( W % 2 == 0 ) {
      l = Math . max ( h * W , ( H - h ) * W / 2 ) - Math . min ( h * W , ( H - h ) * W / 2 ) ;
      if ( ans > l ) ans = l ;
    }
    else {
      l = Math . max ( w * H , ( W - w ) * W ) - Math . min ( h * W , ( H - h ) * W / 2 ) ;
      if ( ans > l ) ans = l ;
    }
  }
  for ( int w = 1 ;
  w < W ;
  w ++ ) {
    if ( H % 2 == 0 ) {
      l = Math . max ( h * W , ( H - w ) * W / 2 ) - Math . min ( h * W , ( H - w ) * W / 2 ) ;
      if ( ans > l ) ans = l ;
    }
  }
  return ans ;
}
