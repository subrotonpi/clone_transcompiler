static final void setIn ( ) {
  System . setProperty ( "java.util.logging.config.logging" , "true" ) ;
  System . setProperty ( "java.util.logging.config.logging" , "true" ) ;
  class TrieNode {
    private final Map < Character , TrieNode > nextNode = Maps . newHashMap ( ) ;
    private boolean isInDict = false ;
  }
  class Trie {
    public Trie ( String charset ) {
      this . charset = charset ;
      this . root = new TrieNode ( "" ) ;
    }
    @ Override public void add ( String aStr ) {
      TrieNode node = this . root ;
      for ( int i = 0 ;
      i < aStr . length ( ) ;
      i ++ ) {
        char c = aStr . charAt ( i ) ;
        if ( ! node . nextNode . containsKey ( c ) ) {
          node . nextNode . put ( c , new TrieNode ( c ) ) ;
        }
        node = node . nextNode . get ( c ) ;
        if ( i == aStr . length ( ) - 1 ) {
          node . isInDict = true ;
        }
      }
    }
    private int dfs ( TrieNode node , int dep ) {
      int ret = 0 , cnt = 0 ;
      if ( node . isInDict ) return 0 ;
      for ( String s : "01" . split ( " " ) ) {
        if ( ! node . nextNode . containsKey ( s ) ) cnt ++ ;
        else ret ^= dfs ( node . nextNode . get ( s ) , dep + 1 ) ;
      }
      int height = L - dep ;
      if ( cnt % 2 != 0 ) {
        int power2 = 0 ;
        while ( height > 0 && height % 2 == 0 ) {
          power2 ++ ;
          height /= 2 ;
        }
        ret ^= 2 * power2 ;
      }
      return ret ;
    }
    private void debug_output ( TrieNode node , int now ) {
      System . out . println ( node . getChar ( ) + " " + Lists . newArrayList ( node . nextNode . entrySet ( ) ) + " " + node . isInDict ( ) + " " + now ) ;
      if ( node . isInDict ( ) ) System . out . println ( now ) ;
      for ( TrieNode n : node . nextNode . values ( ) ) debugoutput ( n , now + n . getChar ( ) ) ;
    }
  }
  int N = Integer . parseInt ( input ( ) ) ;
  int L = Integer . parseInt ( input ( ) ) ;
  Trie T = new Trie ( "01" )