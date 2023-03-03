static final String getSumOfSets ( ) throws IOException {
  String filename = "C" ;
  String inputFilename = filename + "-large.in" ;
  String outputFilename = filename + ".txt" ;
  BufferedReader inputFile = new BufferedReader ( new FileReader ( inputFilename ) ) ;
  PrintWriter outputFile = new PrintWriter ( outputFilename ) ;
  long startTime = System . currentTimeMillis ( ) ;
  int testcases = Integer . parseInt ( inputFile . readLine ( ) ) ;
  for ( int testcase = 0 ;
  testcase < testcases ;
  testcase ++ ) {
    String outputStringHeader = "Case #" + ( testcase + 1 ) + ":" ;
    outputFile . println ( outputStringHeader ) ;
    System . out . println ( "Case #" + ( testcase + 1 ) + ": " ) ;
    List < Integer > inputList = CollectionUtils . newArrayList ( ) ;
    for ( int i = 1 ;
    i <= 151 ;
    i ++ ) {
      List < Integer > subsets = Lists . newArrayList ( ) ;
      subsets . add ( i ) ;
      for ( Integer subset : subsets ) {
        int sumOfSet = Integer . parseInt ( subset ) ;
        if ( sums . containsKey ( sumOfSet ) ) {
          sums . get ( sumOfSet ) . add ( subset ) ;
          solutionKey = sumOfSet ;
          break ;
        }
        else {
          sums . put ( sumOfSet , new ArrayList < Integer > ( subset ) ) ;
        }
      }
    }
  }
  if ( solutionKey != null ) {
    for ( List < Integer > subset : sums . get ( solutionKey ) ) {
      for ( Integer value : subset ) {
        outputFile . print ( value + " " ) ;
      }
      outputFile . println ( ) ;
    }
  }
  else {
    outputFile . println ( "Impossible" ) ;
  }
  return outputFilename ;
}
