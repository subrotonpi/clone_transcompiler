@ VisibleForTesting static int getShortestStep ( ) {
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  char [ ] [ ] areaInfo = new char [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    areaInfo [ i ] = input . toCharArray ( ) ;
  }
  boolean [ ] [ ] isVisit = new boolean [ W ] [ H ] ;
  for ( int i = 0 ;
  i < W ;
  i ++ ) {
    isVisit [ i ] [ i ] = false ;
  }
  Queue < Integer > nextSearch = new LinkedList < Integer > ( ) ;
  nextSearch . add ( new Integer [ ] {
    0 , 0 , 0 }
    ) ;
    /* Get the shortest step */
    int shortestStep = - 1 ;
    while ( nextSearch . size ( ) > 0 ) {
      int nowx = nextSearch . poll ( ) ;
      int nowy = nextSearch . poll ( ) ;
      int nowStep = nextSearch . poll ( ) ;
      if ( isVisit [ nowx ] [ nowy ] ) {
        continue ;
      }
      isVisit [ nowx ] [ nowy ] = true ;
      for ( int stepx = 1 , stepy = 0 ;
      stepx < H ;
      stepx ++ , stepy ++ ) {
        int nextx = nowx + stepx ;
        int nexty = nowy + stepy ;
        if ( nextx == H - 1 && nexty == W - 1 ) {
          shortestStep = nowStep + 1 ;
          return shortestStep ;
        }
        if ( 0 <= nextx && nextx < H && 0 <= nexty && nexty < W ) {
          if ( isVisit [ nextx ] [ nexty ] || areaInfo [ nextx ] [ nexty ] == '#' ) {
            continue ;
          }
          nextSearch . add ( new Integer ( nextx ) ) ;
        }
      }
    }
    /* Get the shortest step */
    shortestStep = nextSearch . size ( ) ;
    final int c = c . indexOf ( "" ) ;
    if ( shortestStep == - 1 ) {
      System . out . println ( "-1" ) ;
    }
    else {
      System . out . println ( c . charAt ( c ) - shortestStep - 1 ) ;
    }
    return shortestStep ;
  }
  