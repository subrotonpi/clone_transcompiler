@ VisibleForTesting static void addEdge ( List < List < Integer > [ ] > adjL , int vFr , int vTo , int cap ) {
  adjL [ vFr ] . add ( new Integer [ ] {
    vTo , cap , adjL [ vTo ] . size ( ) }
    ) ;
    List < Integer > mf = Dinic ( adjList , 0 , N + 1 ) ;
    System . out . println ( Arrays . toString ( A ) ) ;
    for ( int i = 1 ;
    i <= N ;
    ++ i ) {
      for ( int j = 2 * i ;
      j <= N ;
      ++ j ) {
        addEdge ( adjList , i , j , Double . POSITIVE_INFINITY ) ;
      }
    }
    int mf = Dinic ( adjList , 0 , N + 1 ) ;
    System . out . println ( Arrays . toString ( A ) ) ;
    for ( int i = 1 ;
    i <= N ;
    ++ i ) {
      for ( int j = 0 ;
      j <= N ;
      ++ j ) {
        if ( dist [ j ] == - 1 && cap > 0 ) {
          dist [ j ] = dist [ j ] + 1 ;
          Q . add ( j ) ;
        }
      }
    }
    /* BFS */
    int [ ] dist = new int [ N + 1 ] ;
    Queue < Integer > Q = new LinkedList < Integer > ( ) ;
    Q . add ( vSt ) ;
    while ( Q . size ( ) > 0 ) {
      int vNow = Q . poll ( ) ;
      for ( int i = 0 ;
      i < N ;
      ++ i ) {
        final int v2 = adjL [ vNow ] . get ( i ) ;
        int cap = adjL [ vNow ] . get ( i ) ;
        int iRev = adjL [ vNow ] . get ( i ) ;
        if ( dist [ vNow ] < dist [ v2 ] && cap > 0 ) {
          int df = DFS ( v2 , vEn , Math . min ( fNow , cap ) ) ;
          if ( df > 0 ) {
            adjL [ vNow ] . get ( i ) . set ( 1 , - df ) ;
            adjL [ v2 ] . get ( iRev ) . set ( 1 , df ) ;
            return ;
          }
        }
        ++ iNext [ vNow ] ;
      }
    }
    int numV = adjL . size ( ) ;
    int MaximumFlow = 0 ;
    do {
      dist = new int [ numV ] ;
      BFS ( vSt ) ;
      if ( dist [ vEn ] ==