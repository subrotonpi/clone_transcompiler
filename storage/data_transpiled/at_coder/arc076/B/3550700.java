public static void unite ( int n ) {
  int [ ] ax = new int [ n ] ;
  int [ ] ay = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    ax [ i ] = new int [ x ] ;
    ay [ i ] = new int [ y ] ;
  }
  Arrays . sort ( ax ) ;
  Arrays . sort ( ay ) ;
  Edge [ ] edge = new Edge [ n ] ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    int v = ax [ i ] . y ;
    int u = ax [ i + 1 ] . y ;
    int c = Math . abs ( ax [ i ] . x - ax [ i + 1 ] . x ) ;
    edge [ i ] = new Edge ( c , v , u ) ;
    v = ay [ i ] . y ;
    u = ay [ i + 1 ] . y ;
    c = Math . abs ( ay [ i ] . x - ay [ i + 1 ] . x ) ;
    edge [ i ] = new Edge ( c , v , u ) ;
  }
  Arrays . sort ( edge ) ;
  class UnionFind {
    int [ ] par = new int [ n ] ;
    public int [ ] par = new int [ n ] ;
    public int [ ] find ( int x ) {
    }
    public int find ( int x ) {
      if ( par [ x ] == x ) return x ;
      else {
        par [ x ] = find ( par [ x ] ) ;
        return par [ x ] ;
      }
    }
    public int unite ( int x , int y ) {
      int x = par [ x ] ;
      int y = par [ y ] ;
      if ( x == y ) return x ;
      if ( x < y ) par [ y ] = x ;
      else par [ x ] = y ;
    }
    public boolean same ( int x , int y ) {
      return par [ x ] == par [ y ] ;
    }
  }
  UnionFind t = new UnionFind ( n ) ;
  int res = 0 ;
  for ( Edge e : edge ) {
    int cost = e . cost ;
    int v = e . value ;
    int u = e . value ;
    if ( ! t . same ( v , u ) ) {
      t . unite ( v , u ) ;
      res += cost ;
    }
  }
  System . out . println