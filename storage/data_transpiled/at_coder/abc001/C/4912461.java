@ VisibleForTesting static String getDigraph ( ) {
  final int Deg = Integer . parseInt ( input . nextLine ( ) ) ;
  final int Dis = Integer . parseInt ( input . nextLine ( ) ) ;
  final float dis = Float . parseFloat ( new DecimalFormat ( String . valueOf ( Dis / 60 ) ) . format ( dis ) ) ;
  final int [ ] DisList = {
    0 , 0.3 , 1.6 , 3.4 , 5.5 , 8 , 10.8 , 13.9 , 17.2 , 20.8 , 24.5 , 28.5 , 32.7 }
    ;
    int i = 0 ;
    while ( i < DisList . length - 1 ) {
      if ( dis >= DisList [ i ] && dis < DisList [ i + 1 ] ) {
        W = i ;
        break ;
      }
      else {
        i ++ ;
      }
    }
    if ( i == DisList . length - 1 ) {
      W = 12 ;
    }
    final String Dir = "N" ;
    return Dir + " " + W ;
  }
  