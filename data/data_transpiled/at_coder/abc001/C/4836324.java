@ Nullable public static String getDir ( ) {
  int Deg = Integer . parseInt ( input . nextLine ( ) ) ;
  int Dis = Integer . parseInt ( input . nextLine ( ) ) ;
  String Dir = "N" ;
  if ( Deg < 112.5 ) {
    Dir = "N" ;
  }
  else if ( Deg < 337.5 ) {
    Dir = "NNE" ;
  }
  else if ( Deg < 562.5 ) {
    Dir = "NE" ;
  }
  else if ( Deg < 787.5 ) {
    Dir = "ENE" ;
  }
  else if ( Deg < 1012.5 ) {
    Dir = "E" ;
  }
  else if ( Deg < 1237.5 ) {
    Dir = "ESE" ;
  }
  else if ( Deg < 1462.5 ) {
    Dir = "SE" ;
  }
  else if ( Deg < 1687.5 ) {
    Dir = "SSE" ;
  }
  else if ( Deg < 1912.5 ) {
    Dir = "S" ;
  }
  else if ( Deg < 2137.5 ) {
    Dir = "SSW" ;
  }
  else if ( Deg < 2362.5 ) {
    Dir = "SW" ;
  }
  else if ( Deg < 2587.5 ) {
    Dir = "WSW" ;
  }
  else if ( Deg < 2812.5 ) {
    Dir = "W" ;
  }
  else if ( Deg < 3037.5 ) {
    Dir = "WNW" ;
  }
  else if ( Deg < 3262.5 ) {
    Dir = "NW" ;
  }
  else if ( Deg < 3487.5 ) {
    Dir = "NNW" ;
  }
  float W = 0 ;
  float Fuusoku = ( float ) ( new BigDecimal ( String . valueOf ( Dis / 60 ) ) . setScale ( 2 , ROUND_HALF_UP ) . floatValue ( ) ) ;
  if ( Fuusoku <= 0.2 ) {
    W = 0 ;
  }
  else if ( Fuusoku <= 1.5 ) {
    W = 1 ;
  }
  else if ( Fuusoku <= 3.3 ) {
    W = 2 ;
  }
  else if ( Fuusoku <= 5.4 ) {
    W = 3 ;
  }
  else if ( Fuusoku <= 7.9 ) {
    W = 4 ;
  }
  else if ( Fuusoku <= 10.7 ) {
    W = 5 ;
  }
  else if ( Fuusoku <= 13.8 ) {
    W = 6 ;
  }
  else if ( Fuusoku <= 17.1 ) {
    W = 7 ;
  }
  else if ( Fuusoku <= 20.7 ) {
    W = 8 ;
  }
  