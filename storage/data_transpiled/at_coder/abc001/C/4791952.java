public static String input ( ) {
  String a = input . nextLine ( ) ;
  int b = 0 ;
  int c = 0 ;
  if ( ( int ) a . length ( ) / 60 < 0.25 ) {
    b = "C" ;
  }
  else if ( ( int ) a . length ( ) >= 112.5 && ( int ) a . length ( ) < 5.45 ) {
    c = 3 ;
  }
  else if ( ( int ) a . length ( ) >= 337.5 && ( int ) a . length ( ) < 10.75 ) {
    c = 4 ;
  }
  else if ( ( int ) a . length ( ) >= 337.5 && ( int ) a . length ( ) < 562.5 ) {
    c = 8 ;
  }
  else if ( ( int ) a . length ( ) >= 562.5 && ( int ) a . length ( ) < 787.5 ) {
    b = "ENE" ;
  }
  else if ( ( int ) a . length ( ) >= 787.5 && ( int ) a . length ( ) < 1012.5 ) {
    b = "E" ;
  }
  else if ( ( int ) a . length ( ) >= 1012.5 && ( int ) a . length ( ) < 1237.5 ) {
    b = "ESE" ;
  }
  else if ( ( int ) a . length ( ) >= 1237.5 && ( int ) a . length ( ) < 1462.5 ) {
    b = "SE" ;
  }
  else if ( ( int ) a . length ( ) >= 1687.5 && ( int ) a . length ( ) < 1912.5 ) {
    b = "S" ;
  }
  else if ( ( int ) a . length ( ) >= 1912.5 && ( int ) a . length ( ) < 2137.5 ) {
    b = "SSW" ;
  }
  else if ( ( int ) a . length ( ) >= 2137.5 && ( int ) a . length ( ) < 2362.5 ) {
    b = "SW" ;
  }
  else if ( ( int ) a . length ( ) >= 2587.5 && ( int ) a . length ( ) < 2812.5 ) {
    b = "WSW" ;
  }
  else if ( ( int ) a . length ( ) >= 2587.5 && ( int ) a . length ( ) < 3037.5 ) {
    b = "WNW" ;
  }
  else if ( ( int ) a . length ( ) >= 3037.5 && ( int ) a . length ( ) < 3262.5 ) {
    b = "