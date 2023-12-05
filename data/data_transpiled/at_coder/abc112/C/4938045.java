public static int N = Integer . parseInt ( input ) {
  int [ ] xyh = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    xyh [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  for ( int cx = 0 ;
  cx < 100 + 1 ;
  cx ++ ) {
    for ( int cy = 0 ;
    cy < 100 + 1 ;
    cy ++ ) {
      int H = - 1 ;
      for ( int x = 0 ;
      x < xyh . length ;
      x ++ ) {
        int y = xyh [ x ] ;
        int h = xyh [ y ] ;
        if ( h > 0 ) {
          int t = h + Math . abs ( x - cx ) + Math . abs ( y - cy ) ;
          if ( H == - 1 ) {
            H = t ;
          }
          else {
            if ( H != t ) {
              break ;
            }
          }
        }
      }
    }
  }
  else {
    for ( int x = 0 ;
    x < xyh . length ;
    x ++ ) {
      int y = xyh [ x ] ;
      int h = xyh [ y ] ;
      if ( h != Math . max ( H - Math . abs ( x - cx ) - Math . abs ( y - cy ) , 0 ) ) {
        break ;
      }
    }
    else {
      if ( H >= 1 ) {
        System . out . println ( cx + " " + cy + " " + H ) ;
        exit ( ) ;
      }
    }
  }
  return 0 ;
}
