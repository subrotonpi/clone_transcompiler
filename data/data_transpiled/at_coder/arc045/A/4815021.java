public static String [ ] S = list ( input . split ( " " ) ) ;
StringBuilder T = new StringBuilder ( ) ;
for ( String s : S ) {
  if ( s . equals ( "Left" ) ) T . append ( '<' ) ;
  if ( s . equals ( "Right" ) ) T . append ( '>' ) ;
}
