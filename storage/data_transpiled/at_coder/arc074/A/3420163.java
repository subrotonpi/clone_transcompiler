public static int H = Integer . parseInt ( input ) {
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  int ret = 10 * 9 ;
  for ( int h = 1 ;
  h <= H ;
  h ++ ) {
    int w = W / 2 ;
    int s1 = h * W ;
    int s2 = ( H - h ) * w ;
    int s3 = ( H - h ) * ( W - w ) ;
    ret = Math . min ( ret , Math . max ( s1 , s2 , s3 ) - Math . min ( s1 , s2 , s3 ) ) ;
    int hh = ( H - h ) / 2 ;
    int s1 = h * W ;
    int s2 = hh * W ;
    int s3 = ( H - h - hh ) * W ;
    ret = Math . min ( ret , Math . max ( s1 , s2 , s3 ) - Math . min ( s1 , s2 , s3 ) ) ;
  }
  for ( int w = 1 ;
  w <= W ;
  w ++ ) {
    int h = H / 2 ;
    int s1 = w * H ;
    int s2 = ( W - w ) * h ;
    int s3 = ( W - w ) * ( H - h ) ;
    ret = Math . min ( ret , Math . max ( s1 , s2 , s3 ) - Math . min ( s1 , s2 , s3 ) ) ;
  }
  System . out . println ( ret ) ;
  return ret ;
}
