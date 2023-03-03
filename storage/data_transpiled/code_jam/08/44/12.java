static final void main ( String [ ] args ) throws IOException {
  final String FILE_NAME = "D-small-attempt0" ;
  final String INPUT_FILE = FILE_NAME + ".in" ;
  final String OUTPUT_FILE = FILE_NAME + ".out" ;
  /* rle the input string */
  int ret = 0 ;
  char last = '!' ;
  for ( char c : args ) {
    if ( c != last ) {
      ret ++ ;
      last = c ;
    }
  }
  /* recur the depth */
  if ( depth >= k ) {
    char [ ] newS = new char [ s . length ( ) ] ;
    newS [ s . length ( ) ] = '_' ;
    for ( int i : xrange ( s . length ( ) ) ) {
      newS [ i ] = s . charAt ( i - ( i % k ) + sol . charAt ( i % k ) ) ;
    }
    /* rle the output string */
    if ( ret >= 0 ) {
      /* rle the output string */
      if ( ret >= 0 ) {
        /* rle the output string */
        newS [ ret ] = '_' ;
        for ( int i : xrange ( s . length ( ) ) ) {
          /* rle the output string */
          newS [ i ] = s . charAt ( i - ( i % k ) + sol . charAt ( i % k ) ) ;
        }
        /* rle the output string */
      }
      else {
        /* rle the output string */
        ret = 999999999 ;
        for ( int i : xrange ( k ) ) {
          if ( sol . length > depth ) continue ;
          /* rle the output string */
          sol [ depth ] = i ;
          ret = Math . min ( ret , recur ( depth + 1 , k , sol , s ) ) ;
        }
      }
    }
    /* process the output string */
    System . out . println ( "Case #" + testCase + ": " + recur ( 0 , k , new char [ k ] , s ) ) ;
    /* main */
    final BufferedReader fpIn = new BufferedReader ( new FileReader ( INPUT_FILE ) ) ;
    final PrintWriter fpOut = new PrintWriter ( new BufferedWriter ( new OutputStreamWriter ( new FileOutputStream ( OUTPUT_FILE ) ) ) ) ;
    System . in = fpIn ;
    final int numCases = Integer . parseInt (