static final int T = Integer . parseInt ( input ) {
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int testCase = 0 ;
  testCase <= T ;
  testCase ++ ) {
    String [ ] line = input . nextLine ( ) . split ( " " ) ;
    int L = Integer . parseInt ( line [ 0 ] ) ;
    int P = Integer . parseInt ( line [ 1 ] ) ;
    int C = Integer . parseInt ( line [ 2 ] ) ;
    double a = Math . log ( P / L ) ;
    a = Math . ceil ( a ) ;
    double b = Math . ceil ( Math . log ( a ) ) ;
    System . out . println ( "Case #" + ( testCase + 1 ) + ": " + b ) ;
  }
  return T ;
}
