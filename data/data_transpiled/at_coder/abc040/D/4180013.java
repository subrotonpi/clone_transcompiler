public static void UnionFind ( int n ) {
  int [ ] rank = new int [ n ] ;
  int [ ] parent = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    rank [ i ] = i ;
    parent [ i ] = i ;
    num [ i ] = 1 ;
  }
  int find ( ) {
    if ( parent [ i ] == null ) {
      return ;
    }
    else {
      parent [ i ] = find ( parent [ i ] ) ;
      return ;
    }
  }
  void merge ( int x , int y ) {
    int x = find ( ) ;
    int y = find ( ) ;
    if ( x == y ) {
      return ;
    }
    if ( rank [ x ] < rank [ y ] ) {
      parent [ x ] = y ;
      num [ y ] += num [ x ] ;
    }
    else if ( rank [ x ] > rank [ y ] ) {
      parent [ y ] = x ;
      num [ x ] += num [ y ] ;
    }
    else {
      parent [ x ] = y ;
      rank [ y ] ++ ;
      num [ y ] += num [ x ] ;
    }
  }
  final Scanner input = new Scanner ( System . in ) ;
  final int n = input . nextInt ( ) ;
  final int m = input . nextInt ( ) ;
  final int [ ] road = new int [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = input . nextInt ( ) ;
    int b = input . nextInt ( ) ;
    int y = input . nextInt ( ) ;
    road [ i ] = new int [ ] {
      a - 1 , b - 1 , y }
      ;
    }
    final int q = input . nextInt ( ) ;
    final int [ ] [ ] query = new int [ q ] [ ] ;
    for ( int i = 0 ;
    i < q ;
    i ++ ) {
      int v = input . nextInt ( ) ;
      int w = input . nextInt ( ) ;
      query [ i ] [ v ] = input . nextInt ( ) - 1 ;
    }
    Arrays . sort ( query , new Comparator < int [ ] > ( ) {
      @ Override public int compare ( int x , int y ) {
        return x - y ;
      }
    }
    ) ;
    UnionFind uf = new UnionFind ( n ) ;
    ans = new int [ q ] [ ] ;
    int j = 0 ;
    for ( int i = 0 ;
    i < query . length ;
    i ++ ) {
      int v = query [ i ] [ j ] ;
      while ( j <