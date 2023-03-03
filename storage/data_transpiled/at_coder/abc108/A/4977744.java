public static int n ( ) {
  int ans ;
  ans = 0 ;
  if ( n % 2 == 0 ) {
    ans = ( int ) ( ( n / 2 ) * ( n / 2 ) ) ;
  }
  else {
    ans = ( int ) ( n / 2 ) * ( n / 2 + 1 ) ;
  }
  return ans ;
}
