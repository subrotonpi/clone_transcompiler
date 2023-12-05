public static void print ( String s ) {
  String t = new String ( input . nextLine ( ) ) ;
  s . replaceAll ( "" , "" ) ;
  t . replaceAll ( "" , "" ) ;
  if ( ( new String ( s ) ) . compareTo ( new String ( t ) ) < 0 ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
