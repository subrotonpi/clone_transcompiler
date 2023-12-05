public static double l ( double x , double y , double s , double d ) {
  double ans ;
  for ( int i = 0 ;
  i < input . length ;
  i ++ ) {
    ans = ( d - s ) / ( x + y ) ;
  }
  else {
    ans = ( d - s + l ) / ( x + y ) ;
  }
  if ( x < y ) {
    if ( s >= d ) ans = Math . min ( ans , ( s - d ) / ( y - x ) ) ;
    else ans = Math . min ( ans , ( l - d + s ) / ( y - x ) ) ;
  }
  return ans ;
}
