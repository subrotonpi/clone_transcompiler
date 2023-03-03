public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  List < Integer > A = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    A . add ( Integer . parseInt ( input ) ) ;
  }
  List < Integer > B = new ArrayList < Integer > ( ) ;
  Collections . sort ( B ) ;
  Map < Integer , Integer > C = new HashMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i < B . size ( ) ;
  i ++ ) {
    C . put ( B . get ( i ) , i ) ;
  }
  for ( int i = 0 ;
  i < A . size ( ) ;
  i ++ ) {
    System . out . println ( C . get ( A . get ( i ) ) ) ;
  }
}
