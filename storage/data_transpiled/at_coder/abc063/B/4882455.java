public static String S ( ) {
  int length = S . length ( ) ;
  int set_length = new HashSet ( S ) . size ( ) ;
  if ( length == set_length ) {
    System . out . println ( "yes" ) ;
  }
  else {
    System . out . println ( "no" ) ;
  }
  return S ;
}
