public static int N = Integer . parseInt ( input ) {
  int [ ] [ ] xyh = new int [ N ] [ ] ;
  int xx = - 1 , yy = - 1 , hh = - 1 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input . readLine ( ) ) ;
    int y = Integer . parseInt ( input . readLine ( ) ) ;
    int h = Integer . parseInt ( input . readLine ( ) ) ;
    xyh [ i ] = x ;
    if ( h > 0 ) {
      xx = x ;
      yy = y ;
      hh = h ;
    }
  }
  int ansX = - 1 ;
  int ansY = - 1 ;
  int ansH = - 1 ;
  for ( int cx = 0 ;
  cx <= 101 ;
  cx ++ ) {
    for ( int cy = 0 ;
    cy <= 101 ;
    cy ++ ) {
      int H = hh + Math . abs ( xx - cx ) + Math . abs ( yy - cy ) ;
      for ( int x = 0 ;
      x < xyh [ cx ] . length ;
      x ++ ) {
        int y = xyh [ cy ] [ x ] ;
        int h = h ;
        if ( h > 0 && H > 0 ) {
          H = - 1 ;
          break ;
        }
      }
      if ( H > 0 ) {
        ansH = H ;
        ansX = cx ;
        ansY = cy ;
      }
    }
  }
  return ansX + ansY + ansH ;
}
