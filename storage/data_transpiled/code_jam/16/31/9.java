public static String [ ] getSplits ( String input ) throws IOException {
  BufferedReader br = new BufferedReader ( new FileReader ( input ) ) ;
  int T = Integer . parseInt ( br . readLine ( ) . trim ( ) ) ;
  for ( int k = 0 ;
  k < T ;
  k ++ ) {
    int numParties = Integer . parseInt ( br . readLine ( ) . trim ( ) ) ;
    List < String > evac = new ArrayList < String > ( ) ;
    String [ ] allSen = br . readLine ( ) . split ( " " ) ;
    int alpha = 65 ;
    Map < Character , Integer > oneMap = new HashMap < Character , Integer > ( ) ;
    for ( int i = 0 ;
    i < numParties ;
    i ++ ) {
      oneMap . put ( ( char ) alpha , allSen [ i ] ) ;
      alpha ++ ;
    }
    List < Integer > oneList = new ArrayList < Integer > ( ) ;
    int totalSen = 0 ;
    for ( int i = 0 ;
    i < numParties ;
    i ++ ) {
      oneList . add ( Integer . parseInt ( allSen [ i ] ) ) ;
      totalSen += Integer . parseInt ( allSen [ i ] ) ;
    }
    while ( ( totalSen >= 2 ) && ( oneList . size ( ) > 0 ) ) {
      String newPair = "" ;
      for ( int i = 0 ;
      i < 2 ;
      i ++ ) {
        int maxValue = Collections . max ( oneList ) ;
        int maxIndex = oneList . indexOf ( maxValue ) ;
        oneList . set ( maxIndex , -- maxValue ) ;
        int newAlpha = 65 + maxIndex ;
        newPair += ( char ) newAlpha ;
        totalSen -- ;
        if ( totalSen == 2 ) break ;
      }
      evac . add ( newPair ) ;
    }
    System . out . println ( "Case #" + ( k + 1 ) + ": " + evac . toString ( ) ) ;
  }
  return evac . toArray ( new String [ 0 ] ) ;
}
