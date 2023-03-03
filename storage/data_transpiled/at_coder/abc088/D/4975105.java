public static final int [ ] [ ] getLines ( ) {
  int h = Integer . parseInt ( input . readLine ( ) ) ;
  int w = Integer . parseInt ( input . readLine ( ) ) ;
  char [ ] [ ] s = new char [ h ] [ w ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    s [ i ] [ 0 ] = input . charAt ( i ) ;
  }
  int white = 0 ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    for ( int j = 0 ;
    j < w ;
    j ++ ) {
      if ( s [ i ] [ j ] == '.' ) {
        white ++ ;
      }
    }
  }
  Queue < Point > q = new LinkedList < > ( ) ;
  int [ ] [ ] move = {
    {
      0 , 1 }
      , {
        0 , - 1 }
        , {
          1 , 0 }
          , {
            - 1 , 0 }
          }
          ;
          q . add ( new Point ( 0 , 0 ) ) ;
          float inf = Float . POSITIVE_INFINITY ;
          int [ ] [ ] d = new int [ w ] [ h ] ;
          for ( int i = 0 ;
          i < w ;
          i ++ ) {
            for ( int j = 0 ;
            j < h ;
            j ++ ) {
              d [ i ] [ j ] = inf ;
            }
            d [ 0 ] [ 0 ] = 0 ;
            while ( ! q . isEmpty ( ) ) {
              Point p = q . poll ( ) ;
              for ( int m : move ) {
                if ( 0 <= p . x + m [ 0 ] && p . x + m [ 0 ] < h && 0 <= p . y + m [ 1 ] && d [ p . x + m [ 0 ] ] [ p . y + m [ 1 ] ] == inf && s [ p . x + m [ 0 ] ] [ p . y + m [ 1 ] ] != '#' ) {
                  d [ p . x + m [ 0 ] ] [ p . y + m [ 1 ] ] = d [ p . x ] [ p . y ] + 1 ;
                  q . add ( new Point ( p . x + m [ 0 ] , p . y + m [ 1 ] ) ) ;
                }
              }
            }
          }
          if ( d [ h - 1 ] [ w - 1 ] == inf ) {
            System . out . println ( - 1 ) ;
          }
          else {
            System . out . println ( white - d [ h - 1 ] [ w - 1 ] - 1