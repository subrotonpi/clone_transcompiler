public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  LinkedList < Integer > q = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) q . add ( Integer . parseInt ( input ) ) ;
  int m = Integer . parseInt ( input ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    LinkedList < Integer > clist = q ;
    int num = Integer . parseInt ( input ) ;
    int t = Integer . parseInt ( input ) ;
    System . out . println ( Integer . toString ( clist . size ( ) - clist . get ( num - 1 ) + t ) ) ;
  }
}
