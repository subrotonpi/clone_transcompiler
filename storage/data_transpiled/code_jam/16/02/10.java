static final LinkedHashMap < String , String > DEFAULT_LINES = new LinkedHashMap < String , String > ( ) {
  private static final String INPUT = "tiny" ;
  private static final String INPUT = "B-large.in" ;
  @ Override protected void debug ( String ... args ) {
    return ;
  }
  @ Override protected void doTrial ( String s ) {
    int count = 0 ;
    char last = "+" ;
    for ( char c : new StringBuilder ( s ) . reverse ( ) . toString ( ) . toCharArray ( ) ) {
      if ( c != last ) {
        count ++ ;
      }
      last = c ;
    }
  }
}
