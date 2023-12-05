public static int a , int b = Integer . parseInt ( input ) {
  String [ ] d = {
    "N" , "NNE" , "NE" , "ENE" , "E" , "ESE" , "SE" , "SSE" , "S" , "SSW" , "SW" , "WSW" , "W" , "WNW" , "NW" , "NNW" }
    ;
    if ( a < 112.5 || a >= 3487.5 ) {
      a = d [ 0 ] ;
    }
    else {
      a = d [ ( int ) ( ( a + 112.5 ) / 225 ) ] ;
    }
    double [ ] w = {
      0.2 , 1.5 , 3.3 , 5.4 , 7.9 , 10.7 , 13.8 , 17.1 , 20.7 , 24.4 , 28.4 , 32.6 }
      ;
      b /= 60 ;
      b += 0.00001 ;
      int c = ( int ) ( b * 100 ) ;
      if ( c % 10 >= 5 ) {
        c += 10 ;
      }
      c /= 10 ;
      b = c / 10.0 ;
      for ( int i = 0 ;
      i < 12 ;
      i ++ ) {
        if ( b <= w [ i ] ) {
          b = i ;
          break ;
        }
      }
      else {
        b = 12 ;
      }
      if ( b == 0 ) {
        System . out . println ( "C 0" ) ;
      }
      else {
        System . out . println ( a + " " + b ) ;
      }
      return a ;
    }
    