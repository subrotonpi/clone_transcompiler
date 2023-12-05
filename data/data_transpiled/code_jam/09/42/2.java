static void print ( ) {
  final int test ;
  psyco . full ( ) ;
  {
    System . err . println ( a . toString ( ) ) ;
  }
  {
    int R = readInt ( ) ;
    int C = readInt ( ) ;
    int F = readInt ( ) ;
    int [ ] sa = readArray ( R , readLine ( ) ) ;
    for ( int i : xrange ( R ) ) {
      a [ i ] = new int [ N ] ;
      for ( int j : xrange ( C ) ) a [ i ] [ j ] = sa [ i ] == '#' ;
    }
    int res = 10000 ;
    {
      int i ;
      int s ;
      int e ;
      int c2 ;
      if ( ( res = Math . min ( res , n ) ) == 10000 ) {
        System . err . println ( "Case #" + ( test + 1 ) + ": No" ) ;
      }
      else {
        System . err . println ( "Case #" + ( test + 1 ) + ": Yes " + Integer . toString ( res ) ) ;
      }
    }
    for ( test = 0 ;
    test < 10000 ;
    test ++ ) {
      res = res ;
      dbg ( "test " + test + "\n" ) ;
      runTest ( test ) ;
    }
  }
  {
    int c2 ;
    int s ;
    int e ;
    int r2 ;
    int s ;
    int c2 ;
    int s ;
    int c2 ;
    int s ;
    c2 ;
    int e ;
    c2 = readInt ( ) ;
    s = 0 ;
    c = readInt ( ) ;
    res = 0 ;
    for ( i = xrange ( C , s - 1 , e ) ;
    i < N ;
    i ++ ) if ( ( i == 0 ) || ( a [ r ] [ i - 1 ] ) || ( ! a [ r + 1 ] [ i - 1 ] ) ) break ;
    s = i ;
    c2 = readInt ( ) ;
    if ( ( i == 0 ) || ( a [ r ] [ i + 1 ] ) || ( ! a [ r + 1 ] [ i + 1 ] ) ) break ;
    r2 = i ;
    if ( ( r2 - r <= F ) && ( ! a [ r ] [ e + 1 ] ) ) break ;
    s = i ;
    c2 = readInt ( ) ;
    if ( ( e < C - 1 ) && ( ! a [ r ] [ e + 1 ] ) ) break ;
    c2 = readInt ( ) ;
    if ( ( r2 - r <= F ) && ( ! a [ r ] [ c2 ] ) ) break ;
  }
  