public static int [ ] input ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] d_name = {
    "N" , "NNE" , "NE" , "ENE" , "E" , "ESE" , "SE" , "SSE" , "S" , "SSW" , "SW" , "WSW" , "W" , "WNW" , "NW" , "NNW" , "N" , "C" }
    ;
    double [ ] max_s = {
      0.24 , 1.54 , 3.34 , 5.44 , 7.94 , 10.74 , 13.84 , 17.14 , 20.74 , 24.44 , 28.44 , 32.64 , 200 }
      ;
      for ( int i = 0 ;
      i < 17 ;
      i ++ ) {
        if ( N < 112.5 + 225 * i ) break ;
      }
      for ( int j = 0 ;
      j < 13 ;
      j ++ ) {
        if ( M <= max_s [ j ] * 60 ) break ;
      }
      return d_name ;
    }
    