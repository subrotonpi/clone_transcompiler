public static void print ( int N ) {
  int [ ] A = Integer . parseInt ( input ( ) ) ;
  int ans = 0 ;
  int right = 0 ;
  int total = 0 ;
  for ( int left = 0 ;
  left < N ;
  left ++ ) {
    while ( right < N && total ^ A [ right ] == total + A [ right ] ) {
      total += A [ right ] ;
      right ++ ;
    }
    ans += right - left ;
    if ( left == right ) {
      right ++ ;
    }
    else {
      total -= A [ left ] ;
    }
  }
  System . out . println ( ans ) ;
}
