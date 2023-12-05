static final String getProblemId ( ) throws IOException {
  final String problemId = "C" ;
  System . setProperty ( "problemId" , problemId ) ;
  final String inputPath = problemId + ".in" ;
  final String outputPath = problemId + ".out" ;
  {
    String line = "" ;
    while ( line . length ( ) == 0 ) {
      line = inputFile . readLine ( ) . trim ( ) ;
    }
    return line ;
  }
  private PrintWriter outputFile = new PrintWriter ( new BufferedWriter ( new FileWriter ( outputPath ) ) ) {
    System . out . println ( line ) ;
    return outputFile ;
  }
  private int solve ( ) {
    int c = Integer . parseInt ( inputFile . readLine ( ) ) ;
    int d = Integer . parseInt ( inputFile . readLine ( ) ) ;
    int v = Integer . parseInt ( inputFile . readLine ( ) ) ;
    int [ ] ds = new int [ 200 ] ;
    int i = 0 ;
    for ( int num : Integer . parseInt ( inputFile . readLine ( ) ) ) {
      ds [ i ] = num ;
    }
    return i ;
  }
}
