static final Queue < Integer > solve = new Queue < Integer > ( ) {
  private final double INF = Double . MAX_VALUE ;
  @ Override public void add ( int N , @ Nonnull String a ) {
    System . out . println ( Arrays . toString ( a . split ( " " ) ) ) ;
    return ;
  }
  @ Override public void main ( String [ ] args ) {
    /* Iterate through the input stream */
    BufferedReader reader = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
    String line ;
    while ( ( line = reader . readLine ( ) ) != null ) {
      for ( String word : line . split ( " " ) ) {
        /* Iterate through the tokens */
        StringTokenizer tokens = new StringTokenizer ( line ) ;
        N = Integer . parseInt ( tokens . nextToken ( ) ) ;
        a = new ArrayList < Integer > ( ) ;
        for ( int i = 0 ;
        i < N ;
        i ++ ) {
          a . add ( Integer . parseInt ( tokens . nextToken ( ) ) ) ;
        }
      }
    }
  }
  ;
  /* Iterate through the input stream */
  reader . close ( ) ;
}
