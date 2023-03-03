public static String xxx ( double a ) {
  if ( a * 10 - ( int ) a * 10 >= 0.5 ) return ( ( int ) a * 10 + 1 ) / 10 ;
  else return ( int ) a * 10 / 10 ;
}
int Deg , Dis ;
int v = ( int ) ( input . nextDouble ( ) ) ;
Dis = ( int ) ( input . nextDouble ( ) ) ;
v = xxx ( Dis / 60 ) ;
int [ ] vlist = {
  0.2 , 1.5 , 3.3 , 5.4 , 7.9 , 10.7 , 13.8 , 17.1 , 20.7 , 24.4 , 28.4 , 32.6 }
  ;
  String [ ] dlist = {
    "NNE" , "NE" , "ENE" , "E" , "ESE" , "SE" , "SSE" , "S" , "SSW" , "SW" , "WSW" , "W" , "WNW" , "NW" , "NNW" }
    ;
    for ( int i = 0 ;
    i < vlist . length ;
    i ++ ) {
      if ( v <= vlist [ i ] ) {
        w = i ;
        break ;
      }
    }
    String Dir ;
    if ( w == 0 ) {
      Dir = "C" ;
    }
    else {
      Deg = Deg / 10 ;
      for ( int i = 0 ;
      i < dlist . length ;
      i ++ ) {
        if ( 11.25 + 22.5 * i <= Deg && Deg < 33.75 + 22.5 * i ) {
          Dir = dlist [ i ] ;
          break ;
        }
      }
    }
    System . out . println ( Dir + " " + w ) ;
    return Dir ;
  }
  