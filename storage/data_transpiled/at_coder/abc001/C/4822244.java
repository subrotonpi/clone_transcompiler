public static int Deg ( int Dis ) {
  int W , Dis = Integer . parseInt ( input ) ;
  Deg *= 10 ;
  if ( 1125 <= Deg && Dis < 3375 ) {
    Dir = "NNE" ;
  }
  else if ( 3375 <= Deg && Dis < 5625 ) {
    Dir = "NE" ;
  }
  else if ( 5625 <= Deg && Dis < 7875 ) {
    Dir = "ENE" ;
  }
  else if ( 7875 <= Deg && Dis < 10125 ) {
    Dir = "E" ;
  }
  else if ( 10125 <= Deg && Dis < 12375 ) {
    Dir = "ESE" ;
  }
  else if ( 12375 <= Deg && Dis < 14625 ) {
    Dir = "SE" ;
  }
  else if ( 14625 <= Deg && Dis < 16875 ) {
    Dir = "SSE" ;
  }
  else if ( 16875 <= Deg && Dis < 19125 ) {
    Dir = "S" ;
  }
  else if ( 19125 <= Deg && Dis < 21375 ) {
    Dir = "SSW" ;
  }
  else if ( 21375 <= Deg && Dis < 23625 ) {
    Dir = "SW" ;
  }
  else if ( 23625 <= Deg && Dis < 25875 ) {
    Dir = "WSW" ;
  }
  else if ( 25875 <= Deg && Dis < 28125 ) {
    Dir = "W" ;
  }
  else if ( 28125 <= Deg && Dis < 30375 ) {
    Dir = "WNW" ;
  }
  else if ( 30375 <= Deg && Dis < 32625 ) {
    Dir = "NW" ;
  }
  else if ( 32625 <= Deg && Dis < 34875 ) {
    Dir = "NNW" ;
  }
  else {
    Dir = "N" ;
  }
  Dis = Math . round ( Dis / 60 + 0.01 ) ;
  if ( 0.0 <= Dis && Dis <= 0.2 ) {
    W = 0 ;
  }
  else if ( 0.3 <= Dis && Dis <= 1.5 ) {
    W = 1 ;
  }
  else if ( 1.6 <= Dis && Dis <= 3.3 ) {
    W = 2 ;
  }
  else if ( 3.4 <= Dis && Dis <= 5.4 ) {
    W = 3 ;
  }
  else if ( 5.5 <= Dis && Dis <= 7.9 ) {
    W = 4 ;
  }
  else if ( 8.0 <= Dis && Dis <= 10.7 ) {
    