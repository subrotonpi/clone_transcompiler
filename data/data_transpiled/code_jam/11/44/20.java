@ VisibleForTesting static int [ ] solve ( int xxx ) {
  final int p = Integer . parseInt ( readLine ( ) ) ;
  final int w = Integer . parseInt ( readLine ( ) ) ;
  final int [ ] [ ] wa = new int [ p ] [ w ] ;
  for ( int i = 0 ;
  i < p ;
  i ++ ) {
    wa [ i ] = new int [ w ] ;
  }
  for ( int i = 0 ;
  i < w ;
  i ++ ) {
    wa [ i ] [ 0 ] = i ;
  }
  for ( int i = 0 ;
  i < p ;
  i ++ ) {
    wa [ i ] [ 1 ] = i ;
  }
  for ( int i = 0 ;
  i < w ;
  i ++ ) {
    wa [ i ] [ 0 ] = i ;
  }
  for ( int i = 0 ;
  i < w ;
  i ++ ) {
    wa [ i ] [ 0 ] = i ;
  }
  final int [ ] dist = new int [ p ] ;
  final Set < Integer > set = new HashSet < Integer > ( ) ;
  final int [ ] prev = new int [ p ] ;
  for ( int i = 0 ;
  i < p ;
  i ++ ) {
    dist [ i ] = INF ;
    prev [ i ] = new int [ w ] ;
  }
  dist [ 0 ] = 0 ;
  while ( ( i = read ( ) ) > 0 ) {
    int u = fmin ( dist , set ) ;
    if ( u == 0 ) {
      break ;
    }
    set . add ( u ) ;
    for ( int v : wa [ u ] ) {
      int alt = dist [ u ] + 1 ;
      if ( alt <= dist [ v ] ) {
        if ( alt < dist [ v ] ) {
          prev [ v ] = new int [ w ] ;
        }
        dist [ v ] = alt ;
        prev [ v ] . add ( u ) ;
      }
    }
    int conq = dist [ 1 ] - 1 ;
    int threaten = 0 ;
    for ( int u = 0 ;
    u < prev [ 1 ] ;
    u ++ ) {
      int tmpThren = maxThren ( wa , prev , u , set . add ( u ) ) ;
      threaten = Math . max ( tmpThren , threaten ) ;
    }
    System . out . println ( "Case #" + xxx + ": " + conq + " " + ( threaten - conq - 1 ) ) ;
  }
  return dist ;
}
