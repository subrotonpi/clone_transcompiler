@ GwtIncompatible ( "java.util.function.Scanner" ) public static void solve ( int cas ) {
  opers = 0 ;
  class Node {
    private Map < String , Node > children = new HashMap < String , Node > ( ) ;
    private Node root ;
    public void addPath ( String path ) {
      if ( path . length ( ) == 0 ) return ;
      if ( ! path . equals ( "" ) ) {
        opers ++ ;
        children . put ( path . substring ( 0 , 1 ) , new Node ( ) ) ;
      }
      children . get ( path . substring ( 1 ) ) . addPath ( path . substring ( 1 ) ) ;
    }
  }
  public void solveCase ( int cas ) {
    int n , m ;
    int n = scanf ( "%d%d" ) ;
    int m = scanf ( "%d" ) ;
    Node root = new Node ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) root . addPath ( scanf ( "%s" ) . iterator ( ) . next ( ) ) ;
    opers = 0 ;
    for ( int i = 0 ;
    i < m ;
    i ++ ) root . addPath ( scanf ( "%s" ) . iterator ( ) . next ( ) ) ;
    System . out . println ( "Case #" + cas + ": " + opers ) ;
  }
  if ( __name__ . equals ( "java.util.function.Scanner" ) ) {
    int tests = scanf ( "%d" ) ;
    for ( int i = 0 ;
    i < tests ;
    i ++ ) solveCase ( i + 1 ) ;
  }
}
