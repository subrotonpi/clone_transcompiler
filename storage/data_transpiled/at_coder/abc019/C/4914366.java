public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  Set < Integer > a = new HashSet < Integer > ( ) ;
  a . add ( n ) ;
  Set < Integer > b = new HashSet < Integer > ( ) ;
  for ( Integer x : a ) {
    while ( x % 2 == 0 ) {
      x /= 2 ;
    }
    b . add ( x ) ;
  }
  System . out . println ( b . size ( ) ) ;
}
