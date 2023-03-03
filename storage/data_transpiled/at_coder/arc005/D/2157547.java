@ SafeVarargs public static < T > List < List < T >> solve ( int ... B ) {
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
    for ( int i = 0 ;
    i < C . length ;
    i ++ ) {
      map . put ( ( Integer ) 0 , new ArrayList < > ( ) ) ;
    }
    que . add ( ( Integer ) 0 ) ;
    while ( que . size ( ) > 0 ) {
      int v = p , q = que . removeFirst ( ) ;
      for ( int k = 0 ;
      k < C . length ;
      k ++ ) {
        int key ;
        if ( p + k >= 10 ) {
          key = ( ( p + k ) % 10 ) + ( q + 1 ) ;
        }
        else {
          key = ( p + k ) ;
        }
        if ( ! map . containsKey ( key ) ) {
          map . put ( key , map . get ( v ) . add ( k ) ) ;
          if ( map . get ( v ) . size ( ) < l ) {
            que . add ( key ) ;
          }
        }
      }
    }
    List < List < T >> m = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < 10 ;
    i ++ ) {
      m . add ( new ArrayList < > ( ) ) ;
    }
    for ( int i = 0 ;
    i < 10 ;
    i ++ ) {
      int p = i ;
      int q = i ;
      m . get ( p ) . add ( ( q = d . get ( p ) . get ( q ) ) ) ;
    }
    return map ;
  }
  Map < Integer , List < T >> map = new HashMap < > ( ) ;
  int N = price . length ;
  {
    Map < Integer , List < T >> memo = new HashMap < > ( ) ;
    int INF = 10 * 9 ;
    {
      int i = 0 ;
      int need = price [ i ] - s ;
      if ( i == N - 1 ) {
        if ( ( need = d . get ( need , 0 ) ) != 0 ) return map . get ( need , 0 ) . size ( ) * 2 - 1 ;
        return null