static final double [ ] [ ] M = new double [ ] [ ] {
  {
    6 , 2 }
    , {
      - 2 , 0 }
    }
    ;
    final double [ ] V = new double [ ] [ ] {
      {
        - 3 }
        , {
          2 }
        }
        ;
        /* We want to use the multiplication of the multiplication */
        int i = 1 ;
        double accum = Double . NEGATIVE_INFINITY ;
        int working = M [ 0 ] [ 0 ] ;
        do {
          if ( ( e & i ) != 0 ) accum = ( accum * working ) % d ;
          working = ( working * working ) % d ;
          i = i * 2 ;
          if ( e < i ) break ;
        }
        while ( working != 0 ) ;
        if ( getClass ( ) . isEnum ( ) ) {
          String t = readString ( ) ;
          for ( int i = 0 ;
          i < Integer . parseInt ( t ) ;
          i ++ ) {
            int n = Integer . parseInt ( readString ( ) ) ;
            double v = ( Math . pow ( M [ n ] [ 1000 ] , 1000 ) * V ) . A [ 1 ] [ 0 ] - 1 ;
            v = ( v + 1000 ) % 1000 ;
            System . out . format ( "Case #%d: %03d%n" , i + 1 , v ) ;
          }
        }
        return M ;
      }
      