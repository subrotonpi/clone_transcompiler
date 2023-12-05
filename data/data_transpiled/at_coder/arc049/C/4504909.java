@ VisibleForTesting static int [ ] bfs ( int [ ] edges , int [ ] rEdges , Set < Integer > disable ) {
  disable = disable . isEmpty ( ) ? Collections . emptySet ( ) : disable . toArray ( new Integer [ disable . size ( ) ] ) ;
  int [ ] colored = new int [ edges . length ] ;
  for ( int i = 0 ;
  i < edges . length ;
  i ++ ) {
    if ( rEdges [ i ] != null || disable . contains ( i ) ) {
      continue ;
    }
    colored [ i ] = 1 ;
    Deque < Integer > dq = new LinkedList < > ( ) ;
    dq . add ( i ) ;
    while ( dq . size ( ) > 0 ) {
      int v = dq . pop ( ) ;
      for ( int dest : edges [ v ] ) {
        if ( ( ! colored [ dest ] ) && ( ! disable . contains ( dest ) ) && Arrays . equals ( colored [ dest ] , rEdges [ dest ] ) ) {
          colored [ dest ] = 1 ;
          dq . add ( dest ) ;
        }
      }
    }
  }
  if ( __name__ . equals ( "java.util.concurrent.LinkedTransferQueue" ) ) {
    final int N = Integer . parseInt ( input ( ) ) ;
    edges = new int [ N ] , rEdges = new int [ N ] ;
    final int A = Integer . parseInt ( input ( ) ) ;
    for ( int x = 0 ;
    x < A ;
    x ++ ) {
      rEdges [ x - 1 ] [ x ] = y - 1 ;
      edges [ y - 1 ] [ x ] = x - 1 ;
    }
    final int B = Integer . parseInt ( input ( ) ) ;
    final List < Tuple < Integer , Integer >> queries = new ArrayList < > ( ) ;
    for ( int l = 0 ;
    l < input ( ) ;
    l ++ ) queries . add ( Tuple . tuple ( Integer . parseInt ( input ( ) ) - 1 , l ) ) ;
    int ans = 0 ;
    if ( B > 0 ) {
      for ( int a = 0 ;
      a < B ;
      a ++ ) {
        int [ ] added = new int [ N ] , rAdded = new int [ N ] ;
        disable = new HashSet < > ( ) ;
        for ( int t = 0 ;
        t < a ;
        t ++ ) {
          final int q1 = a * added [ a ] ;
          final int q2 = queries . get ( a ) ;
          if ( t == 0 ) {
            disable . add ( q1 )