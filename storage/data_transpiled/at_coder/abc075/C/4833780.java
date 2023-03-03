public static void UnionFind ( ) {
  class UnionFind {
    int [ ] parent = new int [ num + 1 ] ;
    int i ;
    public int find ( int x ) {
      if ( parent [ x ] < 0 ) {
        return x ;
      }
      else {
        parent [ x ] = find ( parent [ x ] ) ;
        return parent [ x ] ;
      }
    }
    void unite ( int x , int y ) {
      int x = find ( x ) ;
      int y = find ( y ) ;
      if ( x == y ) return ;
      if ( size ( x ) > size ( y ) ) {
        parent [ x ] += parent [ y ] ;
        parent [ y ] = x ;
      }
      else {
        parent [ y ] += parent [ x ] ;
        parent [ x ] = y ;
      }
    }
    int size ( x ) {
      return - parent [ find ( x ) ] ;
    }
    boolean same ( int x , int y ) {
      return find ( x ) == find ( y ) ;
    }
  }
  int n = Integer . parseInt ( input ( ) ) ;
  int m = Integer . parseInt ( input ( ) ) ;
  LinkedList < LinkedList < Integer >> lis = new LinkedList < LinkedList < Integer >> ( ) ;
  int count = 0 ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    lis . add ( new LinkedList < Integer > ( ) ) ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    UnionFind u = new UnionFind ( n ) ;
    for ( int j = 0 ;
    j < m ;
    j ++ ) {
      if ( i == j ) continue ;
      u . unite ( lis . get ( j ) . getFirst ( ) , lis . get ( j ) . getSecond ( ) ) ;
    }
    if ( ! u . same ( lis . get ( i ) . getFirst ( ) , lis . get ( i ) . getSecond ( ) ) ) {
      count ++ ;
    }
  }
  System . out . println ( count ) ;
}
