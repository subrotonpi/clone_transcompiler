static final class UnionFind {
  private final int [ ] par ;
  private final int [ ] rank = new int [ n + 1 ] ;
  private int size ;
  private UnionFind ( int n ) {
    this . par = new int [ n + 1 ] ;
    this . rank [ 0 ] = n ;
  }
  public int size ( int x ) {
    return - 1 * this . par [ find ( x ) ] ;
  }
  public int indexOf ( int x ) {
    if ( ( this . par [ x ] < 1 ) || ( x > rank [ x ] ) ) return x ;
    this . par [ x ] = find ( this . par [ x ] ) ;
    return this . par [ x ] ;
  }
  public boolean sameCheck ( int x , int y ) {
    return find ( x ) == find ( y ) ;
  }
  public boolean union ( int x , int y ) {
    int x = find ( x ) ;
    int y = find ( y ) ;
    if ( ( x == y ) || ( x > rank [ y ] ) ) return false ;
    if ( ( size ( x ) < size ( y ) ) || ( size ( y ) > rank [ y ] ) ) x = y ;
    par [ x ] += par [ y ] ;
    par [ y ] = x ;
    return true ;
  }
  @ SuppressWarnings ( "unchecked" ) final UnionFind uf = new UnionFind ( N ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) uf . union ( a [ i ] , b [ i ] ) ;
  int ans = Arrays . binarySearch ( uf . par , i ) - 2 ;
  System . out . println ( ans ) ;
  return uf . par ;
}
