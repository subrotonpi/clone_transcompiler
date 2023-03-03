static int gcd ( int a , int b ) {
  if ( a < b ) a = b ;
  int q = a , r = b ;
  while ( r != 0 ) {
    q = r ;
    r = q % r ;
  }
  return q ;
  /* main */
  int MAX_N = 102 ;
  final int INF = 10 * 12 ;
  final int SRC = 0 ;
  final int DST = MAX_N - 1 ;
  int [ ] [ ] g = new int [ MAX_N ] [ ] ;
  for ( int i = 0 ;
  i < MAX_N ;
  i ++ ) {
    g [ i ] [ i ] = 0 ;
  }
  int [ ] level = new int [ MAX_N ] ;
  int [ ] visited = new int [ MAX_N ] ;
  int n = 0 ;
  /* bfs */
  level = new int [ MAX_N ] ;
  for ( int i = 0 ;
  i < MAX_N ;
  i ++ ) {
    level [ i ] = - 1 ;
    level [ i ] = 0 ;
  }
  int [ ] que = new int [ MAX_N ] ;
  while ( 0 < que . length ) {
    int v = que [ 0 ] ;
    for ( int w = 0 ;
    w < MAX_N ;
    w ++ ) {
      if ( 0 < g [ v ] [ w ] && level [ w ] < 0 ) {
        level [ w ] = level [ v ] + 1 ;
        que [ w ] = w ;
      }
    }
  }
  /* dfs */
  if ( v == t ) return f ;
  for ( int w = visited [ v ] ;
  w < MAX_N ;
  w ++ ) {
    visited [ v ] = w ;
    if ( 0 < g [ v ] [ w ] && level [ v ] < level [ w ] ) {
      int d = dfs ( w , t , Math . min ( f , g [ v ] [ w ] ) ) ;
      if ( 0 < d ) {
        g [ v ] [ w ] -= d ;
        g [ w ] [ v ] += d ;
        return d ;
      }
    }
  }
  /* max flow */
  int flow = 0 ;
  do {
    /* bfs */
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( 0 < g [ i ] [ i ] ) {
        g [ i ] [ SRC ] = i ;
      }
      else if ( 0 < g [ i ] [ DST ] ) {
        g [ i ] [ DST ] = - a [ i ] ;
      }
    }
  }
  while ( 0 < flow ) ;
  return