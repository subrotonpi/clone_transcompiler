@ VisibleForTesting static int [ ] [ ] createMaze ( ) {
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  List < String > maze = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    maze . add ( input . nextLine ( ) ) ;
  }
  int whitePanelCnt = 0 ;
  for ( int y = 0 ;
  y < H ;
  y ++ ) {
    for ( int x = 0 ;
    x < W ;
    x ++ ) {
      if ( maze . get ( y ) . charAt ( x ) == '.' ) whitePanelCnt ++ ;
    }
  }
  Queue < Integer > que = new LinkedList < > ( ) ;
  int sx = ( 0 , 0 ) ;
  int sy = ( W - 1 , H - 1 ) ;
  int gx = ( H - 1 , W - 1 ) ;
  int gy = ( H - 1 , H - 1 ) ;
  que . add ( new Integer ( sx ) ) ;
  int [ ] [ ] distanceFromStart = new int [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    distanceFromStart [ i ] [ 0 ] = - 1 ;
  }
  distanceFromStart [ sy ] [ sx ] = 0 ;
  int [ ] [ ] move = {
    {
      1 , 0 }
      , {
        - 1 , 0 }
        , {
          0 , 1 }
          , {
            0 , - 1 }
          }
          ;
          /* Minimum distance */
          while ( que . size ( ) != 0 ) {
            int x = que . poll ( ) ;
            int y = que . poll ( ) ;
            if ( x == gx && y == gy ) return distanceFromStart [ y ] [ x ] ;
            for ( int i = 0 ;
            i < 4 ;
            i ++ ) {
              int nextX = x + move [ i ] [ 0 ] ;
              int nextY = y + move [ i ] [ 1 ] ;
              if ( nextX < 0 || nextX >= W || nextY < 0 || nextY >= H || distanceFromStart [ nextY ] [ nextX ] != - 1 || maze . get ( nextY ) . charAt ( nextX ) == '#' ) continue ;
              distanceFromStart [ nextY ] [ nextX ] = distanceFromStart [ y ] [ x ] + 1 ;
              que . add ( new Integer ( nextX ) ) ;
            }
          }
          int