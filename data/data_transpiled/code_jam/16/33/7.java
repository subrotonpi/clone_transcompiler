public static int T = Integer . parseInt ( input ) {
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    String [ ] t = input . split ( " " ) ;
    int J = Integer . parseInt ( t [ 0 ] ) ;
    int P = Integer . parseInt ( t [ 1 ] ) ;
    int S = Integer . parseInt ( t [ 2 ] ) ;
    int K = Integer . parseInt ( t [ 3 ] ) ;
    System . out . println ( "Case #" + testCase + ": " + J * P * Math . min ( S , K ) ) ;
    int offset = 0 ;
    for ( int i = 1 ;
    i <= J ;
    i ++ ) {
      offset ++ ;
      int now = offset ;
      for ( int j = 1 ;
      j <= P ;
      j ++ ) {
        for ( int k = 0 ;
        k < Math . min ( S , K ) ;
        k ++ ) {
          now = now % S + 1 ;
          System . out . println ( StringUtils . toString ( i ) + " " + StringUtils . toString ( j ) + " " + now ) ;
        }
      }
    }
  }
  return T ;
}
