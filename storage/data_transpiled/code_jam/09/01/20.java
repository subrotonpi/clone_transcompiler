static final private void main ( String [ ] args ) throws IOException {
  final Scanner in ;
  final int wordLength , numWords , numCases ;
  final String pattern ;
  final int numCases = 1 ;
  final char [ ] chars = new char [ wordLength ] ;
  Arrays . fill ( chars , ',' ) ;
  final int [ ] passes = new char [ wordLength ] ;
  Arrays . fill ( chars , ',' ) ;
  final boolean canPass = false ;
  for ( int i = 0 ;
  i < numCases ;
  i ++ ) {
    if ( passes [ i ] == ',' ) {
      passes [ i ] = true ;
    }
    else {
      return false ;
    }
  }
  class Matcher {
    Node [ ] nodes = new Node [ wordLength ] ;
    int index = 0 ;
    while ( index < pattern . length ( ) ) {
      if ( pattern . charAt ( index ) == '(' ) {
        index ++ ;
        final char [ ] bits = new char [ wordLength ] ;
        while ( pattern . charAt ( index ) != ')' ) {
          bits [ index ] = pattern . charAt ( index ) ;
          index ++ ;
        }
        nodes [ i ] = new Node ( bits ) ;
      }
      else {
        nodes [ i ] = new Node ( Arrays . copyOf ( pattern , index ) ) ;
      }
      index ++ ;
    }
  }
  public boolean isMatch ( String word ) {
    for ( int i = 0 ;
    i < word . length ( ) ;
    i ++ ) {
      if ( ! nodes [ i ] . canPass ( word . charAt ( i ) ) ) {
        return false ;
      }
    }
    return true ;
  }
  private int matchPattern ( String pattern , String [ ] words ) {
    final Matcher matcher = new Matcher ( pattern ) ;
    int matches = 0 ;
    for ( int i = 0 ;
    i < words . length ;
    i ++ ) {
      if ( matcher . isMatch ( words [ i ] ) ) {
        matches ++ ;
      }
    }
    return matches ;
  }
  public static void main ( String [ ] args ) {
    if ( args . length < 2 ) {
      in = new Scanner ( System . in ) ;
    }
    else {
      in = new Scanner ( System . in ) ;
    }
    final PrintStream out = System . out ;
    final int wordLength = in . nextInt ( ) ;
    final int numWords = in . nextInt ( ) ;
    final int numCases = in . nextInt ( ) ;
    final String [ ] words = new String [ wordLength ] ;
    for ( int i = 0 ;
    i < words . length ;
    i ++ ) {
      words [