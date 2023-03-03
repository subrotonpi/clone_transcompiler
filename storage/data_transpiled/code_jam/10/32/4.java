private static void solveCase ( int caseIndex , BufferedReader br ) throws IOException {
  int L = Integer . parseInt ( br . readLine ( ) ) ;
  int P = Integer . parseInt ( br . readLine ( ) ) ;
  int C = Integer . parseInt ( br . readLine ( ) ) ;
  int count = 0 ;
  int lower = L ;
  while ( lower * C < P ) {
    count ++ ;
    lower = lower * C ;
  }
  int numTests = 0 ;
  while ( count > 0 ) {
    count = Integer . parseInt ( count / 2 ) ;
    numTests ++ ;
  }
  System . out . println ( "Case #" + caseIndex + ": " + numTests ) ;
  /* int numCases = Integer.parseInt(br.readLine());
  for (caseIndex : xrange(1, numCases+1))
  {
  solveCase(caseIndex, br);
  }*/
  if ( className . equals ( "org.apache.commons.math.analysis.LinearMathTest" ) ) {
    solve ( new BufferedReader ( new FileReader ( "B-large.in" ) ) ) ;
  }
}
