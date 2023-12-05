public static void main ( String className ) throws Exception {
  if ( className . equals ( "org.apache.commons.logging.simplelog.Log4jTest" ) ) {
    BufferedReader inFile = new BufferedReader ( new FileReader ( "A-large.in" ) ) ;
    PrintWriter outFile = new PrintWriter ( "realtest.out" ) ;
    int caseNum = Integer . parseInt ( inFile . readLine ( ) ) ;
    for ( int i = 1 ;
    i <= caseNum ;
    i ++ ) {
      String [ ] items = inFile . readLine ( ) . replace ( "\n" , "" ) . split ( "\\s+" ) ;
      int N = Integer . parseInt ( items [ 0 ] ) ;
      int K = Integer . parseInt ( items [ 1 ] ) ;
      int lightFlag = 1 ;
      for ( int j = 0 ;
      j < N ;
      j ++ ) {
        if ( K % 2 == 0 ) {
          lightFlag = 0 ;
          break ;
        }
        else {
          K /= 2 ;
        }
      }
      if ( lightFlag == 1 ) {
        outFile . println ( "Case #" + ( i ) + ": ON" ) ;
      }
      else {
        outFile . println ( "Case #" + ( i ) + ": OFF" ) ;
      }
    }
    outFile . close ( ) ;
    inFile . close ( ) ;
  }
}
