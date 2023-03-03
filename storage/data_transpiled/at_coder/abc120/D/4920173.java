public static void UnionFind ( ) {
  int [ ] parent = new int [ size ] ;
  int [ ] rank = new int [ size ] ;
  int [ ] sizes = new int [ size ] ;
  for ( int i = 0 ;
  i < size ;
  i ++ ) {
    parent [ i ] = i ;
    rank [ i ] = 0 ;
    sizes [ i ] = 1 ;
  }
  int find ( ) {
    if ( parent [ 0 ] == null ) {
      return ;
    }
    else {
      return find ( parent [ 0 ] ) ;
    }
  }
  void unite ( int x , int y ) {
    int x = find ( ) ;
    int y = find ( ) ;
    if ( x == y ) {
      return ;
    }
    if ( rank [ x ] < rank [ y ] ) {
      parent [ x ] = y ;
      sizes [ y ] += sizes [ x ] ;
    }
    else {
      parent [ y ] = x ;
      sizes [ x ] += sizes [ y ] ;
      if ( rank [ x ] == rank [ y ] ) {
        rank [ x ] ++ ;
      }
    }
  }
  boolean same ( int x , int y ) {
    return find ( x ) == find ( y ) ;
  }
  int size = sizes [ find ( ) ] ;
  int N = Integer . parseInt ( input ( ) ) ;
  int M = Integer . parseInt ( input ( ) ) ;
  int [ ] [ ] AB = new int [ M ] [ ] ;
  for ( int m = 0 ;
  m < M ;
  m ++ ) {
    AB [ m ] = Arrays . copyOf ( input ( ) , n ) ;
  }
  UnionFind u = new UnionFind ( N ) ;
  int com = N * ( N - 1 ) / 2 ;
  int [ ] ans = new int [ M ] ;
  for ( int m = 0 ;
  m < M ;
  m ++ ) {
    int a = AB [ m ] [ 0 ] - 1 ;
    int b = AB [ m ] [ 1 ] - 1 ;
    if ( u . same ( a , b ) ) {
      ans [ m ] = com ;
    }
    else {
      com -= u . size ( a ) * u . size ( b ) ;
      ans [ m ] = com ;
      u . unite ( a , b ) ;
    }
  }
  for ( int m = 0 ;
  m < M ;
  m ++ ) {
    System . out . println ( ans [ m ] ) ;
  }
}
