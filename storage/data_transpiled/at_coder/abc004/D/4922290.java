public static int getR ( int R , int G , int B ) {
  int ans = 10 * 10 ;
  for ( int gl = - 600 ;
  gl <= 301 ;
  gl ++ ) {
    int gr = gl + G - 1 ;
    int temp = 0 ;
    for ( int i = gl ;
    i <= gr ;
    i ++ ) temp += Math . abs ( i ) ;
    if ( ( R - 1 ) / 2 - 100 < gl ) {
      if ( R % 2 == 0 ) {
        for ( int i = 1 ;
        i <= R / 2 ;
        i ++ ) temp += i * 2 ;
        temp += R / 2 ;
      }
      else {
        for ( int i = 1 ;
        i <= R / 2 + 1 ;
        i ++ ) temp += i * 2 ;
      }
    }
    else {
      int rr = gl - 1 ;
      int rl = rr - R + 1 ;
      for ( int i = rl ;
      i <= rr ;
      i ++ ) temp += Math . abs ( i + 100 ) ;
    }
    if ( 100 - ( B - 1 ) / 2 > gr ) {
      if ( B % 2 == 0 ) {
        for ( int i = 1 ;
        i <= B / 2 ;
        i ++ ) temp += i * 2 ;
        temp += B / 2 ;
      }
      else {
        for ( int i = 1 ;
        i <= B / 2 + 1 ;
        i ++ ) temp += i * 2 ;
      }
    }
    else {
      int bl = gr + 1 ;
      int br = bl + B - 1 ;
      for ( int i = bl ;
      i <= br ;
      i ++ ) temp += Math . abs ( i - 100 ) ;
    }
    ans = Math . min ( temp , ans ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
