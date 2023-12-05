public static void print ( String input ) {
  int h = Integer . parseInt ( input . substring ( 0 , h ) ) ;
  int w = Integer . parseInt ( input . substring ( w , h ) ) ;
  StringBuilder s = new StringBuilder ( ) ;
  int [ ] dx = {
    - 1 , 0 , 1 }
    ;
    int [ ] dy = {
      - 1 , 0 , 1 }
      ;
      for ( int i = 0 ;
      i < h ;
      i ++ ) {
        for ( int j = 0 ;
        j < w ;
        j ++ ) {
          int count = 0 ;
          if ( s . charAt ( i ) == '#' ) {
            continue ;
          }
          if ( s . charAt ( i ) == '.' ) {
            for ( int l = 0 ;
            l < dx . length ;
            l ++ ) {
              for ( int m = 0 ;
              m < dy . length ;
              m ++ ) {
                if ( i + l < 0 || i + l > h - 1 || j + m < 0 || j + m > w - 1 ) {
                  continue ;
                }
                if ( s . charAt ( i + l ) == '#' ) {
                  count ++ ;
                }
              }
            }
          }
          s . setCharAt ( i , String . valueOf ( count ) ) ;
        }
      }
      for ( int i = 0 ;
      i < s . length ( ) ;
      i ++ ) {
        String k = s . substring ( i , i + 1 ) ;
        print ( k ) ;
      }
    }
    