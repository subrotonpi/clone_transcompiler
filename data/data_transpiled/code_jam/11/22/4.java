static final Scanner case = new Scanner ( System . in ) {
  private int C = Integer . parseInt ( System . in . nextLine ( ) ) ;
  private int D = Integer . parseInt ( System . in . nextLine ( ) ) ;
  private int [ ] start = new int [ C ] ;
  private int [ ] vendors = new int [ C ] ;
  private final int [ ] pvs = new int [ C ] ;
  {
    for ( int i = 0 ;
    i < C ;
    i ++ ) {
      int p = Integer . parseInt ( System . in . nextLine ( ) ) ;
      int v = Integer . parseInt ( System . in . nextLine ( ) ) ;
      pvs [ p ] = pv ;
      start [ p ] = v ;
      vendors [ p ] = v ;
    }
  }
  private boolean possible ( int motion ) {
    int x = start [ 0 ] - motion ;
    for ( int i = 0 ;
    i < pvs . length ;
    i ++ ) {
      int p = pvs [ i ] ;
      int v = vendors [ i ] ;
      if ( p + motion < x ) return false ;
      int first = Math . max ( p - motion , x ) ;
      int last = first + ( v - 1 ) * D ;
      if ( Math . abs ( last - p ) > motion ) return false ;
      x = last + D ;
    }
    return true ;
  }
  private int l = 0.0 ;
  double u = 1.0 ;
  while ( ! possible ( u ) ) {
    l = u ;
    u *= 2 ;
  }
  while ( ( u - l ) > 1e-8 ) {
    int m = ( u + l ) / 2 ;
    if ( m == u || m == l ) return m ;
    if ( possible ( m ) ) u = m ;
    else l = m ;
  }
  return m ;
}
