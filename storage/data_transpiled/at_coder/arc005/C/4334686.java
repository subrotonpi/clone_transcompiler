@ VisibleForTesting static void main ( String input ) {
  int h = Integer . parseInt ( input ) ;
  int w = Integer . parseInt ( input ) ;
  char [ ] [ ] board = new char [ h ] [ w ] ;
  for ( int x = 0 ;
  x < w ;
  x ++ ) {
    for ( int y = 0 ;
    y < h ;
    y ++ ) {
      if ( board [ y ] [ x ] == 's' ) {
        s = new char [ ] {
          y , x }
          ;
        }
        if ( board [ y ] [ x ] == 'g' ) {
          g = new char [ ] {
            y , x }
            ;
          }
        }
      }
      int [ ] [ ] d = new int [ w ] [ h ] ;
      int [ ] dx = {
        1 , 0 , - 1 , 0 }
        ;
        int [ ] dy = {
          0 , 1 , 0 , - 1 }
          ;
          Queue < int [ ] > queue = new LinkedList < > ( ) ;
          queue . add ( s ) ;
          d [ s [ 0 ] ] [ s [ 1 ] ] = 0 ;
          while ( queue . size ( ) != 0 ) {
            int [ ] p = queue . poll ( ) ;
            for ( int x = 0 ;
            x < dx . length ;
            x ++ ) {
              int nx = p [ 1 ] + x ;
              int ny = p [ 0 ] + y ;
              if ( 0 <= nx && nx < w && 0 <= ny && ny < h && d [ ny ] [ nx ] == - 1 ) {
                if ( board [ ny ] [ nx ] == '#' ) {
                  d [ ny ] [ nx ] = d [ p [ 0 ] ] [ p [ 1 ] ] + 1 ;
                  queue . add ( new int [ ] {
                    ny , nx }
                    ) ;
                  }
                  else {
                    d [ ny ] [ nx ] = d [ p [ 0 ] ] [ p [ 1 ] ] ;
                    queue . add ( new int [ ] {
                      ny , nx }
                      ) ;
                    }
                  }
                }
              }
              if ( d [ g [ 0 ] ] [ g [ 1 ] ] <= 2 ) {
                System . out . println ( "YES" ) ;
              }
              else {
                System . out . println ( "NO" ) ;
              }
            }
            