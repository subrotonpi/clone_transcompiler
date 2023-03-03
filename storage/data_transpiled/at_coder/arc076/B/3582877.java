public static List < Integer > inpl ( ) {
  return Arrays . asList ( Integer . parseInt ( input . readLine ( ) ) ) ;
  class UnionFind implements Comparator < Integer > {
    int [ ] par = new int [ num ] ;
    int x ;
    int y ;
    public UnionFind ( int num ) {
      par [ num ] = - 1 ;
      for ( int i = 0 ;
      i < num ;
      i ++ ) par [ i ] = i ;
      return new UnionFind ( num ) ;
    }
    public int find ( int x ) {
      if ( par [ x ] < 0 ) {
        return x ;
      }
      else {
        x = par [ x ] ;
        return x ;
      }
    }
    public void union ( int x , int y ) {
      int rx = x ;
      int ry = y ;
      if ( rx != ry ) {
        if ( par [ rx ] < par [ ry ] ) par [ ry ] = rx ;
        if ( par [ rx ] > par [ ry ] ) par [ rx ] = ry ;
        else {
          par [ rx ] -- ;
          par [ ry ] = rx ;
        }
      }
      return ;
    }
  }
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] V = new int [ N ] ;
  List < Integer > Edge = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    x = inpl ( ) ;
    y = inpl ( ) ;
    V [ i ] = new Integer ( x ) ;
    V [ i ] = new Integer ( y ) ;
    V [ i ] = new Integer ( i ) ;
  }
  Arrays . sort ( V ) ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) Edge . add ( new Integer ( V [ i + 1 ] . intValue ( ) - V [ i ] . intValue ( ) ) ) ;
  V = Arrays . copyOf ( V , V . length ) ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) Edge . add ( new Integer ( V [ i + 1 ] . intValue ( ) - V [ i ] . intValue ( ) ) ) ;
  Edge = Arrays . sort ( Edge ) ;
  UnionFind U = new UnionFind ( N ) ;
  int ctr = 0 ;
  int ans = 0 ;
  while ( ctr != N - 1 ) {
    int c = Edge . remove ( ) ;
    int i = Edge . remove ( ) ;
    int j = Edge . remove ( ) ;
    if ( U . find ( i ) !=