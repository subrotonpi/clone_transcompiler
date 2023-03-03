static final String getStdOut ( ) {
  final Scanner in = new Scanner ( System . in ) ;
  final String dbg = in . nextLine ( ) ;
  final int [ ] a = new int [ in . nextInt ( ) ] ;
  in . nextLine ( ) ;
  final int L = in . nextInt ( ) ;
  final int N = in . nextInt ( ) ;
  final int INF = L + 1 ;
  final int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = in . nextInt ( ) ;
  }
  final int m = in . nextInt ( ) ;
  final Map < Integer , Integer > dp = new HashMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = in . nextInt ( ) ;
  }
  final int K = 50000 ;
  for ( int i : xrange ( K + 1000 ) ) {
    int r = in . hasNext ( ) ? dp . get ( in . next ( ) ) : INF ;
    for ( int x : a ) {
      if ( ( i - x ) >= 0 ) {
        r = Math . min ( r , dp . get ( i - x ) + 1 ) ;
      }
    }
    if ( r < INF ) {
      dp . put ( in . next ( ) , r ) ;
    }
  }
  final int div = ( int ) ( ( L - K ) / m ) ;
  final int res = div ;
  final int left = L - div * m ;
  return dp . containsKey ( left ) ? res + dp . get ( left ) : "IMPOSSIBLE" ;
}
