static void main ( String [ ] args ) throws IOException {
  final String INPUT_FILE_NAME = "A-large.in" ;
  final String OUTPUT_FILE_NAME = "A-large.out" ;
  {
    int rem2 = args [ 0 ] + ( args [ 1 ] + 1 ) / 2 ;
    int rem3 = args [ 0 ] + Math . min ( args [ 1 ] , args [ 2 ] ) + ( Math . max ( args [ 1 ] , args [ 2 ] ) - Math . min ( args [ 1 ] , args [ 2 ] ) + 2 ) / 3 ;
    int rem4 = args [ 0 ] + ( args [ 1 ] + 2 ) / 4 ;
    int s = args [ 0 ] ;
    s += args [ 2 ] / 2 ;
    args [ 2 ] %= 2 ;
    int a = Math . min ( args [ 1 ] , args [ 3 ] ) ;
    s += a ;
    int b = Math . max ( args [ 1 ] , args [ 3 ] ) - a ;
    if ( args [ 2 ] > 0 ) {
      if ( b <= 2 ) {
        return s + 1 ;
      }
      else {
        s ++ ;
        b -= 2 ;
      }
    }
    return s + ( b + 3 ) / 4 ;
  }
  {
    int p = args [ 0 ] . charAt ( 1 ) ;
    int [ ] rems = new int [ p ] ;
    for ( int i = 0 ;
    i < p ;
    i ++ ) {
      rems [ i ] = 0 ;
      for ( int g = 0 ;
      g < args [ 1 ] . length ;
      g ++ ) {
        rems [ g % p ] += 1 ;
      }
    }
    HashMap < Integer , Integer > fresh = new HashMap < Integer , Integer > ( ) ;
    fresh . put ( 2 , rem2 ) ;
    fresh . put ( 3 , rem3 ) ;
    fresh . put ( 4 , rem4 ) ;
    return String . valueOf ( fresh . get ( p ) . apply ( rems ) ) ;
  }
  {
    BufferedReader inputReader = new BufferedReader ( new FileReader ( INPUT_FILE_NAME ) ) ;
    StringBuilder output = new StringBuilder ( ) ;
    int numOfTestCases = Integer . parseInt ( inputReader . readLine ( ) , 10 ) ;
    String [ ] inputLines = inputReader . readLine ( ) . split ( "\\s+" ) ;
    for ( int test_case = 0 ;
    test_case < numOfTestCases ;
    test_case ++ ) {
      String [ ] parsedInput = doParse ( inputLines , testCase * LINES_FOR_EACH_INPUT , ( test_case + 1 )