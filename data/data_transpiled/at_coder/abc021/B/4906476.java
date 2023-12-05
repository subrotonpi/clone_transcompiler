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
  Set < Integer > s = new HashSet < Integer > ( p ) ;
  if ( s . size ( ) != p . size ( ) || p . contains ( a ) || p . contains ( b ) ) {
    System . out . println ( "NO" ) ;
  }
  else {
    System . out . println ( "YES" ) ;
  }
}
