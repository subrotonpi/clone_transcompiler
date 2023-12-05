public static int Deg ( String input , int Dis ) {
  String [ ] Direction = {
    "N" , "NNE" , "NE" , "ENE" , "E" , "ESE" , "SE" , "SSE" , "S" , "SSW" , "SW" , "WSW" , "W" , "WNW" , "NW" , "NNW" , "N" , "C" }
    ;
    double [ ] Speed = {
      0.24 , 1.54 , 3.34 , 5.44 , 7.94 , 10.74 , 13.84 , 17.14 , 20.74 , 24.44 , 28.44 , 32.64 , 200 }
      ;
      for ( int i = 0 ;
      i < Direction . length ;
      i ++ ) if ( Deg < 112.5 + 225 * i ) break ;
      for ( int j = 0 ;
      j < Speed . length ;
      j ++ ) if ( Dis <= Speed [ j ] * 60 ) break ;
      return - 1 ;
    }
    