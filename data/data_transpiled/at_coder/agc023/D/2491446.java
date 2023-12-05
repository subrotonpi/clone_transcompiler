static final double solve ( List < Stop > l , List < Stop > r ) {
  Collections . reverse ( l ) ;
  List < Stop > stops = new ArrayList < > ( ) ;
  if ( l != null && r != null ) {
    while ( l . size ( ) > 0 && r . size ( ) > 0 ) {
      Stop lx = l . remove ( l . size ( ) - 1 ) ;
      int lp = l . size ( ) ;
      Stop rx = r . remove ( r . size ( ) - 1 ) ;
      int rp = r . size ( ) ;
      if ( lp >= rp ) {
        l . add ( new Stop ( lx , lp + rp ) ) ;
        stops . add ( rx ) ;
      }
      else {
        r . add ( new Stop ( rx , lp + rp ) ) ;
      }
    }
  }
  return Math . abs ( stops . size ( ) ) ;
}
