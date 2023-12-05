public static int [ ] [ ] parse ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  ArrayList < Integer > alist = new ArrayList < Integer > ( ) ;
  ArrayList < Integer > blist = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    alist . add ( a ) ;
    blist . add ( b ) ;
  }
  class UnionFind implements Comparable {
    int [ ] root = new int [ numNodes + 1 ] ;
    int [ ] rank = new int [ numNodes + 1 ] ;
    int [ ] size = new int [ numNodes + 1 ] ;
  }
  public int find ( int x ) {
    if ( x != root [ x ] ) root [ x ] = find ( root [ x ] ) ;
    return root [ x ] ;
  }
  void union ( int x , int y ) {
    int xroot = root [ x ] , yroot = root [ y ] ;
    if ( xroot == yroot ) return ;
    else if ( rank [ xroot ] < rank [ yroot ] ) {
      root [ xroot ] = yroot ;
      size [ yroot ] += size [ xroot ] ;
    }
    else {
      root [ yroot ] = xroot ;
      size [ xroot ] += size [ yroot ] ;
      if ( rank [ xroot ] == rank [ yroot ] ) rank [ xroot ] ++ ;
    }
  }
  int [ ] [ ] ansArray = new int [ M ] [ ] ;
  int ans = N * ( N - 1 ) / 2 ;
  UnionFind unionFind = new UnionFind ( N ) ;
  int len = alist . size ( ) ;
  int [ ] [ ] blist = blist . toArray ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    ansArray [ i ] = ans ;
    int a = alist . get ( i ) ;
    int b = blist . get ( i ) ;
    int aroot = unionFind . find ( a ) , broot = unionFind . find ( b ) ;
    if ( aroot == broot ) continue ;
    int p = unionFind . size [ aroot ] , q = unionFind . size [ broot ] ;
    unionFind . union ( aroot , broot ) ;
    ans -= p * q ;
  }
  for ( int i = 0 ;
  i < M ;
  i ++ )