public static void print ( int N , int M ) {
  int [ ] [ ] G = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) G [ i ] = new int [ N ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int c = Integer . parseInt ( input . nextLine ( ) ) ;
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    G [ a ] [ i ] = new int [ b ] ;
    G [ b ] [ i ] = new int [ a ] ;
  }
  @ SuppressWarnings ( "unchecked" ) int INF = 10 * 18 ;
  int [ ] que = new int [ N ] ;
  int [ ] costM = new int [ N ] ;
  int [ ] bMin = new int [ N ] ;
  Arrays . fill ( bMin , INF ) ;
  costM [ 0 ] = bMin [ 0 ] = 0 ;
  while ( que . length > 0 ) {
    int cost = que [ 0 ] ;
    int v = que [ 1 ] ;
    if ( costM [ v ] < cost ) continue ;
    for ( int w = 0 ;
    w < G [ v ] . length ;
    w ++ ) if ( G [ v ] [ w ] < cost ) {
      if ( cost + 1 < costM [ w ] ) {
        costM [ w ] = cost + 1 ;
        heapSort ( que , cost + 1 , w ) ;
      }
    }
    else {
      if ( cost + N < costM [ w ] ) {
        costM [ w ] = cost + N ;
        heapSort ( que , cost + N , w ) ;
      }
    }
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    bMin [ i ] = b = costM [ i ] / N ;
    costM [ i ] = ( ( costM [ i ] % N ) + b * ( b + 1 ) / 2 ) + 1 ;
  }
  que = new int [ N ] ;
  int [ ] [ ] dist = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) dist [ i ] [ 0 ] = 0 ;
  while ( que . length > 0 ) {
    int cost = que [ 0 ] ;
    int v = que [ 1 ] ;
    if ( dist [ v ] [ k ] < cost ) continue ;
    for ( int