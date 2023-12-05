public static Node < String > createNode ( ) {
  Node < String > root ;
  boolean exists = false ;
  Node < String > children = new Node < String > ( ) ;
  Node < String > childNode ;
  Node < String > parent = new Node < String > ( ) ;
  parent . setExists ( false ) ;
  parent . setChildren ( children ) ;
  parent . claim ( subtree , true ) ;
  if ( exist ) {
    exists = true ;
  }
  if ( parent . getChildCount ( ) == 0 ) return null ;
  String head = parent . getChild ( 0 ) ;
  if ( ! children . containsKey ( head ) ) {
    Node < String > newNode = new Node < String > ( ) ;
    children . put ( head , newNode ) ;
  }
  childNode = children . get ( head ) ;
  childNode . claim ( subtree . subList ( 1 , parent . getChildCount ( ) ) , true ) ;
  /* Count */
  int result = 0 ;
  if ( ! exists ) result ++ ;
  for ( String key : children . keySet ( ) ) {
    childNode = children . get ( key ) ;
    result += childNode . count ( ) ;
  }
  return result ;
}
int t = scanner . nextInt ( ) ;
for ( int i = xrange ( 1 , Integer . parseInt ( t ) + 1 ) ;
i ++ ) {
  int n = Integer . parseInt ( scanner . nextLine ( ) . trim ( ) ) ;
  int m = Integer . parseInt ( scanner . nextLine ( ) . trim ( ) ) ;
  root = new Node < String > ( ) ;
  root . setExists ( true ) ;
  for ( int j = xrange ( 0 , n ) ;
  j < m ;
  j ++ ) {
    String [ ] existTree = scanner . nextLine ( ) . trim ( ) . split ( "/" ) ;
    root . claim ( existTree , 1 , true ) ;
  }
  for ( int j = xrange ( 0 , m ) ;
  j < n ;
  j ++ ) {
    String [ ] existTree = scanner . nextLine ( ) . trim ( ) . split ( "/" ) ;
    root . claim ( existTree , 1 , false ) ;
  }
  System . out . println ( "Case #" + i + ": " + root . count ( ) ) ;
}
