public static double dfs ( int state ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] C = new int [ M ] [ M ] ;
  int [ ] costs = new int [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int c = Integer . parseInt ( input . nextLine ( ) ) ;
    int cost = Integer . parseInt ( input . nextLine ( ) ) ;
    C [ i ] = new int [ c ] [ ] ;
    for ( int j = 0 ;
    j < c ;
    j ++ ) C [ i ] [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
    costs [ i ] = cost ;
  }
  final int ALL = 2 * N - 1 ;
  HashMap < Integer , Double > memo = new HashMap < > ( ALL , 0d ) ;
  final int INF = 10 * 18 ;
  /* dfs(state) */
  if ( memo . containsKey ( state ) ) return memo . get ( state ) ;
  double res = INF ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int p = 0 ;
    for ( int j = 0 ;
    j < C [ i ] . length ;
    j ++ ) {
      if ( ( state & ( 1 << ( c [ 0 ] - 1 ) ) ) != 0 ) continue ;
      p += C [ i ] [ j ] * ( dfs ( state | ( 1 << ( c [ 0 ] - 1 ) ) ) + costs [ i ] ) ;
    }
    tmp = ( costs [ i ] * ( 100 - p ) + tmp ) / p ;
    res = Math . min ( res , tmp ) ;
  }
  memo . put ( state , res ) ;
  return res ;
}
