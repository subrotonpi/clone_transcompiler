public static int [ ] ints ( ) {
  return ArrayUtil . ints ( new Scanner ( System . in ) . nextLine ( ) ) ;
  int numCases = Ints . checkedCast ( new Integer ( numCases ) ) ;
  for ( int caseNum = xrange ( 1 , numCases + 1 ) ;
  caseNum <= N ;
  caseNum ++ ) {
    int N = Ints . checkedCast ( new Integer ( caseNum ) ) ;
    int [ ] values = Ints . checkedCast ( new Integer ( N ) ) ;
    int total = Stream . of ( values ) . reduce ( 0 , ( a , b ) -> a ^ b ) ;
    String res ;
    if ( total > 0 ) {
      res = "NO" ;
    }
    else {
      res = Ints . checkedCast ( values ) - Math . min ( values , N ) ;
    }
    System . out . println ( "Case #" + caseNum + ": " + res ) ;
  }
  return new int [ ] {
  }
  ;
}
