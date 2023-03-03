public static void inpl ( Scanner in ) {
  int H = in . nextInt ( ) ;
  int W = in . nextInt ( ) ;
  int [ ] [ ] A = new int [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    A [ i ] = in . nextInt ( ) ;
  }
  /* pos (n) */
  int q = in . nextInt ( ) ;
  int m = in . nextInt ( ) ;
  if ( q % 2 != 0 ) {
    m = ( W - 1 ) - m ;
  }
  /* ans = [ h + 1 + w + 1 ] */
  int [ ] [ ] ans = new int [ 4 ] [ 4 ] ;
  int f = 0 ;
  int hn = 0 , wn = 0 ;
  for ( int n = 0 ;
  n < H * W - 1 ;
  n ++ ) {
    int h = hn , w = wn ;
    hn = in . nextInt ( ) ;
    wn = in . nextInt ( ) ;
    if ( ( f + A [ h ] [ w ] ) % 2 != 0 ) {
      ans [ n ] [ 0 ] = h + 1 ;
      ans [ n ] [ 1 ] = w + 1 ;
      ans [ n ] [ 2 ] = hn + 1 ;
      ans [ n ] [ 3 ] = wn + 1 ;
      f = 1 ;
    }
    else {
      f = 0 ;
    }
  }
  System . out . println ( ans . length ) ;
  for ( int [ ] rec : ans ) {
    System . out . println ( rec [ 0 ] + " " + rec [ 1 ] + " " + rec [ 2 ] + " " + rec [ 3 ] ) ;
  }
}
