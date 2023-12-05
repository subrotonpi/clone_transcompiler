public static final String getWordString ( ) throws IOException {
  BufferedReader iReader = new BufferedReader ( new FileReader ( args [ 0 ] ) ) ;
  int T = Integer . parseInt ( iReader . readLine ( ) . trim ( ) ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    String [ ] line = iReader . readLine ( ) . split ( " " ) ;
    K = Integer . parseInt ( line [ 0 ] ) ;
    L = Integer . parseInt ( line [ 1 ] ) ;
    S = Integer . parseInt ( line [ 2 ] ) ;
    String keyboard = iReader . readLine ( ) . trim ( ) ;
    String target = iReader . readLine ( ) . trim ( ) ;
    int effectiveLength = target . length ( ) ;
    for ( int strPos = 1 ;
    strPos < target . length ( ) ;
    strPos ++ ) {
      if ( target . regionMatches ( true , 0 , target , 0 , target . length ( ) - strPos ) ) {
        effectiveLength = strPos ;
        break ;
      }
    }
    int maxBananas = 1 + ( int ) ( ( S - target . length ( ) ) / effectiveLength ) ;
    double singleProb = 1.0 ;
    for ( int strPos = 0 ;
    strPos < target . length ( ) ;
    strPos ++ ) {
      if ( keyboard . contains ( target . charAt ( strPos ) ) ) {
        singleProb *= keyboard . indexOf ( target . charAt ( strPos ) ) / keyboard . length ( ) ;
      }
      else {
        singleProb = 0.0 ;
        maxBananas = 0 ;
        break ;
      }
    }
    double totalProb = singleProb * ( S - target . length ( ) + 1 ) ;
    int answer = maxBananas - totalProb ;
    String output = Integer . toString ( answer ) ;
    System . out . println ( "Case #" + ( t + 1 ) + ": " + output ) ;
  }
  return null ;
}
