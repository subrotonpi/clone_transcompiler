public static void print ( int n ) {
  int [ ] a = Integer . parseInt ( input ( ) ) ;
  int left = 0 ;
  int right = 0 ;
  int ans = 0 ;
  int s = 0 ;
  while ( left < n && right < n ) {
    while ( right < n ) {
      if ( s + a [ right ] == s ^ a [ right ] ) {
        s += a [ right ] ;
        ans += ( right - left + 1 ) ;
        right ++ ;
      }
      else break ;
    }
    if ( right > left ) {
      s -= a [ left ] ;
      left ++ ;
    }
    else {
      right ++ ;
      left ++ ;
    }
  }
  System . out . println ( ans ) ;
}
