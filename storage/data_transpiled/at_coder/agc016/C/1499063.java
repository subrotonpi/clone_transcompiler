public static int H = Integer . parseInt ( input ) {
  int W = Integer . parseInt ( input . readLine ( ) ) ;
  int h = Integer . parseInt ( input . readLine ( ) ) ;
  int w = Integer . parseInt ( input . readLine ( ) ) ;
  if ( W % w == 0 && H % h == 0 ) {
    System . out . println ( "No" ) ;
  }
  else {
    boolean swapped = false ;
    if ( W % w == 0 ) {
      H = W ;
      W = H ;
      h = w ;
      w = h ;
      swapped = true ;
    }
    int [ ] [ ] a = new int [ W ] [ H ] ;
    for ( int y = 0 ;
    y < H ;
    y ++ ) {
      for ( int x = 0 ;
      x < W ;
      x += w ) {
        a [ y ] [ x ] = W ;
      }
      for ( int x = w - 1 ;
      x < W ;
      x += w ) {
        a [ y ] [ x ] = - W - 1 ;
      }
    }
    if ( swapped ) {
      H = W ;
      W = H ;
      h = w ;
      w = h ;
    }
    int [ ] [ ] b = a ;
    a = new int [ H ] [ W ] ;
    for ( int y = 0 ;
    y < H ;
    y ++ ) {
      for ( int x = 0 ;
      x < W ;
      x ++ ) {
        a [ y ] [ x ] = b [ x ] [ y ] ;
      }
    }
  }
  System . out . println ( "Yes" ) ;
  for ( int y = 0 ;
  y < H ;
  y ++ ) {
    System . out . println ( ( int ) a [ y ] [ y ] ) ;
  }
  return H ;
}
