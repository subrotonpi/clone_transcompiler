static int N ( Scanner input , int M ) {
  int X = input . nextInt ( ) ;
  int [ ] E = new int [ M ] ;
  HashMap < Integer , Integer > C = new HashMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int u = input . nextInt ( ) , v = input . nextInt ( ) , w = input . nextInt ( ) ;
    E [ i ] = new int [ ] {
      w , u - 1 , v - 1 }
      ;
      C . put ( w , C . getOrDefault ( w , 0 ) + 1 ) ;
    }
    Arrays . sort ( E ) ;
    int [ ] * p , y ;
    /* root */
    if ( x == p [ 0 ] ) {
      return x ;
    }
    y = p [ x ] = root ( p [ x ] ) ;
    /* unite */
    int px = root ( x ) ;
    int py = root ( y ) ;
    if ( px == py ) {
      return 0 ;
    }
    if ( px < py ) {
      p [ py ] = px ;
    }
    else {
      p [ px ] = py ;
    }
    /* MOD */
    int MOD = 10 * 9 + 7 ;
    ArrayList < ArrayList < Integer >> G0 = new ArrayList < ArrayList < Integer >> ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      G0 . add ( new ArrayList < Integer > ( ) ) ;
    }
    int K = 0 ;
    int last = 0 ;
    int [ ] U = new int [ M ] ;
    int cost = 0 ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      int w = E [ i ] ;
      int u = E [ i ] ;
      int v = E [ i ] ;
      if ( unite ( u , v ) ) {
        cost += w ;
        U [ i ] = 1 ;
        if ( last != w ) K += C . getOrDefault ( w , 0 ) ;
        G0 . get ( u ) . add ( new Integer ( v ) ) ;
        G0 . get ( v ) . add ( new Integer ( u ) ) ;
        last = w ;
      }
    }
    /* dfs0 */
    if ( u == t ) {
      return 0 ;
    }
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      int w = G0 . get ( i ) ;
      if ( v == p ) continue ;
      int r = dfs0 ( v , u , t )