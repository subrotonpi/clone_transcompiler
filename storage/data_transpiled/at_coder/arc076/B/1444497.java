public static UnionFind < Integer > unionFind ( ) {
  class UnionFind {
    int n ;
    int par [ ] = new int [ n ] ;
    int rank [ ] = new int [ n ] ;
  }
  public UnionFind ( int n ) {
    this . n = n ;
    par = new int [ n ] ;
    rank [ 0 ] = 1 ;
  }
  public boolean isSameType ( int a , int b ) {
    return root ( a ) == root ( b ) ;
  }
  public int root ( int x ) {
    if ( par [ x ] == x ) return x ;
    par [ x ] = root ( par [ x ] ) ;
    return par [ x ] ;
  }
  public void unite ( int x , int y ) {
    int x = root ( x ) ;
    int y = root ( y ) ;
    if ( x == y ) return ;
    if ( rank [ x ] > rank [ y ] ) par [ y ] = x ;
    else if ( rank [ x ] < rank [ y ] ) par [ x ] = y ;
    else par [ y ] = x ;
    rank [ x ] ++ ;
  }
  int N = Integer . parseInt ( input ( ) ) ;
  int X [ ] = new int [ N ] ;
  int Y [ ] = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input ( ) ) ;
    int y = Integer . parseInt ( input ( ) ) ;
    X [ i ] = new int [ x ] ;
    Y [ i ] = new int [ y ] ;
  }
  Arrays . sort ( X ) ;
  Arrays . sort ( Y ) ;
  List < Edge < Integer >> graph = new ArrayList < Edge < Integer >> ( ) ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    graph . add ( new Edge < Integer > ( X [ i + 1 ] . x - X [ i ] . x , X [ i ] . y , X [ i + 1 ] . y ) ) ;
    graph . add ( new Edge < Integer > ( Y [ i + 1 ] . x - Y [ i ] . x , Y [ i ] . y , Y [ i + 1 ] . y ) ) ;
  }
  Collections . sort ( graph ) ;
  UnionFind < Integer > uf = new UnionFind < Integer > ( N ) ;
  int totalCost = 0 ;
  for ( int cost : graph ) {
    Node < Integer > a = graph . get (