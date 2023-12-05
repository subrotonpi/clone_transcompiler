public static int tn = Integer . parseInt ( Scanner in ) {
  for ( int loop = 0 ;
  loop < tn ;
  loop ++ ) {
    int R = Integer . parseInt ( in . nextLine ( ) . trim ( ) ) ;
    int k = Integer . parseInt ( in . nextLine ( ) . trim ( ) ) ;
    int N = Integer . parseInt ( in . nextLine ( ) . trim ( ) ) ;
    int [ ] g = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) g [ i ] = Integer . parseInt ( in . nextLine ( ) . trim ( ) ) ;
    int [ ] next = new int [ N ] ;
    int [ ] cost = new int [ N ] ;
    int s = 0 ;
    for ( int i : xrange ( N ) ) {
      s += g [ i ] ;
      if ( s > k ) {
        s -= g [ i ] ;
        next [ 0 ] = i ;
        cost [ 0 ] = s ;
        break ;
      }
    }
    else {
      System . out . println ( "Case #" + ( loop + 1 ) + ": " + R * s ) ;
      continue ;
    }
    for ( int i : xrange ( 1 , N ) ) {
      s = cost [ i - 1 ] - g [ i - 1 ] ;
      for ( int j : xrange ( 1 , N + 1 ) ) {
        int q = next [ i - 1 ] + j - 1 ;
        q %= N ;
        s += g [ q ] ;
        if ( s > k ) {
          s -= g [ q ] ;
          next [ i ] = q ;
          cost [ i ] = s ;
          break ;
        }
      }
    }
    Map < Integer , Integer > map = new HashMap < Integer , Integer > ( ) ;
    int x = 0 ;
    int s = 0 ;
    int l = 0 ;
    int startCycle = - 1 ;
    int costsum = 0 ;
    for ( int i : xrange ( Math . min ( N + 1 , R ) ) ) {
      costsum += cost [ x ] ;
      if ( map . containsKey ( x ) ) {
        startCycle = x ;
        int ss = map . get ( x ) ;
        int ll = map . get ( x ) ;
        int startCycleLen = ll ;
        startCycleCost = ss ;
        int cycleCost = s - ss ;
        cycleLen = l - ll ;
        break ;
      }
      map . put ( x , new Integer ( s ) ) ;
      s += cost [ x ] ;
      l ++ ;
      x = next [ x ] ;
    }
    