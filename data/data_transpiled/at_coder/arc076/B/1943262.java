public static int N = Integer . parseInt ( input ) {
  int [ ] Xs = new int [ N ] ;
  int [ ] Ys = new int [ N ] ;
  int [ ] V = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    Xs [ i ] = new int [ x ] ;
    Ys [ i ] = new int [ y ] ;
  }
  Arrays . sort ( Xs ) ;
  Arrays . sort ( Ys ) ;
  int [ ] Xedges = new int [ N ] ;
  int [ ] Yedges = new int [ N ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    Xedges [ i ] = new int [ ] {
      Xs [ i + 1 ] [ 0 ] - Xs [ i ] [ 0 ] , Xs [ i ] [ 1 ] , Xs [ i + 1 ] [ 1 ] }
      ;
      Yedges [ i ] = new int [ ] {
        Ys [ i + 1 ] [ 0 ] - Ys [ i ] [ 0 ] , Ys [ i ] [ 1 ] , Ys [ i + 1 ] [ 1 ] }
        ;
      }
      Arrays . addAll ( Xedges , Yedges ) ;
      Arrays . sort ( Xedges ) ;
      class UnionFind {
        int [ ] table = new int [ N ] ;
        int [ ] i ;
        public int find ( int x ) {
          if ( i < 0 ) {
            return x ;
          }
          else {
            table [ x ] = i ;
            return i ;
          }
        }
        public boolean union ( int x , int y ) {
          int s1 = i ;
          int s2 = i ;
          if ( i != s2 ) {
            if ( i <= table [ s1 ] ) {
              i += i ;
              table [ s2 ] = i ;
            }
            else {
              i += i ;
              table [ s1 ] = i ;
            }
          }
          return true ;
        }
        public boolean subsetAll ( ) {
          int [ ] a = new int [ N ] ;
          for ( int i = 0 ;
          i < a . length ;
          i ++ ) {
            if ( i < a . length ) {
              a [ i ] = i - i ;
            }
          }
          return true ;
        }
      }
      UnionFind uf = new UnionFind ( N ) ;
      int i = 0 ;
      while ( i < N - 1 ) {
        int v = i ;
        int