public static void F ( File F ) throws IOException {
  PrintStream O = new PrintStream ( new FileOutputStream ( "B-large.out" ) ) ;
  int T = Integer . parseInt ( F . readLine ( ) ) ;
  System . out . println ( T ) ;
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    int B = Integer . parseInt ( F . readLine ( ) . toString ( ) ) ;
    int M = Integer . parseInt ( F . readLine ( ) . toString ( ) ) ;
    int temp = M ;
    String [ ] binary = new String [ B ] ;
    while ( M > 0 ) {
      binary [ temp ] = Integer . toString ( M % 2 ) ;
      M /= 2 ;
    }
    if ( temp > 2 * ( B - 2 ) ) {
      O . println ( "Case #" + testCase + ": " + "IMPOSSIBLE" ) ;
    }
    else if ( temp < 2 * ( B - 2 ) ) {
      O . println ( "Case #" + testCase + ": " + "POSSIBLE" ) ;
      if ( B > 2 ) {
        String ans = "0" + "1" * ( B - 2 ) + "0" ;
        O . println ( ans ) ;
        for ( int i = 1 ;
        i < B ;
        i ++ ) {
          String ans = "" ;
          for ( int j = 0 ;
          j < B ;
          j ++ ) {
            if ( j <= i ) ans += "0" ;
            else ans += "1" ;
          }
          O . println ( ans ) ;
        }
      }
      else {
        O . println ( "Case #" + testCase + ": " + "POSSIBLE" ) ;
      }
    }
  }
  F . close ( ) ;
  O . close ( ) ;
}
