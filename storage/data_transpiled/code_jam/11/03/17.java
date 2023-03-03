public static int T = Integer . parseInt ( Scanner in ) {
  for ( int repeat = 0 ;
  repeat < T ;
  repeat ++ ) {
    in . nextLine ( ) ;
    String [ ] dataStr = in . nextLine ( ) . split ( " " ) ;
    int [ ] dataInt = new int [ dataStr . length ] ;
    for ( int i = 0 ;
    i < dataStr . length ;
    i ++ ) dataInt [ i ] = Integer . parseInt ( dataStr [ i ] ) ;
    int pSum = 0 ;
    for ( int i = 0 ;
    i < dataInt . length ;
    i ++ ) pSum ^= dataInt [ i ] ;
    if ( pSum != 0 ) System . out . println ( "Case #" + ( repeat + 1 ) + ": NO" ) ;
    else {
      int min = 0 ;
      int actSum = 0 ;
      for ( int i = 0 ;
      i < dataInt . length ;
      i ++ ) {
        actSum += dataInt [ i ] ;
        if ( dataInt [ i ] < dataInt [ min ] ) min = i ;
      }
      actSum -= dataInt [ min ] ;
      System . out . println ( "Case #" + ( repeat + 1 ) + ": " + actSum ) ;
    }
  }
  return T ;
}
