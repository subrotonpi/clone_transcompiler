public static void UnionFind ( ) {
  class UnionFind {
    int [ ] par = new int [ n ] ;
    int [ ] rank = new int [ n ] ;
    int x , y ;
    public int find ( int x , int y ) {
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
  }
  int N = Integer . parseInt ( input ( ) ) ;
  int M = Integer . parseInt ( input ( ) ) ;
  int [ ] [ ] road = new int [ M ] [ N ] ;
  UnionFind uf = new UnionFind ( N + 1 ) ;
  Set < Integer > S = new HashSet < Integer > ( ) ;
  for ( int i : road ) {
    uf . union ( i [ 0 ] , i [ 1 ] ) ;
  }
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    S . add ( uf . find ( i ) ) ;
  }
  System . out . println ( S . size ( ) - 1 ) ;
}
