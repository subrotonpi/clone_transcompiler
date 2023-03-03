public static String [ ] [ ] [ ] getStrings ( int h , int w ) {
  int len = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] s = new int [ len ] [ h ] ;
  int [ ] dx = {
    - 1 , 0 , 1 }
    ;
    int [ ] dy = {
      - 1 , 0 , 1 }
      ;
      char [ ] [ ] [ ] a = new char [ len ] [ w ] ;
      for ( int j = 0 ;
      j < len ;
      j ++ ) {
        for ( int i = 0 ;
        i < len ;
        i ++ ) {
          for ( int j = 0 ;
          j < len ;
          j ++ ) {
            if ( s [ i ] [ j ] == '.' ) {
              for ( int x = 0 ;
              x < len ;
              x ++ ) {
                for ( int y = 0 ;
                y < len ;
                y ++ ) {
                  if ( x != 0 || y != 0 ) {
                    int nx = i + x ;
                    int ny = j + y ;
                    if ( 0 <= nx && nx < h && 0 <= ny && ny < w ) {
                      a [ nx ] [ ny ] = '.' ;
                    }
                  }
                }
              }
            }
          }
        }
      }
      char [ ] [ ] b = new char [ len ] [ w ] ;
      for ( int j = 0 ;
      j < len ;
      j ++ ) {
        for ( int i = 0 ;
        i < len ;
        i ++ ) {
          for ( int j = 0 ;
          j < len ;
          j ++ ) {
            if ( a [ i ] [ j ] == '#' ) {
              for ( int x = 0 ;
              x < len ;
              x ++ ) {
                for ( int y = 0 ;
                y < len ;
                y ++ ) {
                  int nx = i + x ;
                  int ny = j + y ;
                  if ( 0 <= nx && nx < h && 0 <= ny && ny < w ) {
                    b [ nx ] [ ny ] = '#' ;
                  }
                }
              }
            }
          }
        }
      }
      if ( ( b == s ) && ( a [ 0 ] == '#' ) ) {
        System . out . println ( "possible" ) ;
        for ( int i = 0 ;
        i < len ;
        i ++ ) {
          System . out . println ( Arrays . toString ( a [ i ] ) ) ;
        }
      }
      else {
        System . out . println ( "impossible" ) ;
      }
      return a ;
    }
    