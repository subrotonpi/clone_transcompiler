public static double convert ( String input , int dis ) {
  double deg = Integer . parseInt ( input ) ;
  double dct = 0 ;
  int [ ] jdegs = new int [ 17 ] ;
  for ( int j = 0 ;
  j < jdegs . length ;
  j ++ ) {
    jdegs [ j ] = 1125 + j * ( 36000 / 16 ) ;
  }
  String [ ] jdcts = {
    "N" , "NNE" , "NE" , "ENE" , "E" , "ESE" , "SE" , "SSE" , "S" , "SSW" , "SW" , "WSW" , "W" , "WNW" , "NW" , "NNW" , "N" }
    ;
    for ( int i = 0 ;
    i < jdegs . length ;
    i ++ ) {
      double jdeg = jdegs [ i ] ;
      dct = jdcts [ i ] ;
      if ( deg < jdeg ) {
        dct = jdct ;
        break ;
      }
    }
    double jpows [ i ] = 0.2 ;
    double jpows [ i ] = 1.0 ;
    return ( dct + " " + jpows [ i ] ) ;
  }
  