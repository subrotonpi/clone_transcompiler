@ VisibleForTesting public static LinkedList < Integer > readInput ( ) {
  int h = Integer . parseInt ( input . readLine ( ) ) ;
  int w = Integer . parseInt ( input . readLine ( ) ) ;
  char [ ] c = new char [ h ] ;
  int [ ] [ ] check = new int [ w ] [ h ] ;
  for ( int hi = 0 ;
  hi < h ;
  ++ hi ) {
    for ( int wi = 0 ;
    wi < w ;
    ++ wi ) {
      if ( c [ hi ] [ wi ] == 's' ) {
        int sh = hi , sw = wi ;
        if ( c [ hi ] [ wi ] == 's' ) {
          int sh = hi , sw = wi ;
          if ( check [ hi ] [ wi ] == 's' ) {
            sh = sh ;
            sw = wi ;
          }
        }
      }
    }
  }
  LinkedList < Integer > q = new LinkedList < Integer > ( ) ;
  q . add ( new Integer ( sh ) ) ;
  for ( int i = 0 ;
  i < 3 ;
  ++ i ) {
    LinkedList < Integer > wall = new LinkedList < Integer > ( ) ;
    while ( q . size ( ) > 0 ) {
      int hi = q . removeFirst ( ) ;
      int wi = q . removeFirst ( ) ;
      for ( int dh = 1 , dw = 0 ;
      dh <= hi ;
      ++ dw , ++ wi ) {
        if ( h > dh + hi >= 0 && w > dw + wi >= 0 ) {
          if ( c [ dh + hi ] [ dw + wi ] == 'g' ) {
            System . out . println ( "YES" ) ;
            exit ( ) ;
          }
          else if ( c [ dh + hi ] [ dw + wi ] == '.' ) {
            if ( check [ dh + hi ] [ dw + wi ] == 0 ) {
              check [ dh + hi ] [ dw + wi ] = 1 ;
              wall . add ( new Integer ( dh + hi ) ) ;
            }
          }
        }
      }
    }
    q = wall ;
  }
  System . out . println ( "NO" ) ;
  return q ;
}
