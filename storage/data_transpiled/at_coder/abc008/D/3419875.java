public static int dNuggetGame ( int W , int H , int N , int [ ] [ ] M ) {
  /* dp */
  if ( l > r || t > b ) {
    return 0 ;
  }
  Integer key = new Integer ( l ) ;
  if ( memo . containsKey ( key ) ) {
    return memo . get ( key ) ;
  }
  memo . put ( key , 0 ) ;
  for ( int i = 0 ;
  i < M . length ;
  i ++ ) {
    int x = M [ i ] [ 0 ] ;
    int y = M [ i ] [ 1 ] ;
    if ( l <= x && x <= r && t <= y && y <= b ) {
      memo . put ( key , Math . max ( memo . get ( key ) , r - l + b - t + 1 + dp ( l , x - 1 , t , y - 1 ) + dp ( x + 1 , r , y + 1 , b ) ) ) ;
    }
  }
  memo . clear ( ) ;
  int ans = dp ( 1 , W , 1 , H ) ;
  return ans ;
}
