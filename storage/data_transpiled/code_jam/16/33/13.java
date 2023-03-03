public static int T = Integer . parseInt ( scanner . nextLine ( ) ) {
  for ( int test_case = 0 ;
  test_case < T ;
  test_case ++ ) {
    Arrays . fill ( J , Integer . MAX_VALUE ) ;
    Arrays . fill ( P , Integer . MAX_VALUE ) ;
    Arrays . fill ( S , Integer . MIN_VALUE ) ;
    Arrays . fill ( K , Integer . MAX_VALUE ) ;
    int answer = J * P * Math . min ( S , K ) ;
    System . out . println ( "Case #" + ( test_case + 1 ) + ": " + answer ) ;
    for ( int j = 0 ;
    j < J ;
    j ++ ) {
      for ( int p = 0 ;
      p < P ;
      p ++ ) {
        for ( int s = 0 ;
        s < Math . min ( S , K ) ;
        s ++ ) {
          System . out . print ( j + 1 + " " + p + 1 + " " + ( s + j + p ) % S + 1 ) ;
        }
      }
    }
  }
  return answer ;
}
