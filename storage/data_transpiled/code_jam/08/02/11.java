static final String getClosestTime ( int [ ] [ ] times , int minutes ) {
  if ( times . length == 0 || times [ times . length - 1 ] [ 0 ] < minutes ) return null ;
  if ( times [ 0 ] [ 0 ] >= minutes ) return 0 ;
  int l = 0 , r = times . length ;
  while ( Math . abs ( l - r ) > 1 ) {
    int m = ( l + r ) / 2 ;
    if ( times [ m ] [ 0 ] >= minutes ) r = m ;
    else l = m ;
  }
  assert ( times [ r - 1 ] [ 0 ] < minutes ) ;
  assert ( times [ r ] [ 0 ] >= minutes ) ;
  return "Case #%i: %i %i" ;
}
