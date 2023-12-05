public static void print ( String s ) {
  List < Integer > t = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    t . add ( i ) ;
  }
  s = new ArrayList < Integer > ( s ) ;
  t = new ArrayList < Integer > ( t ) ;
  if ( s . compareTo ( t ) < 0 ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
