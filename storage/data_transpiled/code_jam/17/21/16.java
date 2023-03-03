public static void main ( String [ ] args ) {
  try {
    BufferedReader br = new BufferedReader ( new FileReader ( "A-large.in" ) ) ;
    PrintWriter fout = new PrintWriter ( new BufferedWriter ( new FileWriter ( "out.txt" ) ) ) ;
    int t = Integer . parseInt ( br . readLine ( ) . trim ( ) ) ;
    for ( int testCase = 1 ;
    testCase <= t ;
    testCase ++ ) {
      int d = Integer . parseInt ( br . readLine ( ) . trim ( ) ) ;
      int n = Integer . parseInt ( br . readLine ( ) . trim ( ) ) ;
      int lastArrive = 0 ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        int ki = Integer . parseInt ( br . readLine ( ) . trim ( ) ) ;
        int si = Integer . parseInt ( br . readLine ( ) . trim ( ) ) ;
        lastArrive = Math . max ( lastArrive , ( ( d - ki ) / si ) ) ;
      }
      System . out . println ( "Case #" + testCase + ": " + ( d / lastArrive ) + " " + fout . flush ( ) ) ;
    }
  }
  catch ( Exception e ) {
    e . printStackTrace ( ) ;
  }
}
