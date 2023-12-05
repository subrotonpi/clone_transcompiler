public static List < Integer > readLineInts ( ) throws IOException {
  return Arrays . stream ( new BufferedReader ( new InputStreamReader ( new FileInputStream ( "A-large" ) ) ) . readLine ( ) . split ( " " ) ) . map ( num -> Integer . parseInt ( num ) ) . collect ( Collectors . toList ( ) ) ;
  @ SuppressWarnings ( "unchecked" ) private int [ ] tideline ( int [ ] scores , int X ) {
    Counter < Integer > cc = new Counter < > ( ) ;
    for ( int score = 0 ;
    score < max ( scores ) + 1 ;
    score ++ ) {
      floating += cc . getCount ( scores [ score ] ) ;
      if ( floating > X ) break ;
      X -= floating ;
    }
    else score ++ ;
    return scores [ score ] + X / floating ;
  }
  private static void findMinVoteProportions ( int [ ] scores ) {
    int X = Arrays . stream ( scores ) . mapToInt ( Integer :: intValue ) . sum ( ) ;
    int pointsLimit = tideline ( scores , X ) ;
    System . out . println ( pointsLimit ) ;
    double [ ] proportionsNeeded = new double [ scores . length ] ;
    for ( int s : scores ) {
      if ( s >= pointsLimit ) {
        proportionsNeeded [ s ] = 0.0 ;
      }
      else {
        int pointsNeeded = pointsLimit - s ;
        proportionsNeeded [ s ] = 100 * pointsNeeded / X ;
      }
    }
  }
}
