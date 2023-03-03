public static void input ( ) {
  String [ ] mojiretsu = {
    "A" , "C" , "G" , "T" }
    ;
    int [ ] sBin = new int [ S . length ] ;
    for ( int i = 0 ;
    i < S . length ;
    i ++ ) {
      sBin [ i ] = Integer . parseInt ( mojiretsu [ i ] ) ;
    }
    int cnt = 0 ;
    int cnMax = 0 ;
    for ( int s : sBin ) {
      if ( s == 0 ) {
        cnt = 0 ;
      }
      if ( s == 1 ) {
        cnt ++ ;
        cnMax = Math . max ( cnMax , cnt ) ;
      }
    }
    System . out . println ( cnMax ) ;
  }
  