static final String solve ( String word , String pattern ) throws IOException {
  final String input = "" ;
  final BufferedReader r = new BufferedReader ( new FileReader ( input ) ) ;
  Arrays . fill ( word , ( char ) ' ' ) ;
  final int l = r . nextInt ( ) ;
  final int d = r . nextInt ( ) ;
  final int n = r . nextInt ( ) ;
  final int len = l ;
  final int [ ] word = new int [ len ] ;
  for ( int i = 0 ;
  i <= d ;
  i ++ ) {
    Arrays . fill ( word , ( char ) i ) ;
    word [ i ] = word_i ;
  }
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    Arrays . fill ( pattern , ( char ) i ) ;
    System . out . println ( "Case #" + ( i + 1 ) + ": " + solve ( new String ( word ) , patternString ) ) ;
  }
  return word ;
}
