public static int deg10 ( int deg10 , int dis_m ) {
  int deg = deg10 / 10 ;
  char deg_c = 'N' ;
  for ( int i = 0 ;
  i < 6 ;
  i ++ ) {
    deg_c_c = 'N' ;
  }
  for ( int i = 0 ;
  i < 6 ;
  i ++ ) {
    deg_c = 'NNE' ;
    deg_c = 'NE' ;
    deg_c = 'ENE' ;
    deg_c = 'E' ;
    deg_c = 'ESE' ;
    deg_c = 'SE' ;
    deg_c = 'SSE' ;
    deg_c = 'S' ;
    deg_c = 'SSW' ;
    deg_c = 'SW' ;
    deg_c = 'WSW' ;
    deg_c = 'W' ;
    deg_c = 'WNW' ;
  }
  int dis_ = dis_m / 6 ;
  int dis = dis_ / 6 ;
  int _n = dis % 6 ;
  if ( _n >= 0.5 ) dis = dis + 1 ;
  dis = dis / 10 ;
  int w ;
  if ( dis <= 0.2 ) {
    w = 0 ;
    deg_c = 'C' ;
  }
  else if ( dis <= 1.5 ) {
    w = 1 ;
  }
  else if ( dis <= 3.3 ) {
    w = 2 ;
  }
  else if ( dis <= 7.9 ) {
    w = 3 ;
  }
  else if ( dis <= 13.8 ) {
    w = 6 ;
  }
  else {
    w = 7 ;
  }
  return w ;
}
