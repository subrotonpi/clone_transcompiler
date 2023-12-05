public static int H = Integer . parseInt ( input ) {
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( ( H * W ) % 3 == 0 ) {
    System . out . println ( 0 ) ;
  }
  else {
    int s = 10 * 10 ;
    int t = 10 * 10 ;
    for ( int i = 0 ;
    i < H ;
    i ++ ) {
      int x = Math . max ( Math . abs ( W * i - ( H - i ) * ( W / 2 ) ) , Math . abs ( W * i - ( H - i ) * ( W / 2 + W % 2 ) ) ) ;
      int y = Math . max ( Math . abs ( W * i - W * ( ( H - i ) / 2 ) ) , Math . abs ( W * i - W * ( ( H - i ) / 2 + ( H - i ) % 2 ) ) ) ;
      int b = Math . min ( x , y ) ;
      if ( b <= s ) {
        s = b ;
      }
      else {
        break ;
      }
    }
    for ( int j = 0 ;
    j < W ;
    j ++ ) {
      int v = Math . max ( Math . abs ( H * j - ( W - j ) * ( H / 2 ) ) , Math . abs ( H * j - ( W - j ) * ( H / 2 + H % 2 ) ) ) ;
      int w = Math . max ( Math . abs ( H * j - H * ( ( W - j ) / 2 ) ) , Math . abs ( H * j - H * ( ( W - j ) / 2 + ( W - j ) % 2 ) ) ) ;
      int c = Math . min ( v , w ) ;
      if ( c <= t ) {
        t = c ;
      }
      else {
        break ;
      }
    }
    System . out . println ( Math . min ( s , t ) ) ;
  }
  return s ;
}
