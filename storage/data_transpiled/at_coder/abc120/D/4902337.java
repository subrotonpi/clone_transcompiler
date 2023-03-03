public static void UnionFind ( ) {
  class UnionFind {
    int [ ] table = {
      - 1 }
      ;
      int [ ] size = {
        1 }
        ;
        int [ ] curr ;
        int [ ] path = new int [ n + 1 ] ;
        int n = 0 ;
        UnionFind uf ;
        int [ ] path = new int [ n + 1 ] ;
        for ( int i = 0 ;
        i < n ;
        i ++ ) {
          table [ i ] = i ;
        }
        for ( int i = 0 ;
        i < n ;
        i ++ ) {
          path [ i ] = i ;
          curr = k ;
          while ( table [ curr ] != - 1 ) {
            path [ i ] = curr ;
            curr = table [ curr ] ;
          }
          defrag ( curr , path ) ;
        }
        def ( UnionFind k ) {
          for ( int i = 0 ;
          i < n ;
          i ++ ) {
            table [ p [ i ] ] = k ;
          }
        }
      }
      solve ( String . valueOf ( string ) ) ;
      n = Integer . parseInt ( string ) ;
      m = Integer . parseInt ( string ) ;
      int [ ] ab = new int [ n ] ;
      Arrays . sort ( ab ) ;
      int [ ] ans = new int [ n ] ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        ans [ i ] = n * ( n - 1 ) / 2 ;
        uf = new UnionFind ( n ) ;
        for ( int i = 0 ;
        i < m ;
        i ++ ) {
          int _b = ab [ i ] ;
          int _a = ab [ i ] ;
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
      if ( Class . isPrimitive ( ) ) {
        n = Integer . parseInt ( input ( ) ) ;
        m = Integer . parseInt ( input ( ) ) ;
        System . out . println ( solve ( n + " " + m + "\n" ) + Arrays . toString ( ans ) ) ;
      }
    }
    