static final String getLargeOutput ( ) throws IOException {
  final int LINES_PARAM = 2 ;
  final String INPUT_FILE_NAME = "B-large.in" ;
  final String OUTPUT_FILE_NAME = "B-large.out" ;
  {
    final int n = parsed [ 0 ] . length ;
    final int c = parsed [ 0 ] . length ;
    final int [ ] seat = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) seat [ i ] = 0 ;
    final int [ ] rider = new int [ c ] ;
    for ( int i = 0 ;
    i < c ;
    i ++ ) seat [ i ] = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) rider [ i ] = 0 ;
    for ( int i = 0 ;
    i < c ;
    i ++ ) seat [ i ] = 0 ;
    final int [ ] s = Arrays . copyOf ( seat , n ) ;
    int m = Math . max ( rider , n ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) m = Math . max ( m , ( s [ i ] + i ) / ( i + 1 ) ) ;
    final int pr = Arrays . stream ( seat ) . reduce ( Math . max ( 0 , se - m ) , ( se - m ) ) ;
    return Integer . toString ( m ) + " " + Integer . toString ( pr ) ;
  }
  private static String [ ] [ ] doParse ( final String input ) throws IOException {
    final BufferedReader inputReader = new BufferedReader ( new FileReader ( INPUT_FILE_NAME ) ) ;
    final List < String [ ] > output = new ArrayList < String [ ] > ( ) ;
    final int num_of_test_cases = Integer . parseInt ( inputReader . readLine ( ) , 10 ) ;
    final String [ ] temp = inputReader . readLine ( ) . split ( "\\s+" ) ;
    int index = 0 ;
    for ( int test_case = 0 ;
    test_case < num_of_test_cases ;
    test_case ++ ) {
      final int lines = Integer . parseInt ( temp [ index ] . replaceAll ( "\\s+" , " " ) . substring ( LINES_PARAM ) ) ;
      final String [ ] parsed_input = doParse ( temp , index , lines + 1 ) ;
      index = index + 1 + lines ;
      output . add ( "Case #" + ( test_case + 1 ) + ": " + doCase ( parsed_input ) ) ;
    }
    final BufferedWriter outputWriter = new BufferedWriter (