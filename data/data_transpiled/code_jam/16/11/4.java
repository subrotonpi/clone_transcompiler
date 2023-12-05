static void print ( ) throws IOException {
  final BufferedReader in = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final int cases = Integer . parseInt ( in . readLine ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= cases ;
  testCase ++ ) {
    String word = in . readLine ( ) . trim ( ) ;
    String result = word . substring ( 0 , 1 ) ;
    word = word . substring ( 1 ) ;
    while ( word . length ( ) > 0 ) {
      final String letter = word . substring ( 0 , 1 ) ;
      word = word . substring ( 1 ) ;
      if ( letter . compareTo ( result . charAt ( 0 ) ) >= 0 ) {
        result = letter + result ;
      }
      else {
        result = result + letter ;
      }
    }
    System . out . println ( "Case #" + testCase + ": " + result ) ;
  }
}
