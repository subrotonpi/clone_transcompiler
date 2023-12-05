static class streamreader {
  int [ ] t = ( int [ ] ) ( new char [ ] {
    '/' , '\\' , '/' }
    ) ;
    /* This is a hack to make sure we can do this twice */
    int [ ] s = new int [ ] {
      '/' , '\\' , '/' }
      ;
      final int sr = streamreader ( System . in ) ;
      for ( int tc = xrange ( sr / Integer . MAX_VALUE ) ;
      tc < sr ;
      tc ++ ) {
        /* split string */
        String [ ] split = new String [ s . length ] ;
        int n = sr / Integer . MAX_VALUE , m = sr / Integer . MAX_VALUE ;
        char [ ] [ ] array = new char [ n + 2 ] [ ] ;
        for ( int i = 0 ;
        i < n ;
        i ++ ) {
          array [ i ] = split ( '.' , sr / String . MAX_VALUE + '.' ) ;
        }
        /* print */
        for ( char [ ] l : array ) {
          System . out . println ( new String ( l , 1 , l . length - 1 ) ) ;
        }
        /* print */
        for ( int i = 1 ;
        i <= n ;
        i ++ ) {
          for ( int j = 1 ;
          j <= m ;
          j ++ ) {
            if ( s [ i ] [ j ] == '#' ) {
              if ( s [ i - 1 ] [ j ] != '#' && s [ i ] [ j - 1 ] != '#' ) {
                if ( s [ i + 1 ] [ j ] == '#' && s [ i ] [ j + 1 ] == '#' && s [ i + 1 ] [ j + 1 ] == '#' ) {
                  s [ i ] [ j ] = '/' ;
                  s [ i + 1 ] [ j ] = '\\' ;
                  s [ i ] [ j + 1 ] = '\\' ;
                  s [ i + 1 ] [ j + 1 ] = '/' ;
                }
              }
            }
          }
        }
        /* print */
        boolean possible = true ;
        for ( char [ ] line : array ) {
          if ( new String ( line ) . indexOf ( '#' ) > 0 ) {
            possible = false ;
            break ;
          }
        }
        /* print */
        if ( possible ) {
          pr ( s ) ;
        }
        else {
          System . out . println ( " Impossible