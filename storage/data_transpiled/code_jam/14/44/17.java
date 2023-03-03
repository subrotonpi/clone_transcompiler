static final private Trie trie = new Trie ( ) {
  private Map < Character , Map < Character , Integer >> X = new HashMap < > ( ) ;
  private int n = 1 ;
  for ( String s : S ) {
    Map < Character , Map < Character , Integer >> p = X ;
    for ( char c : s . toCharArray ( ) ) {
      if ( ! p . containsKey ( c ) ) {
        p . put ( c , new HashMap < > ( ) ) ;
        n ++ ;
      }
      p = p . get ( c ) ;
    }
  }
  @ Override public int test ( ) {
    return n ;
  }
}
