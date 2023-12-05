@ SafeVarargs public static < T > List < List < T >> map ( int ... B ) {
  int [ ] C = B . clone ( ) ;
  int [ ] price = new int [ B . length ] ;
  for ( int i = 0 ;
  i < C . length ;
  i ++ ) {
    price [ i ] = i ;
  }
  Collections . reverse ( price ) ;
  Deque < Integer > que = new LinkedList < > ( ) ;
  {
    Map < Integer , List < T >> map = new HashMap < > ( ) ;
    for ( int D : res ) {
      map . put ( new Integer ( 0 ) , new ArrayList < > ( ) ) ;
    }
    int ans = "+" ;
    if ( ans > 1 ) ans += "=" ;
    System . out . println ( ans ) ;
  }
  int N = price . length ;
  int K = 10 ;
  Map < Integer , List < T >> map = map ( K ) ;
  Map < Integer , List < T >> m = map ( K ) ;
  memo = new HashMap < > ( ) ;
  int INF = 10 * 9 ;
  {
    int c = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int q = price [ i ] ;
      if ( ( q = i + 1 ) >= 10 ) {
        int key = new Integer ( ( p + q ) % 10 ) ;
        if ( q > 1 ) {
          key = new Integer ( ( p + q ) % 10 ) ;
          if ( ! map . containsKey ( key ) ) {
            map . put ( key , map . get ( v ) . add ( k ) ) ;
            if ( map . get ( v ) . size ( ) < l ) {
              que . add ( key ) ;
            }
          }
        }
      }
    }
    int res = INF ;
    cur = 0 ;
    for ( int q = 0 ;
    q < m . size ( ) ;
    q ++ ) {
      List < T > L = m . get ( q ) ;
      if ( L . size ( ) <= K ) {
        int c = 0 ;
        int r = 0 ;
        int need = price [ i ] - s ;
        if ( i == N - 1 ) {
          if ( ( need = 0 ) >= 0 ) {
            return map . get ( need , 0 ) . size ( ) * 2 - 1 ;
          }
          for ( int j = 0 ;
          j < r ;
          j ++ ) {
            t [ j ] . add ( L . get ( j ) ) ;
          }
          for ( int j =