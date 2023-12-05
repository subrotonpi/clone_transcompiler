static int [ ] [ ] main ( String infilename , String problemclasstype , String outfilename ) {
  System . out . println ( "Parsing " + infilename + " to " + outfilename ) ;
  BufferedReader infilereader = new BufferedReader ( new FileReader ( infilename ) ) ;
  PrintWriter outfilewriter = new PrintWriter ( outfilename ) ;
  int N = Integer . parseInt ( infilereader . readLine ( ) ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    System . out . println ( "Case #" + ( i + 1 ) ) ;
    Problem problem = problemclasstype . valueOf ( infilereader . readLine ( ) ) ;
    String solution = problem . solution ( ) ;
    System . out . println ( solution ) ;
    outfilewriter . println ( "Case #" + ( i + 1 ) + ": " + solution ) ;
  }
  infilereader . close ( ) ;
  outfilewriter . close ( ) ;
  int [ ] [ ] x = new int [ N ] [ N ] ;
  int [ ] [ ] d = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    System . out . println ( "   runs on test data" ) ;
    System . out . println ( "    runs on small data" ) ;
    System . out . println ( "    runs on large data" ) ;
    System . out . println ( " ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁ ▁