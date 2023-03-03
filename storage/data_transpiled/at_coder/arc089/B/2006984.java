@ VisibleForTesting static Iterable < Integer > accumulate ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = input . nextInt ( ) ;
  int k2 = k * 2 ;
  int [ ] [ ] reqB = new int [ k ] [ k ] ;
  int [ ] [ ] reqW = new int [ k ] [ k ] ;
  int bc = 0 , wc = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String x = input . nextLine ( ) ;
    String y = input . nextLine ( ) ;
    char c = 'A' ;
    x = Integer . parseInt ( x ) ;
    y = Integer . parseInt ( y ) ;
    int rx = x % k2 , ry = y % k2 ;
    boolean b = c == 'B' ;
    if ( rx >= k ) {
      rx -= k ;
      if ( ry >= k ) {
        ry -= k ;
      }
      else {
        b = ! b ;
      }
    }
    else if ( ry >= k ) {
      ry -= k ;
      b = ! b ;
    }
    if ( b ) {
      reqB [ rx ] [ ry ] ++ ;
      bc ++ ;
    }
    else {
      reqW [ rx ] [ ry ] ++ ;
      wc ++ ;
    }
  }
  Arrays . sort ( reqB ) ;
  Arrays . sort ( reqW ) ;
  int a = 0 ;
  int kb = reqB [ reqB . length - 1 ] , kw = reqW [ reqB . length - 1 ] ;
  for ( int dx = 0 ;
  dx < k ;
  dx ++ ) {
    final int [ ] dx_b = reqB [ dx ] ;
    final int [ ] dx_w = reqW [ dx ] ;
    final int dxk_b = dx_b [ dx ] ;
    final int dxk_w = dx_w [ dx ] ;
    for ( int b1 = dx_b ;
    b1 < dxk_b ;
    b1 ++ ) {
      int w1 = dx_b [ dx ] ;
      int kyb = dx_w [ dx ] ;
      int kyw = dx_w [ dx ] ;
      b = bc - kyb - dxk_b + b1 * 2 ;
      w = wc - kyw - dxk_w + w1 * 2 ;
      a = b + wc - w ;
      ans = Math . max ( ans , a , n - a ) ;
    }
  }
  System . out . println ( ans ) ;
  return reqB ;
}
