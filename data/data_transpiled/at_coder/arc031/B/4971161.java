{
  island = new String [ 10 ] ;
  for ( int i = 0 ;
  i < 10 ;
  i ++ ) {
    island [ i ] = input . charAt ( i ) ;
  }
  int [ ] [ ] m = {
    {
      1 , 0 }
      , {
        - 1 , 0 }
        , {
          0 , 1 }
          , {
            0 , - 1 }
          }
          ;
          for ( int i = 0 ;
          i < 10 ;
          i ++ ) {
            for ( int j = 0 ;
            j < 10 ;
            j ++ ) {
              String [ ] island2 = new String [ 10 ] ;
              for ( int k = 0 ;
              k < 10 ;
              k ++ ) {
                island2 [ k ] = island [ k ] ;
              }
              if ( island2 [ i ] [ j ] . equals ( "x" ) ) {
                island2 [ i ] = island2 [ i ] . substring ( 0 , j ) + "o" + island2 [ i ] . substring ( j + 1 ) ;
                boolean flag = false ;
                int count = 0 ;
                Stack < Integer > stack = new Stack < Integer > ( ) ;
                for ( int i2 = 0 ;
                i2 < 10 ;
                i2 ++ ) {
                  for ( int j2 = 0 ;
                  j2 < 10 ;
                  j2 ++ ) {
                    if ( island2 [ i2 ] [ j2 ] . equals ( "o" ) ) {
                      count ++ ;
                      if ( count > 1 ) {
                        flag = true ;
                      }
                      if ( flag ) {
                        break ;
                      }
                      stack . push ( new Integer ( i2 ) ) ;
                      while ( stack . size ( ) > 0 ) {
                        Integer [ ] p = stack . pop ( ) ;
                        island2 [ p [ 0 ] ] = island2 [ p [ 0 ] . substring ( 0 , p [ 1 ] . length ( ) ) + "x" + island2 [ p [ 0 ] . substring ( p [ 1 ] . length ( ) + 1 ) ] ;
                        for ( int k2 = 0 ;
                        k2 < m . length ;
                        k2 ++ ) {
                          if ( 0 <= p [ 0 ] + m [ k2 ] [ 0 ] && p [ 1 ] < 10 && 0 <= p [ 1 ] + m [ k2 ] [ 1 ] && island2 [ p [ 0 ] + m [ k2 ] [ 0 ] + m [ k2 ] [ 1 ] + m [ k2 ] [ 1 ] + m [ k2 ] [ 2 ] + m [ k2 ] [ 2 ] + m [ 2 ] [ 0 ] + m [ k2 ]