public static int T = Integer . parseInt ( Scanner in ) {
  for ( int repeat = 0 ;
  repeat < T ;
  repeat ++ ) {
    String [ ] data = in . nextLine ( ) . split ( " " ) ;
    int L = Integer . parseInt ( data [ 0 ] ) ;
    int t = Integer . parseInt ( data [ 1 ] ) ;
    int N = Integer . parseInt ( data [ 2 ] ) ;
    int C = Integer . parseInt ( data [ 3 ] ) ;
    int [ ] a = new int [ 4 ] ;
    for ( int i = 0 ;
    i < a . length ;
    i ++ ) {
      a [ i ] = Integer . parseInt ( data [ i ] ) ;
    }
    int circlesum = 0 ;
    for ( int i : xrange ) {
      circlesum += a [ i ] ;
    }
    int [ ] disset = new int [ a . length ] ;
    for ( int i = 0 ;
    i < disset . length ;
    i ++ ) {
      disset [ i ] = N / C ;
      if ( i < N % C ) disset [ i ] ++ ;
    }
    int totaltime = 0 ;
    for ( int i = 0 ;
    i < a . length ;
    i ++ ) {
      totaltime += a [ i ] * disset [ i ] * 2 ;
    }
    if ( t >= totaltime ) {
      System . out . println ( "Case #" + ( repeat + 1 ) + ": " + totaltime ) ;
      continue ;
    }
    int passed = t / circlesum / 2 ;
    for ( int i = 0 ;
    i < disset . length ;
    i ++ ) {
      disset [ i ] -= passed ;
    }
    int timeleft = t - circlesum * passed * 2 ;
    for ( int stopi = 0 ;
    stopi < a . length ;
    stopi ++ ) {
      timeleft -= a [ stopi ] * 2 ;
      disset [ stopi ] -- ;
      if ( timeleft <= 0 ) break ;
      int disout = - timeleft / 2 ;
      if ( disout > 0 ) {
        a [ i ] = disout ;
        disset [ stopi ] = 1 ;
      }
      int j = 0 ;
      while ( j < a . length ) {
        if ( disset [ j ] == 0 ) {
          System . arraycopy ( a , j , disset , 1 , disout ) ;
          System . arraycopy ( disset , 0 , disset , 1 , disout ) ;
        }
        j ++ ;
      }
    }
    totaltime = t ;
    while ( L >