public static int N = Integer . parseInt ( input ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] AB = new int [ M ] [ ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int A_i = Integer . parseInt ( input . nextLine ( ) ) ;
    int B_i = Integer . parseInt ( input . nextLine ( ) ) ;
    AB [ i ] = new int [ ] {
      A_i , B_i }
      ;
    }
    class UnionFind implements Comparator < int [ ] > {
      int [ ] parent = new int [ N ] ;
      int [ ] a ;
      int [ ] b ;
      {
        parent [ a ] = new int [ N ] ;
        for ( int i = 0 ;
        i < N ;
        i ++ ) {
          a [ i ] = - 1 ;
        }
        b [ i ] = 1 ;
      }
      @ Override public int root ( int x ) {
        if ( parent [ x ] < 0 ) {
          return x ;
        }
        else {
          parent [ x ] = root ( parent [ x ] ) ;
          return parent [ x ] ;
        }
      }
      @ Override public int size ( int x ) {
        x = root ( x ) ;
        return - 1 * parent [ x ] ;
      }
      @ Override public boolean equals ( int [ ] a ) {
        int x = root ( a ) ;
        int y = root ( a ) ;
        if ( x == y ) {
          return false ;
        }
        int x_size = size ( x ) ;
        int y_size = size ( y ) ;
        if ( x_size < y_size ) {
          x = y ;
          y = x ;
        }
        parent [ x ] += parent [ y ] ;
        parent [ y ] = x ;
        return true ;
      }
    }
    int maxInconvenience = N * ( N - 1 ) / 2 ;
    int [ ] ans = new int [ N ] ;
    ans [ 0 ] = maxInconvenience ;
    UnionFind uf = new UnionFind ( N ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int [ ] bridge = AB [ i ] ;
      int x = uf . root ( bridge [ 0 ] - 1 ) ;
      int y = uf . root ( bridge [ 1 ] - 1 ) ;
      int ans_tmp ;
      if ( x != y ) {
        int x_size = uf . size ( x ) ;
        int y_size = uf . size ( y ) ;
        ans_tmp = maxInconvenience - x_size * y_size ;
        maxInconvenience = ans_tmp ;
        uf .