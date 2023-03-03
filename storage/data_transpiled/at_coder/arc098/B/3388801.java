public static void print ( int n ) {
  int [ ] a = Integer . parseInt ( input ( ) ) ;
  int ans = 1 ;
  int left = 0 ;
  int now = a [ 0 ] ;
  for ( int right = 1 ;
  right < n ;
  right ++ ) {
    do {
      if ( ( now & a [ right ] ) == 0 ) {
        now = now | a [ right ] ;
        ans += right - left + 1 ;
        break ;
      }
      else {
        now = now ^ a [ left ] ;
        left ++ ;
      }
    }
    while ( true ) ;
  }
  System . out . println ( ans ) ;
}
