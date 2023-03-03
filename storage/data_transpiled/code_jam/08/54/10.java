public static void input ( Scanner in ) {
  int n = in . nextInt ( ) ;
  for ( loop = 1 ;
  loop <= n ;
  loop ++ ) {
    System . out . printf ( "Case #%d:" , loop ) ;
    int H = in . nextInt ( ) ;
    int W = in . nextInt ( ) ;
    int R = in . nextInt ( ) ;
    HashMap < Point , Integer > os = new HashMap < Point , Integer > ( ) ;
    for ( int i : xrange ( R ) ) {
      int x = in . nextInt ( ) , y = in . nextInt ( ) ;
      x -- ;
      y -- ;
      int X = x ;
      int Y = y ;
      if ( ( x + y ) % 3 == 0 ) {
        int m = x + y ;
        int h = m / 3 ;
        x = y - h ;
        if ( x >= 0 && x <= h ) os . put ( new Point ( X , Y ) , 1 ) ;
      }
    }
    int [ ] [ ] b = new int [ 100 ] [ 100 ] ;
    int [ ] q = new int [ 2 ] ;
    b [ 0 ] [ 0 ] = 1 ;
    HashMap < Point , Integer > visit = new HashMap < Point , Integer > ( ) ;
    if ( ( H - 1 + W - 1 ) % 3 != 0 ) {
      System . out . println ( 0 ) ;
      continue ;
    }
    while ( q . length > 0 ) {
      Point x = q [ 0 ] ;
      b [ x . x ] [ x . y ] = b [ x . x ] [ x . y ] % 10007 ;
      if ( x . x == H - 1 && x . y == W - 1 ) {
        System . out . println ( b [ H - 1 ] [ W - 1 ] ) ;
        q [ 0 ] = 3 ;
        break ;
      }
      if ( visit . containsKey ( x ) ) continue ;
      visit . put ( x , 1 ) ;
      if ( ( x . x + 1 ) < H && x . y + 2 < W ) {
        b [ x . x + 1 ] [ x . y + 2 ] += b [ x . x ] [ x . y ] ;
        q [ 0 ] = ( x . x + 1 ) ;
      }
      if ( ( x . x + 2 ) < W && x . y + 2 < H && x . y + 1 < W ) {
        b [ x . x + 2 ] [ x . y + 1 ] += b [ x . x ] [