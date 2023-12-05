@ Sys public static void Sys ( ) throws IOException {
  int Deg = Integer . parseInt ( stdin . readLine ( ) ) ;
  int Dis = Integer . parseInt ( stdin . readLine ( ) ) ;
  double Dis_beawfort = new BigDecimal ( String . valueOf ( Dis / 60 ) ) . setScale ( 2 , BigDecimal . ROUND_HALF_UP ) . doubleValue ( ) ;
  if ( Dis_beawfort <= 0.2 ) {
    System . out . println ( "C" + 0 ) ;
  }
  else {
    double a = Deg / 10 ;
    double b = Dis_beawfort ;
    double [ ] houi_down = {
      11.25 , 33.75 , 56.25 , 78.75 , 101.25 , 123.75 , 146.25 , 168.75 , 191.25 , 213.75 , 236.25 , 258.75 , 281.25 , 303.75 , 326.25 }
      ;
      String [ ] houis = {
        "NNE" , "NE" , "ENE" , "E" , "ESE" , "SE" , "SSE" , "S" , "SSW" , "SW" , "WSW" , "W" , "WNW" , "NW" , "NNW" }
        ;
        String houi = null ;
        for ( int i = 0 ;
        i < houi_down . length ;
        i ++ ) {
          if ( houi_down [ i ] <= a ) houi = houis [ i ] ;
          else break ;
        }
        if ( houi == null ) houi = "N" ;
        if ( houi . equals ( "NNW" ) ) {
          if ( a < 348.75 ) {
          }
          else {
            houi = "N" ;
          }
        }
        double [ ] huryoku_down = {
          0.3 , 1.6 , 3.4 , 5.5 , 8.0 , 10.8 , 13.9 , 17.2 , 20.8 , 24.5 , 28.5 , 32.7 }
          ;
          for ( int i = 0 ;
          i < huryoku_down . length ;
          i ++ ) {
            if ( huryoku_down [ i ] <= ( double ) b ) huryoku = i + 1 ;
            else break ;
          }
          System . out . println ( houi + " " + huryoku ) ;
        }
      }
      