public static void print ( String n ) {
  n = list ( input ) ;
  Set < String > a = new HashSet < String > ( n ) ;
  if ( a . size ( ) == 1 ) {
    System . out . println ( "SAME" ) ;
  }
  else {
    System . out . println ( "DIFFERENT" ) ;
  }
}
