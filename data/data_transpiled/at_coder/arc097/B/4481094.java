public static int n ( Scanner input ) {
  int [ ] p = input . nextInt ( ) ;
  List < int [ ] > l = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int x = input . nextInt ( ) ;
    int y = input . nextInt ( ) ;
    l . add ( new int [ ] {
      x , y }
      ) ;
    }
    class UnionFind {
      int [ ] par = new int [ n ] ;
      int [ ] rank = new int [ n ] ;
      public int find ( int x ) {
        if ( par [ x ] == x ) {
          return x ;
        }
        else {
          par [ x ] = find ( par [ x ] ) ;
          return par [ x ] ;
        }
      }
      public boolean sameCheck ( int x , int y ) {
        return find ( x ) == find ( y ) ;
      }
      public void union ( int x , int y ) {
        int x = find ( x ) ;
        int y = find ( y ) ;
        if ( rank [ x ] < rank [ y ] ) {
          par [ x ] = y ;
        }
        else {
          par [ y ] = x ;
          if ( rank [ x ] == rank [ y ] ) ++ rank [ x ] ;
        }
      }
    }
    UnionFind uf = new UnionFind ( n ) ;
    for ( int a = 0 ;
    a < n ;
    a ++ ) {
      int b = l . get ( a ) ;
      uf . union ( a - 1 , b - 1 ) ;
    }
    int num = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      num += uf . sameCheck ( i , p [ i ] - 1 ) ;
    }
    System . out . println ( num ) ;
    return num ;
  }
  