static UnionFind < Integer > unionFind = new UnionFind < Integer > ( ) {
  private int [ ] table = new int [ size ] ;
  public int root ( int x ) {
    while ( table [ x ] >= 0 ) x = table [ x ] ;
    return x ;
  }
  public void unite ( int x , int y ) {
    int s1 = root ( x ) ;
    int s2 = root ( y ) ;
    if ( s1 != s2 ) {
      if ( table [ s1 ] > table [ s2 ] ) {
        s1 = s2 ;
        s2 = s1 ;
      }
      table [ s1 ] += table [ s2 ] ;
      table [ s2 ] = s1 ;
    }
    return ;
  }
  public boolean same ( int x , int y ) {
    return root ( x ) == y ;
  }
}
