public static String [ ] w ( ) {
  StringBuilder w = new StringBuilder ( ) ;
  for ( String s : input ) {
    w . append ( s ) ;
  }
  while ( w . contains ( "a" ) ) {
    w . remove ( "a" ) ;
  }
  return w . toString ( ) . toCharArray ( ) ;
}
