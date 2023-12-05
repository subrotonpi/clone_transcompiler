@ VisibleForTesting static void readDistance ( String input ) {
  int H = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  String [ ] [ ] C = new String [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    String [ ] row = input . split ( " " ) ;
    if ( row [ 0 ] . contains ( "s" ) ) {
      int sx = row [ 0 ] . indexOf ( "s" ) ;
      int sy = row [ 1 ] . indexOf ( "s" ) ;
      if ( sx < 0 ) {
        sx = row [ 0 ] . indexOf ( "s" ) ;
        sy = row [ 1 ] . indexOf ( "s" ) ;
      }
    }
  }
  PriorityQueue < Integer > q = new PriorityQueue < Integer > ( ) ;
  q . add ( new Integer ( 0 ) ) ;
  q . add ( new Integer ( sx ) ) ;
  q . add ( new Integer ( sy ) ) ;
  int INF = H * W * 999 ;
  int [ ] [ ] dist = new int [ W ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    dist [ i ] [ 0 ] = INF ;
    dist [ i ] [ 1 ] = INF ;
    dist [ i ] [ 2 ] = INF ;
    dist [ i ] [ 3 ] = INF ;
    dist [ i ] [ 4 ] = INF ;
  }
  int [ ] dxy = {
    dxy [ 0 ] [ 1 ] , dxy [ 2 ] [ 3 ] }
    ;
    for ( int i = 0 ;
    i < H ;
    i ++ ) {
      dxy [ i ] [ 0 ] = dxy [ i ] ;
      dxy [ 3 ] [ 4 ] = 1 ;
      dist [ i ] [ 5 ] = INF ;
      dist [ i ] [ 6 ] = INF ;
      dist [ i ] [ 7 ] = INF ;
      dist [ i ] [ 8 ] = INF ;
      dist [ i ] [ 9 ] = INF ;
    }
    while ( q . size ( ) > 0 ) {
      int d = q . poll ( ) ;
      int x = q . poll ( ) ;
      int y = q . poll ( ) ;
      for ( int i = 0 ;
      i < H ;
      i ++ ) {
        int nx = x + dx ;
        int ny = y + dy ;
        if ( i > 0 ) {
          nx = x + dx ;
        }
        if ( i > 0 ) {
          x = x + dx ;
        }
        