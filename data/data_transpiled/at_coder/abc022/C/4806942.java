@ VisibleForTesting static void floydWarshall ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > [ ] UVL = new List [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    UVL [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  final float INF = Float . POSITIVE_INFINITY ;
  int [ ] [ ] d = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    d [ i ] [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int u = UVL [ i ] [ 0 ] ;
    int v = UVL [ i ] [ 1 ] ;
    int l = UVL [ i ] [ 2 ] ;
    if ( u != 1 && v != 1 ) {
      d [ u - 1 ] [ v - 1 ] = l ;
      d [ v - 1 ] [ u - 1 ] = l ;
    }
  }
  d = wf ( d ) ;
  List < Integer > start = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    if ( UVL [ i ] [ 0 ] == 1 ) {
      start . add ( UVL [ i ] ) ;
    }
  }
  float ans = INF ;
  for ( int i = 0 ;
  i < start . size ( ) ;
  i ++ ) {
    for ( int j = 0 ;
    j < start . size ( ) ;
    j ++ ) {
      if ( start . get ( i ) != start . get ( j ) && d [ i ] [ 1 ] - 1 ] [ j - 1 ] != INF ) {
        float tmp = start . get ( i ) [ 2 ] + start . get ( j ) [ 2 ] + d [ i ] [ 1 ] - 1 ] [ j - 1 ] ;
        ans = Math . min ( ans , tmp ) ;
      }
    }
  }
  if ( ans == INF ) {
    System . out . println ( - 1 ) ;
  }
  else {
    System . out . println ( ( int ) ans ) ;
  }
}
