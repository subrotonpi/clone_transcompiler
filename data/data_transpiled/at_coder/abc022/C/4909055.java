@ VisibleForTesting static int [ ] [ ] [ ] graph ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int M = Integer . parseInt ( input ( ) ) ;
  double [ ] [ ] city = new double [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    city [ i ] = new double [ N ] ;
    city [ i ] [ i ] = 0 ;
  }
  double [ ] [ ] home = new double [ M ] [ N ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int u = Integer . parseInt ( input ( ) ) ;
    int v = Integer . parseInt ( input ( ) ) ;
    int l = Integer . parseInt ( input ( ) ) ;
    if ( u == 1 ) {
      home [ i ] [ v - 1 ] = l ;
    }
    else if ( v == 1 ) {
      home [ i ] [ u - 1 ] = l ;
    }
    else {
      city [ u - 1 ] [ v - 1 ] = l ;
      city [ v - 1 ] [ u - 1 ] = l ;
    }
  }
  double [ ] [ ] cityDist = floydWarshall ( city ) ;
  double distMin = Double . MAX_VALUE ;
  for ( int i = 0 ;
  i < home . length ;
  i ++ ) {
    double [ ] u = home [ i ] ;
    double [ ] v = home [ i ] ;
    double dist = cityDist [ u [ 0 ] ] [ v [ 0 ] ] ;
    if ( dist == Double . MAX_VALUE ) {
    }
    else if ( distMin > dist + u [ 1 ] + v [ 1 ] ) {
      distMin = dist + u [ 1 ] + v [ 1 ] ;
    }
    else {
    }
  }
  if ( distMin == Double . MAX_VALUE ) {
    System . out . println ( - 1 ) ;
  }
  else {
    System . out . println ( ( int ) distMin ) ;
  }
  return city ;
}
