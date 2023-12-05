static final String getLargeSolution ( ) throws IOException {
  String filename = "B" ;
  String inputFilename = filename + "-large.in" ;
  String outputFilename = filename + ".txt" ;
  BufferedReader inputFile = new BufferedReader ( new FileReader ( inputFilename ) ) ;
  PrintWriter outputFile = new PrintWriter ( outputFilename ) ;
  long startTime = System . currentTimeMillis ( ) ;
  int testcases = Integer . parseInt ( inputFile . readLine ( ) ) ;
  for ( int testcase = 0 ;
  testcase < testcases ;
  testcase ++ ) {
    String outputStringHeader = "Case #" + ( testcase + 1 ) + ": " ;
    outputFile . println ( outputStringHeader ) ;
    System . out . println ( "Case #" + ( testcase + 1 ) + ": " ) ;
    List < Integer > inputInts = CollectionUtils . toList ( inputFile . readLine ( ) . split ( " " ) ) ;
    int N = inputInts . get ( 0 ) ;
    int [ ] scores = inputInts . subList ( 1 , inputInts . size ( ) ) ;
    Integer [ ] solutions = new Integer [ scores . length ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      solutions [ i ] = null ;
    }
    int X = Integer . parseInt ( scores [ 0 ] ) ;
    double avgP = 1.0 / ( double ) scores . length ;
    double avgS = ( double ) X / ( double ) scores . length ;
    int [ ] prunedScores = new int [ N ] ;
    int prunedCount = 0 ;
    for ( int i = 0 ;
    i < scores . length ;
    i ++ ) {
      if ( ( avgP + ( avgS - scores [ i ] ) * ( 1.0 / ( double ) X ) ) >= 0 ) {
        prunedScores [ i ] = scores [ i ] ;
        solutions [ i ] = 0 ;
      }
      else {
        prunedScores [ i ] = - 1 ;
        prunedCount ++ ;
      }
    }
    avgP = 1.0 / ( double ) ( prunedScores . length - prunedCount ) ;
    avgS = ( double ) ( Math . pow ( prunedScores [ 0 ] + prunedCount , 1.0 / ( double ) X ) ) / ( double ) prunedScores . length - prunedCount ;
    for ( int i = 0 ;
    i < prunedScores . length ;
    i ++ ) {
      if ( prunedScores [ i ] != - 1 ) {
        solutions [ i ] = ( 100 * ( avgP + ( avg @ @