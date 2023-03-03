@ Test public static String d_make_them_even ( int H , int W , String [ ] [ ] A ) {
  int [ ] [ ] grid = new int [ H ] [ W ] ;
  for ( int row = 0 ;
  row < grid . length ;
  row ++ ) {
    grid [ row ] = A [ row ] ;
  }
  String [ ] ans_tmp = new String [ H ] ;
  for ( int h = 0 , w = 0 ;
  h < H ;
  h ++ , w ++ ) {
    if ( grid [ h ] [ w ] % 2 == 1 ) {
      for ( int dh = 0 ;
      dh < 1 ;
      dh ++ ) {
        for ( int dw = 1 ;
        dw < 1 ;
        dw ++ ) {
          if ( 0 <= h + dh && h + dh < H && 0 <= w + dw && w + dw < W ) {
            grid [ h + dh ] [ w + dw ] ++ ;
            grid [ h + dh ] [ w ] -- ;
            ans_tmp [ h + dh ] = " " + grid [ w + dw ] ;
            break ;
          }
        }
      }
    }
  }
  return ans_tmp . toString ( ) ;
}
