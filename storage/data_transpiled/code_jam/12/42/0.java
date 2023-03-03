static String [ ] [ ] calc ( double [ ] a , int w , int l , int [ ] b ) {
  final double [ ] [ ] res = new double [ a . length ] [ ] ;
  for ( int i = 0 ;
  i < res . length ;
  i ++ ) {
    res [ i ] [ 0 ] = null ;
  }
  double cx = 0.0 ;
  double cy = 0 ;
  double ny = 0.0 ;
  int i = b [ 0 ] ;
  res [ i ] = new double [ ] {
    0.0 , 0.0 }
    ;
    cx = a [ i ] ;
    ny = a [ i ] ;
    for ( ;
    i < b . length ;
    i ++ ) {
      if ( cx + a [ i ] <= w ) {
        final double ix = cx + a [ i ] ;
        if ( cy == 0 ) {
          final double iy = 0.0 ;
          ny = Math . max ( ny , a [ i ] ) ;
        }
        else {
          final double iy = cy + a [ i ] ;
          if ( iy > l ) {
            return null ;
          }
        }
        res [ i ] [ 0 ] = ix ;
        res [ i ] [ 1 ] = iy ;
        cx = ix + a [ i ] ;
        ny = Math . max ( ny , iy + a [ i ] ) ;
      }
      else {
        final double ix = 0.0 ;
        final double iy = ny + a [ i ] ;
        if ( iy > l ) {
          return null ;
        }
        res [ i ] = new double [ ] {
          ix , iy }
          ;
          cx = a [ i ] ;
          cy = ny ;
          ny = iy + a [ i ] ;
        }
      }
      return res ;
    }
    