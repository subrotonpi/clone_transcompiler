public static void fileIn ( Scanner fileIn , PrintWriter fileOut ) throws IOException {
  Scanner fileIn = new Scanner ( fileIn ) ;
  PrintWriter fileOut = new PrintWriter ( fileOut ) ;
  int nCase = Integer . parseInt ( fileIn . nextLine ( ) ) ;
  class Word {
    int i ;
    char c ;
    int [ ] chars ;
    int [ ] counts = new int [ nCase ] ;
    for ( i = 0 ;
    i < s . length ( ) ;
    i ++ ) {
      c = s . charAt ( i ) ;
      if ( c != c ) {
        chars [ i ] = c ;
        counts [ i ] = 1 ;
        c = c ;
      }
      else {
        counts [ i ] ++ ;
      }
    }
  }
  for ( int iCase = 0 ;
  iCase < nCase ;
  iCase ++ ) {
    int N = Integer . parseInt ( fileIn . nextLine ( ) ) ;
    Word [ ] words = new Word [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      words [ i ] = new Word ( fileIn . nextLine ( ) . trim ( ) ) ;
    }
    chars = words [ 0 ] . chars ;
    /* check equal */
    for ( Word word : words ) {
      if ( word . chars != chars ) {
        return ;
      }
    }
    if ( ! checkEqual ( ) ) {
      fileOut . println ( "Case #" + ( iCase + 1 ) + ": " + "Fegla Won" ) ;
      continue ;
    }
  }
}
