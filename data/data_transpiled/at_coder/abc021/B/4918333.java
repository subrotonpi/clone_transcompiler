public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  int k = Integer . parseInt ( input ) ;
  List < Integer > p = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    p . add ( Integer . parseInt ( input ) ) ;
  }
  List < Integer > p1 = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    p1 . add ( Integer . parseInt ( input ) ) ;
  }
  if ( p . size ( ) == p1 . size ( ) && p . indexOf ( a ) == 0 && p . indexOf ( b ) == 0 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
