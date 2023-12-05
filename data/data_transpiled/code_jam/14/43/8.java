static int max_flow ( int [ ] [ ] c , int source , int sink ) {
  int n = c . length ;
  Map < Integer , Boolean > dc = Maps . newHashMap ( ) ;
  Map < Integer , Integer > df = Maps . newHashMap ( ) ;
  int [ ] [ ] a = new int [ n ] [ n + 1 ] ;
  for ( int x : xrange ( n ) ) {
    for ( int y = 0 ;
    y < c [ x ] . length ;
    y ++ ) {
      dc . put ( new Integer ( x ) , 1 ) ;
      dc . put ( new Integer ( y ) , 0 ) ;
      df . put ( new Integer ( y ) , 0 ) ;
      a [ x ] [ y ] = 1 ;
      a [ y ] [ x ] = 1 ;
    }
  }
  int n = n + 1 ;
  int h = 0 ;
  for ( int x : xrange ( w ) ) {
    if ( ! river [ x ] [ y ] ) continue ;
    c [ n + 1 ] [ x ] = false ;
  }
  int [ ] [ ] tc = new int [ n ] [ ] ;
  for ( int x : xrange ( total ) ) {
    for ( int y : xrange ( h ) ) {
      if ( ! river [ x ] [ y ] ) continue ;
      int t = x * h + y ;
      c [ t ] [ x ] = true ;
      int [ ] path = new int [ n ] ;
      for ( int z : xrange ( 4 ) ) {
        int tx = x + z ;
        int ty = y + z ;
        if ( ( tx >= 0 ) && ( ty >= 0 ) && ( ty < h ) && ( river [ tx ] [ ty ] ) ) {
          c [ n + t ] [ y ] = false ;
        }
      }
      for ( int z : xrange ( h ) ) {
        int ty = y + z ;
        if ( ( ty >= 0 ) && ( river [ x ] [ y ] ) ) continue ;
        int n = n ;
        int h = n ;
        for ( int i = 0 ;
        i < n ;
        i ++ ) {
          int x = x + z ;
          int bestAnswer = max_flow ( tc , source , sink ) ;
          ouf . println ( "" + bestAnswer ) ;
          System . out . println ( "" + x ) ;
        }
      }
    }
  }
  int res = 0 ;
  while ( true ) {
    int fr = - 1 ;
    boolean visit [ ] = new boolean [ n ] ;
    for ( int i = 0 ;
    i