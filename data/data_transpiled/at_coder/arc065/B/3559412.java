@ VisibleForTesting static Collection < Pair < Integer , Integer >> createUnionFind ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int L = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Pair < Integer , Integer >> P = new ArrayList < > ( ) ;
  List < Pair < Integer , Integer >> R = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    P . add ( Pair . create ( input . nextLine ( ) , i ) ) ;
  }
  List < Pair < Integer , Integer >> P = new ArrayList < > ( ) ;
  List < Pair < Integer , Integer >> R = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < L ;
  i ++ ) {
    R . add ( Pair . create ( input . nextLine ( ) , i ) ) ;
  }
  class UnionFind {
    private int [ ] parent ;
    {
      this . parent = new int [ N ] ;
      this . rank = new int [ N ] ;
      this . count = 0 ;
    }
    public int root ( int a ) {
      if ( parent [ a ] == a ) return a ;
      else {
        parent [ a ] = root ( parent [ a ] ) ;
        return parent [ a ] ;
      }
    }
    public boolean isSameType ( int a , int b ) {
      return root ( a ) == root ( b ) ;
    }
    public void unite ( int a , int b ) {
      int ra = root ( a ) ;
      int rb = root ( b ) ;
      if ( ra == rb ) return ;
      if ( rank [ ra ] < rank [ rb ] ) parent [ ra ] = rb ;
      else {
        parent [ rb ] = ra ;
        if ( rank [ ra ] == rank [ rb ] ) rank [ ra ] ++ ;
      }
      count ++ ;
    }
  }
  UnionFind uf1 = new UnionFind ( N ) ;
  for ( int p = 0 ;
  p < P . size ( ) ;
  p ++ ) {
    int a = p - 1 ;
    int b = p - 1 ;
    if ( uf1 . isSameType ( p , q ) ) continue ;
    uf1 . unite ( p , q ) ;
  }
  UnionFind uf2 = new UnionFind ( N ) ;
  for ( int r = 0 ;
  r < R . size ( ) ;
  r ++ ) {
    int s = r - 1 ;
    if ( uf2 . isSameType