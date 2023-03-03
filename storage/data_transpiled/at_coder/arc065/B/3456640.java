public static void UnionFind ( int numV ) {
  int [ ] pars = new int [ numV ] ;
  int [ ] ranks = new int [ numV ] ;
  for ( int i = 0 ;
  i < numV ;
  i ++ ) {
    pars [ i ] = i ;
  }
  int x = 0 ;
  int y = 0 ;
  for ( int i = 0 ;
  i < numV ;
  i ++ ) {
    if ( pars [ i ] == x ) {
      return ;
    }
    else {
      pars [ i ] = find ( pars [ i ] ) ;
      return ;
    }
  }
  void union ( int x , int y ) {
    x = find ( x ) ;
    y = find ( y ) ;
    if ( x == y ) return ;
    if ( ranks [ x ] < ranks [ y ] ) {
      pars [ x ] = y ;
    }
    else {
      pars [ y ] = x ;
      if ( ranks [ x ] == ranks [ y ] ) ranks [ x ] ++ ;
    }
  }
  int N = Integer . parseInt ( input ( ) . nextLine ( ) ) ;
  int K = Integer . parseInt ( input ( ) . nextLine ( ) ) ;
  int L = Integer . parseInt ( input ( ) . nextLine ( ) ) ;
  Pair [ ] pqs = new Pair [ K ] ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) pqs [ i ] = Pair . create ( Integer . parseInt ( input ( ) . nextLine ( ) ) ) ;
  Pair [ ] rss = new Pair [ L ] ;
  for ( int i = 0 ;
  i < L ;
  i ++ ) rss [ i ] = Pair . create ( Integer . parseInt ( input ( ) . nextLine ( ) ) ) ;
  UnionFind UFRoad = new UnionFind ( N ) ;
  for ( Pair p : pqs ) UFRoad . union ( p , q ) ;
  UnionFind UFRailway = new UnionFind ( N ) ;
  for ( Pair r : rss ) UFRailway . union ( r , s ) ;
  List < Pair > Ts = new ArrayList < Pair > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) Ts . add ( new Pair ( UFRoad . find ( i ) , UFRailway . find ( i ) , i ) ) ;
  Collections . sort ( Ts ) ;
  int [ ] anss = new int [ N ] ;
  int iFr = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++