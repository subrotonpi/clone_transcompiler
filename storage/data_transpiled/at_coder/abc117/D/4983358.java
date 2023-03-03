public static int solve ( int n , int k , int [ ] a ) {
  int [ ] x = new int [ 50 ] ;
  for ( int i = 0 ;
  i < x . length ;
  i ++ ) x [ i ] = 2 * i ;
  int ans = 0 ;
  for ( int x_i : x ) {
    int u = 0 , v = 0 ;
    for ( int a_j : a ) {
      u += x_i ^ ( x_i & a_j ) ;
      v += ( x_i & a_j ) ;
    }
    if ( ( x_i <= k ) && ( u > v ) ) {
      k -= x_i ;
      ans += u ;
    }
    else {
      ans += v ;
    }
  }
  return ans ;
}
