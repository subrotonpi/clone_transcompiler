public static String d_bigbang ( int N , int [ ] [ ] A , int [ ] [ ] B ) {
  /* Distance between the first two numbers */
  double dist2 = ( x2 - x1 ) * ( x2 - x1 ) + ( y2 - y1 ) * ( y2 - y1 ) ;
  double gx_a = 0 , gy_a = 0 , gx_b = 0 , gy_b = 0 ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    gx_a += A [ i ] [ 0 ] ;
    gy_a += B [ i ] [ 0 ] ;
  }
  for ( int i = 0 ;
  i < B . length ;
  i ++ ) {
    gx_b += B [ i ] [ 0 ] ;
    gy_b += B [ i ] [ 1 ] ;
  }
  gx_a /= N ;
  gy_a /= N ;
  gy_b /= N ;
  double dist_a = 0 ;
  dist_b = 0 ;
  return ans ;
}
