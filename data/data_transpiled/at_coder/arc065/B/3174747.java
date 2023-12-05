@ Function public static List < Integer > f ( ) {
  List < Integer > f_ = new ArrayList < Integer > ( ) ;
  for ( String s : input . split ( " " ) ) {
    f_ . add ( Integer . parseInt ( s ) - 1 ) ;
  }
  class UnionFind implements List < Integer > {
    int [ ] parent = new int [ size ] ;
    int [ ] rank = new int [ size ] ;
    for ( int i = 0 ;
    i < size ;
    i ++ ) {
      parent [ i ] = i ;
      rank [ i ] = 0 ;
    }
    @ Override public Integer find ( Integer x ) {
      if ( parent [ x ] == x ) {
        return x ;
      }
      else {
        return find ( parent [ x ] ) ;
      }
    }
    @ Override public void unite ( Integer x , Integer y ) {
      int x = find ( x ) ;
      int y = find ( y ) ;
      if ( x == y ) {
        return ;
      }
      if ( rank [ x ] < rank [ y ] ) {
        parent [ x ] = y ;
      }
      else {
        parent [ y ] = x ;
        if ( rank [ x ] == rank [ y ] ) {
          rank [ x ] ++ ;
        }
      }
    }
    @ Override public boolean same ( Integer x , Integer y ) {
      return find ( x ) == find ( y ) ;
    }
  }
  ;
  int n = f . size ( ) ;
  int k = f . size ( ) ;
  int l = f . size ( ) ;
  UnionFind ud = new UnionFind ( n ) ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    Integer p = f_ . get ( ) ;
    Integer q = f_ . get ( ) ;
    ud . unite ( p , q ) ;
  }
  @ Override public int [ ] p ( ) {
    return p ;
  }
}
