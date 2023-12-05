public static String print ( int d , int w ) {
  String deg = "N" ;
  int rank = 0 ;
  if ( 112.5 <= d && d < 337.5 ) {
    deg = "NNE" ;
  }
  else if ( 337.5 <= d && d < 562.5 ) {
    deg = "NE" ;
  }
  else if ( 562.5 <= d && d < 787.5 ) {
    deg = "ENE" ;
  }
  else if ( 787.5 <= d && d < 1012.5 ) {
    deg = "E" ;
  }
  else if ( 1012.5 <= d && d < 1237.5 ) {
    deg = "ESE" ;
  }
  else if ( 1237.5 <= d && d < 1462.5 ) {
    deg = "SE" ;
  }
  else if ( 1462.5 <= d && d < 1687.5 ) {
    deg = "SSE" ;
  }
  else if ( 1687.5 <= d && d < 1912.5 ) {
    deg = "S" ;
  }
  else if ( 1912.5 <= d && d < 2137.5 ) {
    deg = "SSW" ;
  }
  else if ( 2137.5 <= d && d < 2362.5 ) {
    deg = "SW" ;
  }
  else if ( 2362.5 <= d && d < 2587.5 ) {
    deg = "WSW" ;
  }
  else if ( 2587.5 <= d && d < 2812.5 ) {
    deg = "W" ;
  }
  else if ( 2812.5 <= d && d < 3037.5 ) {
    deg = "WNW" ;
  }
  else if ( 3037.5 <= d && d < 3262.5 ) {
    deg = "NW" ;
  }
  else if ( 3262.5 <= d && d < 3487.5 ) {
    deg = "NNW" ;
  }
  int dis = ( w + 3 ) / 6 ;
  if ( 0 <= dis && dis <= 2 ) {
    rank = 0 ;
    deg = "C" ;
  }
  else if ( 3 <= dis && dis <= 15 ) {
    rank = 1 ;
  }
  else if ( 16 <= dis && dis <= 33 ) {
    rank = 2 ;
  }
  else if ( 34 <= dis && dis <= 54 ) {
    rank = 3 ;
  }
  else if ( 55 <= dis && dis <= 79 ) {
    rank = 4 ;
  }
  else if ( 80 <= dis && dis <= 107 ) {
    rank = 5 ;
  }
  else if ( 108 <= dis && dis <= 138 ) {
    rank = 6 ;
  }
  else if ( 139 <= dis && dis <= 171 ) {
    