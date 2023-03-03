public static String Deg ( int Dis ) {
  String Dir , W ;
  if ( 112.5 <= Deg && Dis < 337.5 ) Dir = "NNE" ;
  else if ( 337.5 <= Deg && Dis < 562.5 ) Dir = "NE" ;
  else if ( 562.5 <= Deg && Dis < 787.5 ) Dir = "ENE" ;
  else if ( 787.5 <= Deg && Dis < 1012.5 ) Dir = "E" ;
  else if ( 1012.5 <= Deg && Dis < 1237.5 ) Dir = "ESE" ;
  else if ( 1237.5 <= Deg && Dis < 1462.5 ) Dir = "SE" ;
  else if ( 1462.5 <= Deg && Dis < 1687.5 ) Dir = "SSE" ;
  else if ( 1687.5 <= Deg && Dis < 1912.5 ) Dir = "S" ;
  else if ( 1912.5 <= Deg && Dis < 2137.5 ) Dir = "SSW" ;
  else if ( 2137.5 <= Deg && Dis < 2362.5 ) Dir = "SW" ;
  else if ( 2362.5 <= Deg && Dis < 2587.5 ) Dir = "WSW" ;
  else if ( 2587.5 <= Deg && Dis < 2812.5 ) Dir = "W" ;
  else if ( 2812.5 <= Deg && Dis < 3037.5 ) Dir = "WNW" ;
  else if ( 3037.5 <= Deg && Dis < 3262.5 ) Dir = "NW" ;
  else if ( 3262.5 <= Deg && Dis < 3487.5 ) Dir = "NNW" ;
  else Dir = "N" ;
  if ( 0 <= Dis && Dis < 15 ) W = "0" ;
  else Dir = "C" ;
  else if ( 15 <= Dis && Dis < 93 ) W = "1" ;
  else if ( 93 <= Dis && Dis < 201 ) W = "2" ;
  else if ( 201 <= Dis && Dis < 327 ) W = "3" ;
  else if ( 327 <= Dis && Dis < 477 ) W = "4" ;
  else if ( 477 <= Dis && Dis < 645 ) W = "5" ;
  else if ( 645 <= Dis && Dis < 831 ) W = "6" ;
  else if ( 831 <= Dis && Dis < 1029 ) W = "7" ;
  else if ( 1029 <= Dis && Dis < 12 @ @