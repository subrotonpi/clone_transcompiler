public static void main ( String input , int n , int a , int b , int c , int d ) {
  int res = 0 ;
  int r = b - a ;
  for ( int k = 1 ;
  k < n ;
  k ++ ) {
    int s1 = k * c - d * ( n - 1 - k ) ;
    int t1 = k * c - c * ( n - 1 - k ) ;
    if ( s1 <= r && r <= t1 ) {
      res = 1 ;
      break ;
    }
    s1 = k * d - d * ( n - 1 - k ) ;
    t1 = k * d - c * ( n - 1 - k ) ;
    if ( s1 <= r && r <= t1 ) {
      res = 1 ;
      break ;
    }
  }
  if ( res == 1 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
