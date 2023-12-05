public static int N ( ) {
  int ans = ( N / 11 ) * 2 ;
  if ( ( N % 11 > 6 ) ) {
    ans += 2 ;
  }
  else if ( ( N % 11 > 0 ) ) {
    ans += 1 ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
