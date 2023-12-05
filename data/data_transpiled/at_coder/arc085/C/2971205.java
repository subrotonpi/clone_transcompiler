@ VisibleForTesting static int [ ] [ ] readFrom ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] P = Arrays . stream ( input . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int inf = 10 * 20 ;
  int [ ] [ ] table = new int [ N + 2 ] [ N + 2 ] ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    if ( P [ i - 1 ] > 0 ) {
      table [ i ] [ N + 1 ] = P [ i - 1 ] ;
    }
    else {
      table [ 0 ] [ i ] = - P [ i - 1 ] ;
    }
    for ( int j = 2 * i ;
    j <= N ;
    j += i ) {
      table [ i ] [ j ] = inf ;
    }
  }
  /* bfs */
  {
    visit [ 0 ] = 0 ;
    Deque < Integer > h = new LinkedList < Integer > ( ) ;
    h . add ( i ) ;
    while ( h . size ( ) > 0 ) {
      int y = h . removeLast ( ) ;
      for ( int i = 0 ;
      i < N + 2 ;
      i ++ ) {
        if ( visit [ i ] == - 1 && table [ y ] [ i ] > 0 ) {
          visit [ i ] = visit [ y ] + 1 ;
          h . add ( i ) ;
        }
      }
    }
    return table ;
  }
  /* dinic */
  {
    if ( s == t ) {
      return table ;
    }
    for ( int i = 0 ;
    i < N + 2 ;
    i ++ ) {
      if ( visit [ i ] > visit [ s ] && table [ s ] [ i ] > 0 ) {
        int df = dinic ( i , t , Math . min ( f , table [ s ] [ i ] ) ) ;
        if ( df > 0 ) {
          table [ s ] [ i ] -= df ;
          table [ i ] [ s ] += df ;
          return table ;
        }
      }
    }
  }
  int ans = 0 ;
  do {
    visit = new int [ N + 2 ] ;
    bfs ( 0 ) ;
  }
  while ( visit [ N + 1 ] == - 1 ) ;
  do {
    int df = dinic ( 0 , N + 1 , inf ) ;
    if ( df == 0 ) {
      break ;
    }
    ans += df ;
  }
  while ( true ) ;
  int num = Arrays . stream ( P ) . mapToInt ( Integer :: parseInt ) . sum ( ) ;
  