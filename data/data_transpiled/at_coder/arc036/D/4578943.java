public static void UnionFind ( int N ) {
  {
    int [ ] table = new int [ N ] ;
    int [ ] rank = new int [ N ] ;
    int [ ] size = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      table [ i ] = i ;
    }
    int x = 0 , y = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      x = i ;
      y = i ;
      if ( x == y ) {
        return ;
      }
      if ( rank [ x ] < rank [ y ] ) {
        table [ x ] = y ;
        size [ y ] += size [ x ] ;
      }
      else {
        table [ y ] = x ;
        size [ x ] += size [ y ] ;
        if ( rank [ x ] == rank [ y ] ) {
          rank [ x ] ++ ;
        }
      }
    }
    int [ ] same = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int w = Integer . parseInt ( input . nextLine ( ) ) ;
      int x = Integer . parseInt ( input . nextLine ( ) ) ;
      int y = Integer . parseInt ( input . nextLine ( ) ) ;
      int z = Integer . parseInt ( input . nextLine ( ) ) ;
      if ( w == 1 ) {
        if ( z % 2 == 0 ) {
          uf . unite ( x - 1 , y - 1 ) ;
          uf . unite ( x - 1 + N , y - 1 + N ) ;
        }
        else {
          uf . unite ( x - 1 , y - 1 + N ) ;
          uf . unite ( x - 1 + N , y - 1 + N ) ;
        }
      }
      else {
        ans [ i ] = uf . same ( x - 1 , y - 1 ) ? "YES" : "NO" ;
      }
    }
    for ( int a : ans ) {
      System . out . println ( a ) ;
    }
  }
  