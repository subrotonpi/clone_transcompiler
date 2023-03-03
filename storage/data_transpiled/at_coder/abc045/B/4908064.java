{
  S = new HashMap < > ( ) ;
  for ( char c : "abc" ) {
  }
  String s = "a" ;
  while ( S . get ( s ) != null ) {
    s = S . get ( s ) . pop ( 0 ) ;
  }
  System . out . println ( s . toUpperCase ( ) ) ;
}
