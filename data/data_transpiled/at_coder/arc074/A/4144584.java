public static double calculate ( int H , int W ) {
  double ans = Double . MIN_VALUE ;
  for ( int w = 1 ;
  w <= W - 1 ;
  w ++ ) {
    int s1 = H * w ;
    int w2 = ( W - w ) / 2 ;
    int s2 = H * w2 ;
    int s3 = H * ( W - ( w + w2 ) ) ;
    int calc = Math . max ( s1 , s2 , s3 ) - Math . min ( s1 , s2 , s3 ) ;
    ans = Math . min ( ans , calc ) ;
    int h2 = H / 2 ;
    s2 = h2 * ( W - w ) ;
    s3 = ( H - h2 ) * ( W - w ) ;
    calc = Math . max ( s1 , s2 , s3 ) - Math . min ( s1 , s2 , s3 ) ;
    ans = Math . min ( ans , calc ) ;
  }
  H = W ;
  for ( int w = 1 ;
  w <= W - 1 ;
  w ++ ) {
    int s1 = H * w ;
    int w2 = ( W - w ) / 2 ;
    int s2 = H * w2 ;
    int s3 = H * ( W - ( w + w2 ) ) ;
    int calc = Math . max ( s1 , s2 , s3 ) - Math . min ( s1 , s2 , s3 ) ;
    ans = Math . min ( ans , calc ) ;
  }
  if ( ( H == 2 ) && ( W == 2 ) ) {
    ans = 1 ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
