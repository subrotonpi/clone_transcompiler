@ VisibleForTesting static String [ ] [ ] solve ( ) {
  final Range range = xrange ;
  final int [ ] [ ] buf = null ;
  final Function < String , String [ ] > identity = new Function < String , String [ ] > ( ) {
    @ Override public String [ ] apply ( String input ) {
      if ( input != null ) {
        String [ ] res = input . split ( "\n" ) ;
        input = null ;
      }
      else {
        String [ ] res = IN . readLine ( ) ;
        if ( res == null ) {
          return null ;
        }
        int r = range . size ( ) ;
        int c = range . size ( ) ;
        for ( int j = 0 ;
        j < r ;
        ++ j ) {
          if ( r < e || e < 2 * ( a + b - 2 ) ) continue ;
          int [ ] l = new int [ r ] ;
          for ( int i = 0 ;
          i < l . length ;
          ++ i ) {
            l [ i ] = i ;
          }
          for ( int j = 0 ;
          j < l [ i ] ;
          ++ j ) {
            res [ i ] [ j ] = "." ;
          }
        }
        return res ;
      }
    }
  }
  ;
  final Function < String , String [ ] > def = new Function < String , String [ ] > ( ) {
    @ Override public String [ ] apply ( String input ) {
      String [ ] line = readLineRaw ( input ) ;
      if ( line == null ) {
        return new String [ ] {
          "c" + "." * ( e - 1 ) }
          ;
        }
        if ( line . length == 1 ) {
          return null ;
        }
        String [ ] res = new String [ ] {
          "*" }
          ;
          for ( int a = 0 ;
          a < r ;
          ++ a ) {
            for ( int j = 0 ;
            j < c ;
            ++ j ) {
              res [ a ] = Arrays . copyOf ( line , b ) ;
            }
          }
          return res ;
        }
      }
      ;
      final Function < String , String [ ] > conv = identity ;
      String [ ] [ ] res = conv . apply ( line . replaceAll ( "\\s+" , "" ) ) ;
      @ SuppressWarnings ( "unused" ) String [ ] [ ] splitline = conv . apply ( line ) ;
      return res ;
    }
    