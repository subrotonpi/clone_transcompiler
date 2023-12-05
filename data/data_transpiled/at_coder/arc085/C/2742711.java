@ VisibleForTesting static void addEdge ( List < List < Integer > [ ] > adjL , int vFr , int vTo , int cap ) {
  adjL [ vFr ] . add ( new Integer [ ] {
    vTo , cap , adjL [ vTo ] . size ( ) }
    ) ;
    adjL [ vTo ] . add ( new Integer [ ] {
      vFr , 0 , adjL [ vFr ] . size ( ) - 1 }
      ) ;
      /*EdmondsKarp */
      List < Integer > [ ] adjList = new List [ numV ] ;
      /*BFS */
      int vSt = adjL [ vFr ] . size ( ) ;
      int vEn = adjL [ vFr ] . size ( ) ;
      /*BFS */
      int vEn = adjL [ vFr ] . size ( ) ;
      /*BFS */
      int vEn = adjL [ vFr ] . size ( ) ;
      /*BFS */
      int vNow = adjL [ vSt ] . get ( vEn ) ;
      /*BFS */
      while ( Q . size ( ) > 0 ) {
        vNow = Q . get ( vNow ) ;
        int fNow = adjL [ vNow ] . get ( vEn ) ;
        if ( vNow == vEn ) {
          /*BFS */
          df = fNow ;
          break ;
        }
        for ( int i = 0 ;
        i < numV ;
        i ++ ) {
          final int v2 = adjL [ vNow ] . get ( i ) ;
          if ( prev [ v2 ] == - 1 && cap > 0 ) {
            prev [ v2 ] = vNow ;
            iE [ v2 ] = new Integer ( i ) ;
            iE [ v2 ] = new Integer ( vEn ) ;
            Q . add ( new Integer ( v2 ) ) ;
            Q . add ( new Integer ( Math . min ( fNow , cap ) ) ) ;
          }
        }
        if ( df > 0 ) {
          vNow = vEn ;
          while ( vNow != vSt ) {
            final int v0 = prev [ vNow ] ;
            final int e = iE [ vNow ] . get ( e ) ;
            final int iRev = iE [ vNow ] . get ( e ) ;
            adjList [ v0 ] . get ( e ) . add ( 1 ) ;
            adjList [ vNow ] . get ( iRev ) . add ( 1 ) ;
            vNow = v0 ;
          }
        }
      }
      