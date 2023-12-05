public static int solve ( int a , int b , int c , int ans ) {
  if ( s . contains ( new Integer ( a ) ) ) {
    return - 1 ;
  }
  if ( ( a % 2 ) != 0 || ( b % 2 ) != 0 || ( c % 2 ) != 0 ) {
    return ans ;
  }
  s . add ( new Integer ( a ) ) ;
  a >>= 1 ;
  b >>= 1 ;
  c >>= 1 ;
  return solve ( b + c , c + a , a + b , ans + 1 ) ;
}
