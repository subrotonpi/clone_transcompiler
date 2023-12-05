static final String solve ( ) throws IOException {
  if ( __name__ == "solve" ) {
    BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
    if ( args . length >= 2 ) {
      String fn = args [ 1 ] ;
      if ( fn != null ) {
        br = new BufferedReader ( new FileReader ( fn ) ) ;
      }
    }
    int T = Integer . parseInt ( br . readLine ( ) ) ;
    for ( int _T = xrange ( T ) ;
    _T < T ;
    _T ++ ) {
      int W = Integer . parseInt ( br . readLine ( ) ) ;
      int H = Integer . parseInt ( br . readLine ( ) ) ;
      int B = Integer . parseInt ( br . readLine ( ) ) ;
      int [ ] [ ] buildings = new int [ B ] [ ] ;
      for ( int i = xrange ( B ) ;
      i < B ;
      i ++ ) {
        buildings [ i ] = Integer . parseInt ( br . readLine ( ) ) ;
      }
      int [ ] [ ] grid = new int [ H ] [ W ] ;
      for ( int i = 0 ;
      i < grid . length ;
      i ++ ) {
        grid [ i ] [ 0 ] = 1 ;
      }
      for ( int i = 0 ;
      i < grid [ 0 ] . length ;
      i ++ ) {
        int x0 = buildings [ i ] [ 0 ] ;
        int y0 = buildings [ i ] [ 1 ] ;
        int x1 = buildings [ i ] [ 0 ] ;
        int y1 = buildings [ i ] [ 1 ] ;
        for ( int x = xrange ( x0 , x1 + 1 ) ;
        x < grid [ 0 ] . length ;
        x ++ ) {
          for ( int y = xrange ( y0 , y1 + 1 ) ;
          y < grid [ 0 ] . length ;
          y ++ ) {
            grid [ x ] [ y ] = 0 ;
          }
        }
      }
      int r = 0 ;
      for ( int sx = xrange ( W ) ;
      sx < grid . length ;
      sx ++ ) {
        if ( grid [ sx ] [ 0 ] == 0 ) {
          continue ;
        }
        int cx = sx , cy = 0 ;
        int dx = 0 , dy = 1 ;
        int [ ] visited = new int [ W ] ;
        do {
          visited [ -- height ] = ( cx + dx ) ;
          if ( cy == H - 1 ) {
            for ( int x = 0 ;
            x < visited [ -- height ] ;
            y ++ ) {
              grid [ x ] [ y ] = 0 ;
            }
            r ++ ;
            break ;
          }
        }
        dx = - dy