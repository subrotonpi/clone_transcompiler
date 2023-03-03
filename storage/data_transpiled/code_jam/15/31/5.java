static final String getProblemId ( ) throws IOException {
  final String problemId = "A" ;
  System . setProperty ( "problemId" , problemId ) ;
  final String inputPath = problemId + ".in" ;
  final String outputPath = problemId + ".out" ;
  return new String ( ) {
    private String readLine ( ) {
      String line = "" ;
      while ( line . length ( ) == 0 ) {
        line = bufferedReader . readLine ( ) . trim ( ) ;
      }
      return line ;
    }
    private String readLine ( ) {
      System . out . println ( line ) ;
      return outputPath ;
    }
  }
  ;
}
