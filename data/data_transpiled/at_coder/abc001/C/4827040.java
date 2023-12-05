@ VisibleForTesting static String print ( String input ) {
  float Deg , Dis ;
  String Dir = "N" ;
  float [ ] DegList = new float [ 16 ] ;
  for ( int i = 0 ;
  i < 16 ;
  i ++ ) DegList [ i ] = 11.25 + 22.5 * i ;
  String [ ] DirList = {
    "N" , "NNE" , "NE" , "ENE" , "E" , "ESE" , "SE" , "SSE" , "S" , "SSW" , "SW" , "WSW" , "W" , "WNW" , "NW" , "NNW" }
    ;
    float [ ] DisList = {
      0.2 , 1.5 , 3.3 , 5.4 , 7.9 , 10.7 , 13.8 , 17.1 , 20.7 , 24.4 , 28.4 , 32.6 }
      ;
      Deg = ( float ) ( new BigDecimal ( String . valueOf ( Deg / 10 ) ) . setScale ( 2 , RoundingMode . HALF_UP ) ) ;
      for ( int i = 0 ;
      i < DegList . length ;
      i ++ ) {
        if ( Deg < DegList [ i ] ) {
          Dir = DirList [ i ] ;
          break ;
        }
      }
      Dis = ( float ) ( new BigDecimal ( String . valueOf ( Dis / 60 ) ) . setScale ( 2 , RoundingMode . HALF_UP ) ) ;
      int W = 12 ;
      for ( int i = 0 ;
      i < DisList . length ;
      i ++ ) {
        if ( Dis <= DisList [ i ] ) {
          W = DisList [ i ] ;
          if ( W == 0 ) Dir = "C" ;
          break ;
        }
      }
      System . out . println ( Dir + " " + W ) ;
      return Dir ;
    }
    