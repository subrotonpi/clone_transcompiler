static public void main ( String infilename , Class < ? extends Problem > problemclasstype , String outfilename ) {
  System . out . println ( "Parsing " + infilename + " to " + outfilename ) ;
  BufferedReader infileReader = new BufferedReader ( new FileReader ( infilename ) ) ;
  PrintWriter outfileWriter = new PrintWriter ( new FileWriter ( outfilename ) ) ;
  int N = Integer . parseInt ( infileReader . readLine ( ) ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    System . out . println ( "Case #" + ( i + 1 ) ) ;
    Problem problem = problemclasstype . newInstance ( infileReader ) ;
    String solution = problem . solution ( ) ;
    System . out . println ( solution ) ;
    outfileWriter . println ( "Case #" + ( i + 1 ) + ": " + solution ) ;
  }
  infileReader . close ( ) ;
  outfileWriter . close ( ) ;
}
