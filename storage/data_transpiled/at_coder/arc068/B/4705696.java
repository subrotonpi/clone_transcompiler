public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  HashSet < String > a = new HashSet < String > ( ) ;
  for ( String s : input . split ( " " ) ) {
    a . add ( s ) ;
  }
  if ( a . size ( ) % 2 != 0 ) {
    System . out . println ( a . size ( ) ) ;
  }
  else {
    System . out . println ( a . size ( ) - 1 ) ;
  }
}
