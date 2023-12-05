public static void print ( String s ) {
  List < Integer > t = new LinkedList < Integer > ( ) ;
  s . add ( 1 ) ;
  t . add ( 2 ) ;
  t . add ( 3 ) ;
  t . add ( 4 ) ;
  t . add ( 5 ) ;
  if ( s . compareTo ( t ) < 0 ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
