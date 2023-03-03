@ VisibleForTesting static int print ( ) {
  int T = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    int P = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
    int [ ] constraints = ArrayUtil . fromCharArray ( readLine ( ) . trim ( ) ) ;
    int [ ] prices = ArrayUtil . fromCharArray ( readLine ( ) . trim ( ) ) ;
    for ( int i = 0 ;
    i < P ;
    i ++ ) prices = ArrayUtil . fromCharArray ( readLine ( ) . trim ( ) ) ;
    Set [ ] ticketsBought = new HashSet [ P ] ;
    for ( int p = 0 ;
    p < P ;
    p ++ ) ticketsBought [ p ] = new HashSet < Integer > ( ) ;
    for ( int player : xrange ( 2 * P ) ) for ( int r : xrange ( P , constraints [ player ] , - 1 ) ) ticketsBought [ r - 1 ] . add ( player / ( 2 * r ) ) ;
    int ans = Arrays . stream ( ticketsBought ) . mapToInt ( Integer :: intValue ) . sum ( ) * prices [ 0 ] ;
    System . out . println ( "Case #" + testCase + ": " + ans ) ;
  }
  return T ;
}
