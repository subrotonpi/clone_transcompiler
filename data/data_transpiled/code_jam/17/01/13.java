static final String solve ( ) throws IOException {
  String infile = "A-large.in" ;
  String outfile = "A-large.out" ;
  System . setIn ( new FileInputStream ( infile ) ) ;
  PrintWriter output = new PrintWriter ( new FileOutputStream ( outfile ) ) ;
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    String S = input . nextLine ( ) ;
    String K = input . nextLine ( ) ;
    System . out . println ( "S = " + S ) ;
    System . out . println ( "K = " + K ) ;
    int len = Integer . parseInt ( K ) ;
    int answer = 0 ;
    for ( int i = 0 ;
    i < len - K + 1 ;
    i ++ ) {
      if ( S . charAt ( i ) == '-' ) {
        answer ++ ;
        String mid = "" ;
        for ( int j = 0 ;
        j < K ;
        j ++ ) {
          if ( S . charAt ( i + j ) == '-' ) mid += "+" ;
          else mid += "-" ;
        }
        S = S . substring ( 0 , i ) + mid + S . substring ( i + K ) ;
        System . out . println ( "Case #" + testCase + ":" + answer + S ) ;
      }
    }
    if ( S . length ( ) != len ) answer = "IMPOSSIBLE" ;
    else answer = Integer . toString ( answer ) ;
    System . out . println ( "Case #" + testCase + ":" + answer ) ;
    output . println ( "Case #" + testCase + ":" + answer ) ;
  }
  return outfile ;
}
