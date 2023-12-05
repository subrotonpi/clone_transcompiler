public static void inputFile ( File inputFile ) throws IOException {
  BufferedReader reader = new BufferedReader ( new FileReader ( inputFile ) ) ;
  String line = reader . readLine ( ) ;
  reader . close ( ) ;
  PrintWriter outputFile = new PrintWriter ( new BufferedWriter ( new FileWriter ( "D-large.out" ) ) ) ;
  int numTests = Integer . parseInt ( line ) ;
  /* Score the average of the naomiNums */
  int naomiInd = 0 ;
  int kenInd = 0 ;
  while ( naomiInd < naomiNums . length ) {
    double naomiPlay = naomiNums [ naomiInd ] ;
    while ( kenInd < kenNums . length && kenNums [ kenInd ] < naomiPlay ) {
      kenInd ++ ;
    }
    if ( kenInd == kenNums . length ) {
      break ;
    }
    naomiInd ++ ;
    kenInd ++ ;
  }
  /* Score the average of the naomiNums */
  int naomiInd = 0 ;
  int kenInd = 0 ;
  while ( kenInd < kenNums . length ) {
    double kenPlay = kenNums [ kenInd ] ;
    while ( naomiInd < naomiNums . length && naomiNums [ naomiInd ] < kenPlay ) {
      naomiInd ++ ;
    }
    if ( naomiInd == naomiNums . length ) {
      break ;
    }
    naomiInd ++ ;
    kenInd ++ ;
  }
  /* Score the average of the kenNums */
  double deceitScore = scoreDeceit ( naomiInd , kenInd ) ;
  double warScore = scoreWar ( naomiInd , kenInd ) ;
  outputFile . println ( "Case #" + i + ": " + deceitScore + " " + warScore ) ;
}
