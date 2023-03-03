public static void UnionFind ( ) {
  class UnionFind {
    int [ ] table = new int [ n + 1 ] ;
    int [ ] size = new int [ n + 1 ] ;
    int i ;
    int n ;
    int m ;
    UnionFind uf ;
    {
      table [ i ] = - 1 ;
      size [ i ] = 1 ;
    }
    void merge ( int r1 , int r2 ) {
      table [ r1 ] = r2 ;
      size [ r2 ] += size [ r1 ] ;
      size [ r1 ] = 0 ;
    }
    void findRoot ( int k ) {
      int [ ] path = new int [ n + 1 ] ;
      int curr = k ;
      while ( table [ curr ] != - 1 ) {
        path [ ++ curr ] = curr ;
        curr = table [ curr ] ;
      }
      for ( int i : path ) {
        table [ i ] = curr ;
      }
    }
  }
  {
    int n = Integer . parseInt ( string ) ;
    int m = Integer . parseInt ( string ) ;
    int [ ] ab = new int [ n ] ;
    Arrays . fill ( ab , 0 , n - 1 ) ;
    int [ ] ans = new int [ n * ( n - 1 ) / 2 ] ;
    uf = new UnionFind ( n ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int _b = ab [ i ] ;
      int _a = ab [ i + 1 ] ;
      int ra = uf . findRoot ( _a ) ;
      int rb = uf . findRoot ( _b ) ;
      if ( ra == rb ) {
        ans [ i ] = ans [ i ] ;
        continue ;
      }
      ans [ i ] = ans [ i ] - uf . size [ ra ] * uf . size [ rb ] ;
      uf . merge ( ra , rb ) ;
    }
  }
  if ( getClass ( ) . isAnnotationPresent ( UnionFind . class ) ) {
    n = Integer . parseInt ( input ( ) ) ;
    m = Integer . parseInt ( input ( ) ) ;
    System . out . println ( solve ( n + " " + m + "\n" ) ) ;
  }
}
