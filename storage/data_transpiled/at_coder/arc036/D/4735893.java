static void UnionFindX ( ) {
  int n , q ;
  int [ ] qry = new int [ size ] ;
  for ( ;
  ;
  ) {
    n = input . nextInt ( ) ;
    q = input . nextInt ( ) ;
    qry [ 0 ] = new int [ q ] ;
  }
  {
    int w , x , y , z ;
    int x , y , z ;
    int x , z ;
    int p = 0 ;
    while ( 0 <= x && x <= y ) {
      p += parity [ x ] ;
      x = x ;
    }
    boolean c = check [ x ] ;
    p %= 2 ;
  }
  {
    int rx , cx , px , py ;
    int r ;
    int dx , dy ;
    rx = x ;
    cx = x ;
    px = x ;
    ry = y ;
    cy = y ;
    py = x ;
    r = rx ;
    if ( rx != ry ) {
      dx = - table [ rx ] ;
      dy = - table [ ry ] ;
      if ( dx != dy ) {
        if ( dx < dy ) {
          table [ rx ] = ry ;
          if ( cx > 0 && cy > 0 ) {
            parity [ rx ] = ( p + px + py ) % 2 ;
          }
          else {
            check [ ry ] = false ;
          }
          r = ry ;
        }
        else {
          table [ ry ] = rx ;
          if ( cx > 0 && cy > 0 ) {
            parity [ ry ] = ( p + px + py ) % 2 ;
          }
          else {
            check [ rx ] = false ;
          }
        }
      }
      else {
        if ( ( p + px + py ) % 2 != 0 ) {
          check [ rx ] = false ;
        }
      }
    }
    else {
      if ( ( p + px + py ) % 2 != 0 ) {
        check [ rx ] = false ;
      }
    }
  }
  {
    UnionFindX uf = new UnionFindX ( n + 1 ) ;
    for ( int i = 0 ;
    i < qry . length ;
    i ++ ) {
      int qi ;
      int w = qry [ i ] ;
      x = qry [ i ] ;
      y = qry [ i ] ;
      if ( w == 1 ) uf . unite ( x , y , z ) ;
      else {
        rx = uf . find ( x ) ;
        cx = qry [ i ] ;
        px = qry [ i ] ;
        ry = qry [ i ] ;
        cy = qry [ i ] ;
        py = qry [ i ] ;
        if ( rx == ry ) {
          if ( cx > 0 ) {
            if ( ( px + py ) % 2 != 0 ) System . out . println ( "