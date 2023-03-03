public static int T = Integer . parseInt ( input ) {
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    input . nextLine ( ) ;
    int [ ] p = new int [ input . nextInt ( ) ] ;
    for ( int i = 0 ;
    i < p . length ;
    i ++ ) p [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    int ans = Math . min ( e + Integer . numberOfLeadingZeros ( - ( - i / e ) - 1 ) , Math . max ( e , p [ i ] ) ) ;
    System . out . println ( "Case #" + testCase + ": " + ans ) ;
  }
  return T ;
}
