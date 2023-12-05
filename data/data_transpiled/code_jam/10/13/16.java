private static String loadInput ( ) {
  Scanner scanner = new Scanner ( System . in ) ;
  String text ;
  try {
    scanner . nextLine ( ) ;
  }
  catch ( NoSuchElementException e ) {
    throw new RuntimeException ( "Could not read input file" ) ;
  }
  catch ( IOException e ) {
    throw new RuntimeException ( "Could not read input file" ) ;
  }
  finally {
    scanner . close ( ) ;
  }
  /* Parse input */
  text = scanner . nextLine ( ) ;
  int caseCount = Integer . parseInt ( text . substring ( 0 , text . indexOf ( "Case" ) ) ) ;
  String [ ] testCases = new String [ caseCount ] ;
  for ( int i = 0 ;
  i < caseCount ;
  i ++ ) {
    testCases [ i ] = map ( Integer . parseInt ( text . substring ( text . indexOf ( "Case" ) ) ) , Integer . parseInt ( text . substring ( text . indexOf ( "Case" ) ) ) ) ;
  }
  /* Do the test cases */
  int a1 = scanner . nextInt ( ) ;
  int a2 = scanner . nextInt ( ) ;
  int b1 = scanner . nextInt ( ) ;
  int b2 = scanner . nextInt ( ) ;
  int result = 0 ;
  for ( int a = xrange ( a1 , a2 + 1 ) ;
  a <= a2 ;
  a ++ ) {
    for ( int b = xrange ( b1 , b2 + 1 ) ;
    b <= b1 ;
    b ++ ) {
      int low = a , high = b ;
      if ( a > b ) low = b ;
      if ( b >= a * 2 ) result ++ ;
      else {
        int turns = 0 ;
        while ( low > 0 ) {
          turns ++ ;
          high = high - low ;
          low = high ;
        }
        if ( turns % 2 == 0 ) result ++ ;
      }
    }
  }
  /* Run the test cases */
  testCases = parseInput ( loadInput ( ) ) ;
  StringBuilder result = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < testCases . length ;
  i ++ ) {
    result . append ( "Case #" ) ;
    result . append ( i + 1 ) ;
    result . append ( ": " ) ;
    result . append ( doTestCase ( testCases [ i ] ) ) ;
  }
  result . deleteCharAt ( result . length ( ) - 1 ) ;
  return result . toString ( ) ;
}
