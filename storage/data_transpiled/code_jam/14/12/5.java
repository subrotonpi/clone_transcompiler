@ VisibleForTesting static int [ ] [ ] createNeighbors ( ) {
  int T = Integer . parseInt ( input ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    int N = Integer . parseInt ( input ( ) ) ;
    ImmutableList < ImmutableList < Integer >> edges = new ImmutableList < > ( ) ;
    for ( int i = 0 ;
    i < N - 1 ;
    i ++ ) {
      edges . add ( ImmutableList . of ( Integer . parseInt ( input ( ) ) - 1 ) ) ;
    }
    ImmutableList < ImmutableList < Integer >> neigh = new ImmutableList < > ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      neigh . add ( edges . get ( i ) ) ;
    }
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      neigh . add ( edges . get ( i ) ) ;
      neigh . add ( edges . get ( i ) ) ;
    }
    int ans = N ;
    for ( int root = 0 ;
    root < N ;
    root ++ ) {
      ImmutableList < Integer > parent = new ImmutableList < > ( ) ;
      ImmutableList < ImmutableList < Integer >> children = new ImmutableList < > ( ) ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        children . add ( neighbor . get ( i ) ) ;
      }
      Queue < Integer > queue = new ArrayDeque < > ( ) ;
      queue . add ( root ) ;
      List < Integer > order = new ArrayList < > ( ) ;
      order . add ( root ) ;
      while ( queue . size ( ) > 0 ) {
        int cur = queue . poll ( ) ;
        for ( int i : neigh . get ( cur ) ) {
          if ( parent . get ( i ) . isEmpty ( ) && i != root ) {
            parent . set ( i ) ;
            children . get ( cur ) . add ( i ) ;
            queue . add ( i ) ;
            order . add ( i ) ;
          }
        }
      }
      order . trimToSize ( ) ;
      int [ ] size = new int [ N ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        size [ i ] = 0 ;
      }
      cost = new int [ N ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        list [ i ] = order . get ( i ) ;
      }
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        list [ i ] = list . get ( i ) ;
      }
      ans = Math . max ( size [