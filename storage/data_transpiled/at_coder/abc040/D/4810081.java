static final String input = "Enter the union find" ;
class UnionFind implements UnionFind {
  int [ ] par = new int [ n ] ;
  int [ ] rank = new int [ n ] ;
  int [ ] size = new int [ n ] ;
  int i ;
  UnionFind ( int n ) {
    int [ ] par = new int [ n ] ;
    for ( i = 0 ;
    i < n ;
    i ++ ) par [ i ] = i ;
    rank [ i ] = 0 ;
    size [ i ] = 1 ;
  }
  public int find ( int x ) {
    if ( par [ x ] == x ) {
      return x ;
    }
    else {
      par [ x ] = find ( par [ x ] ) ;
      return par [ x ] ;
    }
  }
  public void unite ( int x , int y ) {
    int x = find ( x ) ;
    int y = find ( y ) ;
    if ( x != y ) {
      if ( rank [ x ] < rank [ y ] ) {
        par [ x ] = y ;
        size [ y ] += size [ x ] ;
      }
      else {
        par [ y ] = x ;
        size [ x ] += size [ y ] ;
      }
      if ( rank [ x ] == rank [ y ] ) rank [ x ] ++ ;
    }
  }
  public boolean sameCheck ( int x , int y ) {
    return find ( x ) == find ( y ) ;
  }
  public int treeSize ( int x ) {
    return size [ x ] ;
  }
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  int [ ] [ ] road = new int [ M ] [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) road [ i ] = Integer . parseInt ( input ) ;
  int Q = Integer . parseInt ( input ) ;
  int [ ] [ ] people = new int [ Q ] [ Q ] ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) people [ i ] [ 0 ] = Integer . parseInt ( input ) ;
  ArrayList < int [ ] > p_data = new ArrayList < > ( ) ;
  UnionFind uf = new UnionFind ( N + 1 ) ;
  for ( int i = 0 ;
  i < people . length ;
  i ++ ) {
    int [ ] p = new int [ ] {
      people [ i ] [ 2 ] , people [ i ] [ 1 ] , 0 }
      ;
    }
    Arrays . sort ( p_data ) ;
    int roadIndex = 0 ;
    for ( int