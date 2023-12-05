public static int N ( int N , int start ) {
  start -- ;
  int [ ] inputs = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) inputs [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] nodes = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    int first = Integer . parseInt ( input . nextLine ( ) ) - 1 ;
    int latter = Integer . parseInt ( input . nextLine ( ) ) ;
    nodes [ first ] [ i ] = latter ;
    nodes [ latter ] [ i ] = first ;
  }
  boolean [ ] visited = new boolean [ N ] ;
  int ans = 0 ;
  /* dfs */
  visited [ start ] = true ;
  int exist = inputs [ start ] ;
  for ( int node : nodes [ start ] ) {
    if ( visited [ node ] ) continue ;
    if ( dfs ( node ) ) {
      ans += 2 ;
      exist = 1 ;
    }
  }
  return exist ;
}
