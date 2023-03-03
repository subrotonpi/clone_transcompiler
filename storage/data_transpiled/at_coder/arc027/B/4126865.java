public static int bManyTimes ( int N , int S1 , int S2 ) {
  class UnionFind implements Comparator < Integer > {
    int [ ] p = new int [ N ] ;
    int [ ] rank = new int [ N ] ;
    int [ ] size = new int [ N ] ;
    int i ;
    public void union ( int x , int y ) {
      int u = find ( x ) ;
      int v = find ( y ) ;
      if ( u == v ) return ;
      if ( rank [ u ] < rank [ v ] ) {
        p [ u ] = v ;
        size [ v ] += size [ u ] ;
        size [ u ] = 0 ;
      }
      else {
        p [ v ] = u ;
        size [ u ] += size [ v ] ;
        size [ v ] = 0 ;
        if ( rank [ u ] == rank [ v ] ) rank [ u ] ++ ;
      }
    }
  }
  int u ;
  int v ;
  UnionFind ( ) {
    if ( p [ x ] != x ) p [ x ] = find ( p [ x ] ) ;
    return p [ x ] ;
  }
  boolean isSameType ( int x , int y ) {
    return indexOf ( x ) == find ( y ) ;
  }
  int [ ] getSize ( int x ) {
    return getSize ( x ) ;
  }
  public String toString ( ) {
    return "[" + Arrays . toString ( p ) + "]" ;
  }
}
