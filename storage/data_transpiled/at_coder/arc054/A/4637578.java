public static int l ( int x , int y , int s , int d ) {
  int ans ;
  if ( x >= y ) {
    ans = ( ( d - s ) % l ) / ( x + y ) ;
  }
  else {
    int t1 = ( ( d - s ) % l ) / ( x + y ) ;
    int t2 = ( l - ( ( d - s ) % l ) ) / ( y - x ) ;
    ans = Math . min ( t1 , t2 ) ;
  }
  return ans ;
}
