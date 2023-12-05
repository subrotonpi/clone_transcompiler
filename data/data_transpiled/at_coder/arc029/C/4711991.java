@ InputFunction public static void inpl ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  class UnionFind {
    private final defaultdict < Integer > def {
      {
        super ( ) ;
      }
    }
    public int [ ] parent ;
    private int [ ] parent ;
    {
      int m ;
      int rn ;
      int i ;
      int c ;
      int r ;
      int r1 ;
      int r2 ;
      int ans ;
      UnionFind < Integer > uf ;
      {
        def ( ) {
          if ( N > 0 ) {
            parent = new int [ N ] ;
            parent [ 0 ] = - 1 ;
          }
          else {
            parent = new defaultdict < Integer > ( ) ;
          }
        }
        def ( ) {
          return new int [ N ] ;
        }
      }
      public int root ( int n ) {
        if ( parent [ n ] < 0 ) {
          return n ;
        }
        else {
          m = root ( parent [ n ] ) ;
          parent [ n ] = m ;
          return m ;
        }
      }
      public int merge ( int m , int n ) {
        int rm = root ( m ) ;
        int rn = root ( n ) ;
        if ( rm != rn ) {
          if ( - parent [ rm ] < - parent [ rn ] ) {
            rm = rn ;
            rn = rm ;
          }
          parent [ rm ] = parent [ rm ] + parent [ rn ] ;
          parent [ rn ] = rm ;
          return rn ;
        }
        return - 1 ;
      }
      public int size ( ) {
        return parent [ root ( n ) ] ;
      }
      public boolean isSame ( int m , int n ) {
        return root ( m ) == root ( n ) ;
      }
    }
  }
  int N = inpl ( ) ;
  int M = inpl ( ) ;
  int [ ] [ ] roads = new int [ M ] [ ] ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    c = Integer . parseInt ( input ( ) ) ;
    roads [ i ] = new int [ ] {
      0 , i , c }
      ;
    }
    for ( ;
    ;
    ) {
      roads [ 0 ] = inpl ( ) ;
    }
    Arrays . sort ( roads , new Comparator < Integer > ( ) {
      public int compare ( Integer o1 , Integer o2 ) {
        return o2 . intValue ( ) - o1 . intValue ( ) ;
      }
    }
    ) ;
    UnionFind < Integer > uf = new UnionFind < Integer > ( N + 1 ) ;
    int g = N + 1 ;
    int ans = 0 ;
    for ( int i = 0 ;
    i < M + N ;
    i ++ ) {
      int r1 = uf .