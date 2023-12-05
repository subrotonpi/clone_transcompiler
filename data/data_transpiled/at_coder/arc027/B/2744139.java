public static int N = Integer . parseInt ( input ) {
  String S1 = input . next ( ) ;
  String S2 = input . next ( ) ;
  Map < String , Integer > A = new HashMap < > ( 26 ) ;
  for ( int i = 0 ;
  i < 10 ;
  i ++ ) {
    A . put ( String . valueOf ( i ) , i ) ;
  }
  class UnionFind implements UnionFind {
    int n ;
    int [ ] par = new int [ n ] ;
    int [ ] rank = new int [ n ] ;
    int [ ] size = new int [ n ] ;
    int i ;
    public int find ( int x ) {
      if ( par [ x ] == x ) {
        return x ;
      }
      else {
        par [ x ] = find ( par [ x ] ) ;
        return par [ x ] ;
      }
    }
    public void union ( int x , int y ) {
      int x = find ( x ) ;
      int y = find ( y ) ;
      if ( x == y ) {
        return ;
      }
      if ( rank [ x ] < rank [ y ] ) {
        par [ x ] = y ;
        size [ y ] += size [ x ] ;
        size [ x ] = 0 ;
      }
      else {
        par [ y ] = x ;
        size [ x ] += size [ y ] ;
        size [ y ] = 0 ;
        if ( rank [ x ] == rank [ y ] ) {
          rank [ x ] ++ ;
        }
      }
    }
  }
  public boolean sameCheck ( int x , int y ) {
    return find ( x ) == find ( y ) ;
  }
  public void allFind ( ) {
    for ( int n = 1 ;
    n < par . length ;
    n ++ ) {
      union ( par [ n ] ) ;
    }
  }
  UnionFind uf = new UnionFind ( 37 ) ;
  uf . union ( A . get ( S1 . charAt ( 0 ) ) , 36 ) ;
  uf . union ( A . get ( S2 . charAt ( 0 ) ) , 36 ) ;
  for ( int s1 = 0 , s2 = 1 ;
  s1 < par . length ;
  s1 ++ , s2 ++ ) {
    uf . union ( A . get ( s1 ) , A . get ( s2 ) ) ;
  }
  uf . allFind ( ) ;
  Set < Integer > U = new HashSet < > ( ) ;
  int ans = 1 ;
  for ( int s1 = 0 ;
  s1 < S1 . length ;
  s1 ++ ) {
    for ( int i = 0 ;
    i < 10 ;
    i ++ ) {
      if ( uf . sameCheck ( A . get (