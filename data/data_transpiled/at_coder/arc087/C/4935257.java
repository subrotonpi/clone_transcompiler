static final String getInput ( ) {
  final String input = System . getProperty ( "input" ) ;
  System . setIn ( input ) ;
  @ SuppressWarnings ( "resource" ) final int depth = 10 * 9 ;
  Node n = null ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    char t = s . charAt ( i ) ;
    if ( t == '0' ) {
      if ( n . left == null ) {
        n . left = new Node ( i + 1 ) ;
      }
      n = n . left ;
    }
    else {
      if ( n . right == null ) {
        n . right = new Node ( i + 1 ) ;
      }
      n = n . right ;
    }
  }
  class Trie {
    Node root ;
    public Trie ( ) {
      root = new Node ( 0 ) ;
    }
    public void insert ( Node root , String s ) {
      insert ( root , s ) ;
    }
  }
  int n , l = Integer . parseInt ( input ) ;
  List < String > S = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) S . add ( input . trim ( ) ) ;
  Trie trie = new Trie ( ) ;
  for ( String s : S ) trie . insert ( s ) ;
  List < Integer > Data = new ArrayList < > ( ) ;
  Queue < Node > q = new LinkedList < > ( ) ;
  q . add ( trie . root ) ;
  {
    dfs ( node ) ;
  }
  private void dfs ( Node node ) {
    if ( node . right == null && node . left == null ) return ;
    if ( node . right == null || node . left == null ) Data . add ( l - node . depth ) ;
    if ( node . right != null ) q . add ( node . right ) ;
    if ( node . left != null ) q . add ( node . left ) ;
  }
  while ( q . size ( ) > 0 ) dfs ( q . poll ( ) ) ;
  int xor = 0 ;
  /* Grundy */
  int ret = 1 ;
  while ( n % 2 == 0 ) {
    n /= 2 ;
    ret *= 2 ;
  }
  for ( int i : Data ) {
    xor ^= Grundy ( i ) ;
  }
  System . out . println ( xor > 0 ? "Alice" : "Bob" ) ;
  return "" ;
}
