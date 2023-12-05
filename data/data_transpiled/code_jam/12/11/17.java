public static int [ ] ints ( ) {
  return ArrayUtil . ints ( new Scanner ( System . in ) . nextLine ( ) ) ;
  int numCases = ints ( ) , B ;
  for ( int caseNum = xrange ( 1 , numCases + 1 ) ;
  caseNum <= numCases ;
  caseNum ++ ) {
    int A = ints ( ) ;
    int B = ints ( ) ;
    double [ ] p = ArrayUtil . doubles ( new Scanner ( System . in ) . nextLine ( ) ) ;
    int best = 1 + B ;
    double q = 1.0 ;
    for ( int a = xrange ( 1 , A + 1 ) ;
    a <= B ;
    a ++ ) {
      q *= p [ a - 1 ] ;
      double option = A + B - 2 * a + ( 1 - q ) * ( B + 1 ) ;
      best = Math . min ( best , option ) ;
    }
    System . out . println ( "Case #" + caseNum + ": " + ( 1 + best ) ) ;
  }
  return new int [ numCases ] ;
}
