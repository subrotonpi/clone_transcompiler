public static int T = Integer . parseInt ( input ) {
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    int N = ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    int L = ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    Set < Integer > a = new TreeSet < > ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      a . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    }
    Set < Integer > b = new TreeSet < > ( ) ;
    for ( int i = 0 ;
    i < L ;
    i ++ ) {
      b . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    }
    int ans = L + 1 ;
    for ( int i = 0 ;
    i < b . size ( ) ;
    i ++ ) {
      if ( new TreeSet < > ( a . get ( 0 ) ^ b . get ( i ) ) . equals ( b ) ) {
        ans = Math . min ( ans , Integer . valueOf ( a . get ( 0 ) ^ b . get ( i ) ) . intValue ( ) ) ;
      }
    }
    if ( ans == L + 1 ) {
      ans = "NOT POSSIBLE" ;
    }
    System . out . println ( "Case #" + testCase + ": " + ans ) ;
  }
  return T ;
}
