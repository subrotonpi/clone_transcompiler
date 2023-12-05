public static void UnionFind ( ) {
  {
    par = new int [ length ] ;
    rank = new int [ length ] ;
    for ( int i = 0 ;
    i < length ;
    i ++ ) {
      par [ i ] = - 1 ;
      rank [ i ] = 0 ;
    }
    int root ;
    int rootX ;
    int rootY ;
    int rootX ;
    int rootY ;
    if ( ( root = par [ 0 ] ) < 0 ) {
      return ;
    }
    else {
      root = root ( par [ 0 ] ) ;
      par [ 0 ] = root ;
      return ;
    }
  }
  void unite ( int x , int y ) {
    int rootX = root ( x ) ;
    int rootY = root ( y ) ;
    if ( ( rootX == rootY ) && ( rootY == rootY ) ) {
      return ;
    }
    else {
      if ( rank [ rootX ] < rank [ rootY ] ) {
        par [ rootY ] += par [ rootX ] ;
        par [ rootX ] = rootY ;
      }
      else {
        par [ rootX ] += par [ rootY ] ;
        par [ rootY ] = rootX ;
        if ( rank [ rootX ] == rank [ rootY ] ) {
          rank [ rootX ] ++ ;
        }
      }
    }
  }
  boolean same ( int x , int y ) {
    rootX = root ( x ) ;
    rootY = root ( y ) ;
    return rootX == rootY ;
  }
  int size = - par [ 0 ] ;
  int score ;
  int [ ] [ ] outputs = new int [ M ] [ ] ;
  for ( int i = 0 ;
  i < outputs . length ;
  i ++ ) {
    outputs [ i ] = score ;
    UnionFind uf = new UnionFind ( N ) ;
    for ( int j = i ;
    j < outputs . length ;
    j ++ ) {
      if ( ! uf . same ( ( Edge ) outputs [ j ] ) ) {
        score -= uf . size ( ( Edge ) outputs [ j ] ) * uf . size ( ( Edge ) outputs [ j ] ) ;
        uf . unite ( ( Edge ) outputs [ j ] ) ;
      }
      outputs [ i ] = score ;
    }
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      System . out . println ( ( int ) outputs [ M - i - 1 ] ) ;
    }
  }
  