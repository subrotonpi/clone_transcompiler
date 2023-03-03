static final int [ ] [ ] getAdjacentArray ( int [ ] order , int [ ] adjList , Set < Integer > set ) {
  int n = Integer . parseInt ( input ( ) ) ;
  {
    while ( i < order . length && adjList [ at ] . contains ( order [ i ] ) ) {
      set . add ( order [ i ] ) ;
      i = getAdjacentArray ( order , adjList , set , i + 1 , order [ i ] ) ;
    }
    if ( i >= order . length ) {
      for ( int j : adjList [ at ] ) {
        if ( ! set . contains ( j ) ) {
          set . add ( j ) ;
          getAdjacentArray ( order , adjList , set , i , j ) ;
        }
      }
    }
    return order ;
  }
  for ( int caseno = 1 ;
  caseno <= 1 + n ;
  caseno ++ ) {
    int numNodes = Integer . parseInt ( input ( ) ) ;
    int numEdges = Integer . parseInt ( input ( ) ) ;
    String [ ] names = new String [ numNodes ] ;
    for ( int i = 0 ;
    i < numNodes ;
    i ++ ) {
      names [ i ] = input ( ) ;
    }
    int [ ] [ ] edgelist = new int [ numEdges ] [ ] ;
    for ( int i = 0 ;
    i < numEdges ;
    i ++ ) {
      edgelist [ i ] = Integer . parseInt ( input ( ) ) - 1 ;
    }
    adjList = new LinkedHashMap < > ( ) ;
    for ( int i = 0 ;
    i < edgelist . length ;
    i ++ ) {
      edgelist [ i ] = edgelist [ i ] [ 1 ] ;
    }
    List < Integer > nodesSorted = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < nodesSorted . size ( ) ;
    i ++ ) {
      nodesSorted . add ( i ) ;
    }
    List < Integer > order = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < numNodes ;
    i ++ ) {
      for ( int j = 0 ;
      j < nodesSorted . size ( ) ;
      j ++ ) {
        if ( ! order . contains ( j ) ) {
          List < Integer > testOrder = order . add ( j ) ;
          Integer start = testOrder . get ( 0 ) ;
          Set < Integer > set = new HashSet < > ( ) ;
          set . add ( start ) ;
          int i = getAdjacentArray ( testOrder , adjList , set , 1 , start ) ;
          if (