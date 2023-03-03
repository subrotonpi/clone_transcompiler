@ VisibleForTesting static void input ( Scanner input ) {
  int h = input . nextInt ( ) ;
  int w = input . nextInt ( ) ;
  String [ ] [ ] d = new String [ h ] [ w ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    d [ i ] = input . nextLine ( ) ;
  }
  cost = new int [ h ] [ w ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    cost [ i ] [ 0 ] = i ;
  }
  Queue < Integer > q = new LinkedList < Integer > ( ) ;
  q . add ( new Integer ( 0 ) ) ;
  while ( ! q . isEmpty ( ) ) {
    int hi = q . poll ( ) ;
    int wi = q . poll ( ) ;
    if ( hi == h - 1 && wi == w - 1 ) {
      break ;
    }
    for ( int dh = 0 , dw = 1 ;
    dh < w ;
    dh ++ , wi ++ ) {
      if ( h > dh + hi >= 0 && w > dw + wi >= 0 && d [ dh + hi ] [ dw + wi ] . equals ( "." ) ) {
        if ( cost [ dh + hi ] [ dw + wi ] == 0 || cost [ dh + hi ] [ dw + wi ] > cost [ hi ] [ wi ] + 1 ) {
          cost [ dh + hi ] [ dw + wi ] = cost [ hi ] [ wi ] + 1 ;
          q . add ( q ) ;
        }
      }
    }
  }
  if ( cost [ h - 1 ] [ w - 1 ] == 0 ) {
    System . out . println ( - 1 ) ;
    exit ( ) ;
  }
  int res = 0 ;
  for ( int hi = 0 ;
  hi < h ;
  hi ++ ) {
    for ( int wi = 0 ;
    wi < w ;
    wi ++ ) {
      if ( ( hi == 0 && wi == 0 ) || ( hi == h - 1 && wi == - 1 ) ) {
        continue ;
      }
      if ( d [ hi ] [ wi ] . equals ( "." ) ) {
        res ++ ;
      }
    }
  }
  System . out . println ( res - cost [ h - 1 ] [ w - 1 ] ) ;
}
