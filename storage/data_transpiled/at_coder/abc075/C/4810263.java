public static int N ( int M ) {
  int [ ] ab = new int [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    ab [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  class UnionFind {
    int size ;
    int [ ] par = new int [ N ] ;
    int [ ] rank = new int [ N ] ;
    for ( int n = 0 ;
    n < N ;
    n ++ ) {
      par [ n ] = n ;
      rank [ n ] = 1 ;
    }
  }
  int root ;
  UnionFind ( ) {
    int i ;
    int rx ;
    int ry ;
    int r ;
    for ( i = 0 ;
    i < N ;
    i ++ ) {
      par [ i ] = n ;
      rank [ i ] = 1 ;
    }
  }
  int i ;
  int i ;
  for ( i = 0 ;
  i < N ;
  i ++ ) {
    i = i ;
    if ( par [ i ] == x ) return i ;
    r = root = par [ i ] ;
    par [ i ] = r ;
  }
  void unite ( int x , int y ) {
    int rx = root ( x ) ;
    int ry = root ( y ) ;
    if ( rx != ry ) {
      size -- ;
      if ( rank [ rx ] > rank [ ry ] ) par [ ry ] = rx ;
      else {
        par [ rx ] = ry ;
        if ( rank [ rx ] == rank [ ry ] ) rank [ ry ] ++ ;
      }
    }
  }
  boolean is_same ( i , x , y ) {
    return root ( x ) == root ( y ) ;
  }
  int c = 0 ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    UnionFind uf = new UnionFind ( N ) ;
    for ( int a = 0 , b = ab [ i ] ;
    a < i + ab . length ;
    a ++ , b ++ ) uf . unite ( a - 1 , b - 1 ) ;
    if ( uf . size > 1 ) c ++ ;
  }
  System . out . println ( c ) ;
  return c ;
}
