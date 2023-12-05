public static void UnionFind ( ) {
  class UnionFind {
    int [ ] par = new int [ n ] ;
    int [ ] rank = new int [ n ] ;
    int x ;
    int y ;
    public int find ( int x ) {
      if ( par [ x ] == x ) {
        return x ;
      }
      else {
        par [ x ] = find ( par [ x ] ) ;
        return x ;
      }
    }
    void union ( int x , int y ) {
      x = find ( x ) ;
      y = find ( y ) ;
      if ( rank [ x ] < rank [ y ] ) {
        par [ x ] = y ;
      }
      else {
        par [ y ] = x ;
      }
      if ( rank [ x ] == rank [ y ] ) {
        rank [ x ] ++ ;
      }
    }
    void sameCheck ( int x , int y ) {
    }
    int N = Integer . parseInt ( input ( ) ) ;
    int M = Integer . parseInt ( input ( ) ) ;
    int [ ] [ ] edge = new int [ M ] [ ] ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      edge [ i ] = Integer . parseInt ( input ( ) ) ;
    }
    int ans = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      UnionFind uf = new UnionFind ( N + 1 ) ;
      for ( int j = 0 ;
      j < M ;
      j ++ ) {
        if ( j == i ) {
          continue ;
        }
        else {
          uf . union ( edge [ j ] [ 0 ] , edge [ j ] [ 1 ] ) ;
        }
      }
      if ( ! uf . sameCheck ( edge [ i ] [ 0 ] , edge [ i ] [ 1 ] ) ) {
        ans ++ ;
      }
    }
    System . out . println ( ans ) ;
  }
  