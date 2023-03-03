@ VisibleForTesting static final Scanner in = new Scanner ( System . in ) {
  @ Override public int nextInt ( ) {
    return Integer . MAX_VALUE ;
  }
  @ Override public int INF ( ) {
    return Integer . MIN_VALUE ;
  }
  @ Override public int MOD ( ) {
    return 10 * 9 + 7 ;
  }
  @ Override public List < Integer > inpl ( ) {
    return Collections . singletonList ( Integer . parseInt ( in . nextLine ( ) ) ) ;
  }
  private class UnionFind {
    int [ ] nodes = new int [ ] {
      - 1 }
      ;
      private int [ ] weight = new int [ ] {
        0 }
        ;
        @ Override public int find ( int x ) {
          if ( nodes [ x ] < 0 ) {
            return x ;
          }
          else {
            int parent = super . find ( nodes [ x ] ) ;
            weight [ x ] += weight [ nodes [ x ] ] ;
            nodes [ x ] = parent ;
            return parent ;
          }
        }
        @ Override public boolean unite ( int x , int y , int w ) {
          int rootX = super . find ( x ) ;
          int rootY = super . find ( y ) ;
          if ( rootX == rootY ) {
            return false ;
          }
          else {
            int rankX = - nodes [ rootX ] ;
            int rankY = - nodes [ rootY ] ;
            if ( rankX < rankY ) {
              nodes [ rootX ] = rootY ;
              weight [ rootX ] = w + weight [ y ] - weight [ x ] ;
            }
            else {
              nodes [ rootY ] = rootX ;
              weight [ rootY ] = - w + weight [ x ] - weight [ y ] ;
              if ( rankX == rankY ) {
                nodes [ rootX ] += - 1 ;
              }
            }
            return true ;
          }
        }
        @ Override public boolean isSameType ( int x , int y ) {
          return super . isSameType ( x , y ) ;
        }
      }
      ;
      int N = inpl ( ) ;
      int M = inpl ( ) ;
      List < Integer > graph = new ArrayList < Integer > ( ) ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        graph . add ( new Integer ( i + 1 ) ) ;
        int a = graph . get ( i ) ;
        int b = graph . get ( i ) ;
        int c = graph . get ( i ) ;
        if ( uf . isSameType ( a , b ) ) {
          continue ;
        }
        else {
          uf . unite ( a , b , 0 ) ;
          ans += c ;
        }
      }
      return graph ;
    }
    