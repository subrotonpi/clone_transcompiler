public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  Set < Integer > s = new HashSet < Integer > ( ) ;
  s . add ( 7 ) ;
  s . add ( 5 ) ;
  s . add ( 3 ) ;
  if ( new Integer ( n ) <= s . size ( ) ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
