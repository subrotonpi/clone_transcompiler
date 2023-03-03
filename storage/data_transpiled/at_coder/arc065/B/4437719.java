public static void UnionFind ( ) {
  int N = Integer . MAX_VALUE ;
  int K = Integer . MIN_VALUE ;
  int L = Integer . MAX_VALUE ;
  UnionFind uf1 = new UnionFind ( N ) ;
  UnionFind uf2 = new UnionFind ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int p = i ;
    int q = i ;
    uf1 . unite ( p - 1 , q - 1 ) ;
    for ( int j = 0 ;
    j < L ;
    j ++ ) {
      uf2 . unite ( r - 1 , s - 1 ) ;
    }
  }
  System . out . println ( ( ( Integer ) ( uf1 . root ) ) . toString ( ) ) ;
}
