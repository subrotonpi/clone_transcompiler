static public String solve ( String infilename , Class < ? extends ProblemD > problemclasstype , String outfilename ) {
  System . out . println ( "Parsing " + infilename + " to " + outfilename ) ;
  BufferedReader infileReader = new BufferedReader ( new FileReader ( infilename ) ) ;
  PrintWriter outfileWriter = new PrintWriter ( outfilename ) ;
  int N = Integer . parseInt ( infileReader . readLine ( ) ) ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    System . out . println ( "Case #" + i + " of " + N ) ;
    ProblemD problem = problemclasstype . newInstance ( infileReader ) ;
    System . out . println ( " read case" ) ;
    String solution = problem . solution ( ) ;
    System . out . println ( " " + solution ) ;
    outfileWriter . println ( "Case #" + i + ": " + solution ) ;
  }
  infileReader . close ( ) ;
  outfileReader . close ( ) ;
}
