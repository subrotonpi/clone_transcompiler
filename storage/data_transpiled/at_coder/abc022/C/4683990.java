@ VisibleForTesting static Iterable < Edge > solve ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  double inf = Double . POSITIVE_INFINITY ;
  int [ ] [ ] edges = new int [ n ] [ n ] ;
  for ( int j = 0 ;
  j < n ;
  ++ j ) {
    edges [ j ] [ j ] = inf ;
  }
  for ( int i = 0 ;
  i < n ;
  ++ i ) {
    edges [ i ] [ i ] = 0 ;
  }
  List < Edge > s = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < m ;
  ++ i ) {
    int u = Integer . parseInt ( input . nextLine ( ) ) ;
    int v = Integer . parseInt ( input . nextLine ( ) ) ;
    int l = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( u == 1 ) {
      s . add ( new Edge ( v - 1 , l ) ) ;
    }
    else if ( v == 1 ) {
      s . add ( new Edge ( u - 1 , l ) ) ;
    }
    else {
      edges [ u - 1 ] [ v - 1 ] = l ;
      edges [ v - 1 ] [ u - 1 ] = l ;
    }
  }
  double [ ] [ ] dist = wf ( edges , false ) ;
  double ans = inf ;
  for ( int i = 0 ;
  i < s . size ( ) ;
  ++ i ) {
    int u = s . get ( i ) [ 0 ] ;
    int v = s . get ( i ) [ 1 ] ;
    double d = dist [ u ] [ v ] [ 0 ] ;
    if ( d != inf ) {
      ans = Math . min ( ans , u + v + 1 + ( int ) d ) ;
    }
  }
  if ( ans == inf ) {
    System . out . println ( - 1 ) ;
  }
  else {
    System . out . println ( ans ) ;
  }
  return s ;
}
