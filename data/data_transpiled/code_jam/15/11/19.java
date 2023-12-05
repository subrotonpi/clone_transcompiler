public static int T = Integer . parseInt ( input ) {
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    input . nextLine ( ) ;
    int [ ] m = Arrays . stream ( input . nextLine ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
    int [ ] diff = Arrays . stream ( m ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
    int ans1 = Arrays . stream ( diff ) . filter ( i -> i > 0 ) . mapToInt ( i -> i - j ) . sum ( ) ;
    int rate = Math . max ( diff ) ;
    int ans2 = Math . min ( Math . min ( diff [ i ] , rate ) , m . length ) ;
    System . out . println ( "Case #" + testCase + ": " + ans1 + " " + ans2 ) ;
  }
  return T ;
}
