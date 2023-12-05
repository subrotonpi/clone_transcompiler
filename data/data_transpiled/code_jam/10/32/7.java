static PrintWriter of ( InputStream in ) throws IOException {
  BufferedReader br = new BufferedReader ( new InputStreamReader ( in ) ) ;
  PrintWriter of = new PrintWriter ( of ) ;
  String line = "" ;
  int cases = Integer . parseInt ( br . readLine ( ) ) ;
  line = 1 ;
  for ( int testCase = 0 ;
  testCase < cases ;
  testCase ++ ) {
    String [ ] input = br . readLine ( ) . split ( "\\s+" ) ;
    int l = Integer . parseInt ( input [ 0 ] ) ;
    int p = Integer . parseInt ( input [ 1 ] ) ;
    int c = Integer . parseInt ( input [ 2 ] ) ;
    line ++ ;
    int test = l ;
    int steps = 0 ;
    while ( test < p ) {
      test *= c ;
      steps ++ ;
    }
    int loads = 0 ;
    int totest = steps - 1 ;
    System . out . println ( "totest" + totest ) ;
    while ( totest > 0 ) {
      totest /= 2 ;
      loads ++ ;
    }
    System . out . println ( "loads" + loads ) ;
    of . println ( "Case #" + ( testCase + 1 ) + ": " + loads ) ;
  }
  return of ;
}
