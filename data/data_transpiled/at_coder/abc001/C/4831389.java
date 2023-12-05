public static char [ ] dirList = {
  'N' , 'NNE' , 'NE' , 'ENE' , 'E' , 'ESE' , 'SE' , 'SSE' , 'S' , 'SSW' , 'SW' , 'WSW' , 'W' , 'WNW' , 'NW' , 'NNW' }
  ;
  char [ ] wList = {
    0.25 , 1.55 , 3.35 , 5.45 , 7.95 , 10.75 , 13.85 , 17.15 , 20.75 , 24.45 , 28.45 , 32.65 }
    ;
    int Deg = Integer . parseInt ( input ) ;
    int Dis = Integer . parseInt ( input ) ;
    int W = 0 ;
    int Diss = Dis / 60 ;
    for ( int i = 0 ;
    i < wList . length ;
    i ++ ) {
      if ( wList [ i ] <= Diss ) {
        W ++ ;
      }
      else {
        break ;
      }
    }
    if ( W != 0 ) {
      char Dir = dirList [ ( int ) ( Deg * 10 + 1125 ) / 2250 % 16 ] ;
      if ( Dir != 'C' ) {
        return Dir ;
      }
    }
    return W ;
  }
  