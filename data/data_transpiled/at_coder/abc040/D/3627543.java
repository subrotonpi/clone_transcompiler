@ Nonnull public static Iterable < Integer > combinations ( int n ) {
  class UnionFind implements Comparator < Integer > {
    private final Map < Integer , Integer > parent ;
    private final Map < Integer , Integer > size ;
    {
      this . parent = new HashMap < > ( ) ;
      for ( int i = 1 ;
      i <= n ;
      i ++ ) {
        parent . put ( i , i ) ;
      }
      this . size = new HashMap < > ( ) ;
      for ( int i = 1 ;
      i <= n ;
      i ++ ) {
        parent . put ( i , 1 ) ;
      }
    }
    public Integer find ( Integer a ) {
      if ( parent . get ( a ) != a ) parent . put ( a , find ( parent . get ( a ) ) ) ;
      return parent . get ( a ) ;
    }
    public void unite ( Integer a , Integer b ) {
      a = parent . get ( a ) ;
      b = parent . get ( b ) ;
      if ( a == b ) return ;
      if ( size . get ( a ) > size . get ( b ) ) {
        size . get ( a ) + = size . get ( b ) ;
        parent . put ( b , a ) ;
      }
      else {
        size . get ( b ) + = size . get ( a ) ;
        parent . put ( a , b ) ;
      }
    }
    public boolean isunited ( Integer a , Integer b ) {
      return parent . get ( a ) == parent . get ( b ) ;
    }
  }
  int n = Integer . parseInt ( input ( ) ) ;
  int m = Integer . parseInt ( input ( ) ) ;
  UnionFind uft = new UnionFind ( n ) ;
  int [ ] roads = new int [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    roads [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  int q = Integer . parseInt ( input ( ) ) ;
  Queue < Integer > queue = new LinkedList < > ( ) ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    queue . add ( Integer . parseInt ( input ( ) ) ) ;
  }
  int ans [ ] = new int [ q ] ;
  int pos = 0 ;
  for ( int i = 0 ;
  i < queue . size ( ) ;
  i ++ ) {
    int v = queue . get ( i ) ;
    int w = queue . size ( ) ;
    while ( pos < m && roads [ pos ] > w ) {
      int a = roads [ pos ] ;
      