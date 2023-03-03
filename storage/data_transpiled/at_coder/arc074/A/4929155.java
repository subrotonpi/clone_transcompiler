public static void main ( String input ) {
  int h = Integer . parseInt ( input ) ;
  int w = Integer . parseInt ( input ) ;
  int ans = 10 * 9 ;
  ans = Math . min ( ans , ( h / 3 + Math . min ( 1 , h % 3 ) ) * w - ( h / 3 ) * w ) ;
  ans = Math . min ( ans , ( w / 3 + Math . min ( 1 , w % 3 ) ) * h - ( w / 3 ) * h ) ;
  for ( int i = 1 ;
  i <= h / 2 ;
  i ++ ) {
    int s1 = i * w ;
    int s2 = ( h - i ) * ( w / 2 ) ;
    int s3 = ( h - i ) * ( w / 2 + w % 2 ) ;
    ans = Math . min ( ans , Math . max ( s1 , s2 , s3 ) - Math . min ( s1 , s2 , s3 ) ) ;
  }
  for ( int i = 1 ;
  i <= w / 2 ;
  i ++ ) {
    int s1 = i * h ;
    int s2 = ( w - i ) * ( h / 2 ) ;
    int s3 = ( w - i ) * ( h / 2 + h % 2 ) ;
    ans = Math . min ( ans , Math . max ( s1 , s2 , s3 ) - Math . min ( s1 , s2 , s3 ) ) ;
  }
  System . out . println ( ans ) ;
}
