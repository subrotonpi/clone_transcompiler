public static int getInt ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int k = Integer . parseInt ( input ) ;
  LinkedList < Integer > li = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < li . size ( ) ;
  i ++ ) {
    li . add ( Integer . parseInt ( input ) ) ;
  }
  int b = n - k ;
  if ( n == k ) {
    System . out . println ( 1 ) ;
  }
  else if ( b % ( k - 1 ) == 0 ) {
    System . out . println ( 1 + ( b / ( k - 1 ) ) ) ;
  }
  else {
    System . out . println ( 2 + ( b / ( k - 1 ) ) ) ;
  }
  return b ;
}
