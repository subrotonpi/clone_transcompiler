static void addEdge ( int [ ] [ ] adjL , int vFr , int vTo , int cap ) {
  adjL [ vFr ] [ 0 ] = new int [ ] {
    vTo , cap , adjL [ vTo ] . length }
    ;
    adjL [ vTo ] [ 1 ] = new int [ ] {
      vFr , 0 , adjL [ vFr ] . length - 1 }
      ;
      /* For Fulkerson */
      int [ ] [ ] [ ] in = new int [ ] [ ] {
        new int [ ] {
          vFr , 0 , adjL [ vFr ] . length - 1 }
        }
        ;
        /* DFS */
        int vNow = 0 ;
        int vEn = 0 ;
        int fNow = 0 ;
        for ( int i = 0 ;
        i < adjL [ vNow ] . length ;
        i ++ ) {
          final int v2 = in [ vNow ] [ i ] ;
          final int cap = in [ vNow ] [ i + 1 ] ;
          final int iRev = in [ vNow ] [ i + 1 ] ;
          if ( ! used [ v2 ] && cap > 0 ) {
            int df = DFS ( v2 , vEn , Math . min ( fNow , cap ) ) ;
            if ( df > 0 ) {
              in [ vNow ] [ i ] [ 1 ] -= df ;
              in [ v2 ] [ iRev ] [ 1 ] += df ;
              return ;
            }
          }
        }
        int numV = in . length ;
        int MaximumFlow = 0 ;
        do {
          used = new int [ numV ] ;
          int df = DFS ( vSt , vEn , Float . MAX_VALUE ) ;
          if ( df == 0 ) return MaximumFlow ;
          MaximumFlow += df ;
        }
        while ( ! used [ vNow ] ) ;
        N = Integer . parseInt ( input ( ) ) ;
        List < Integer > As = Lists . newArrayList ( in ) ;
        int [ ] [ ] adjList = new int [ N + 2 ] [ N + 1 ] ;
        for ( int v = 0 ;
        v < N + 1 ;
        v ++ ) {
          for ( int i = 0 ;
          i < As . length ;
          i ++ ) {
            int A = As . get ( i ) ;
            if ( A <= 0 ) addEdge ( adjList , 0 , i , - A ) ;
            else addEdge ( adjList , i , N + 1 , A ) ;
          }
        }
        for ( int i = 1 ;
        i <= N ;
        i ++ ) for