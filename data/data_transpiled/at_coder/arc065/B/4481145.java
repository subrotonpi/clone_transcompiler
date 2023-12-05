@ SafeVarargs public static < T > UnionFind < T > of ( final int size ) {
  class UnionFind < T > {
    private final int [ ] table = new int [ size ] ;
    private int [ ] table = new int [ size ] ;
    @ Override public int root ( T x ) {
      while ( table [ x ] >= 0 ) {
        x = table [ x ] ;
      }
      return x ;
    }
    @ Override public void unite ( int x , int y ) {
      int s1 = root ( x ) ;
      int s2 = root ( y ) ;
      if ( s1 != s2 ) {
        if ( table [ s1 ] > table [ s2 ] ) {
          s1 = s2 ;
          s2 = s1 ;
        }
        table [ s1 ] += table [ s2 ] ;
        table [ s2 ] = s1 ;
      }
      return ;
    }
    @ Override public boolean same ( T x , T y ) {
      return root ( x ) == root ( y ) ;
    }
    @ Override public int size ( ) {
      return - table [ root ( x ) ] ;
    }
  }
  String input = new Scanner ( 0 ) . next ( ) ;
  final int n = Integer . parseInt ( input ) ;
  final int k = Integer . parseInt ( input ) ;
  final int l = Integer . parseInt ( input ) ;
  UnionFind < T > u = new UnionFind < T > ( n ) ;
  UnionFind < T > v = new UnionFind < T > ( n ) ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    int p = Integer . parseInt ( input ) ;
    int q = Integer . parseInt ( input ) ;
    u . unite ( p - 1 , q - 1 ) ;
  }
  for ( int i = 0 ;
  i < l ;
  i ++ ) {
    int r = Integer . parseInt ( input ) ;
    int s = Integer . parseInt ( input ) ;
    v . unite ( r - 1 , s - 1 ) ;
  }
  TreeMap < T , Integer > map = new TreeMap < T , Integer > ( ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    T t = new T ( u . root ( i ) , v . root ( i ) ) ;
    map . put ( t , 1 ) ;
    a [ i ] = t ;
  }
  System . out . println ( map . get ( a ) ) ;
  return a . length ;
}
