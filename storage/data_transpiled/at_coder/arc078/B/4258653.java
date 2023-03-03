static final class UnionFind {
  private int [ ] table = new int [ size ] ;
  public UnionFind ( int size ) {
    this . table = new int [ size ] ;
    for ( int i = 0 ;
    i < size ;
    i ++ ) {
      this . table [ i ] = i ;
    }
  }
  public UnionFind ( int x ) {
    return table [ x ] ;
  }
  public UnionFind ( int val , int y ) {
    return table [ y ] ;
  }
  public boolean same ( int x , int y ) {
    int x1 = find ( x ) ;
    int y1 = find ( y ) ;
    return x1 == y1 ;
  }
  public UnionFind ( int [ ] table ) {
    return table ;
  }
  public UnionFind ( int [ ] table ) {
    return table ;
  }
}
