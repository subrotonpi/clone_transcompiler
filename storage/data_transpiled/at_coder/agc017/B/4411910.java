public static String N , String A , String B , String C , String D ) {
  String ans = "NO" ;
  for ( int k = 0 ;
  k < N - 1 ;
  k ++ ) {
    if ( k * C - ( N - 1 - k ) * D <= B - A <= k * D - ( N - 1 - k ) * C ) {
      ans = "YES" ;
      break ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
