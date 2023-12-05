public static String emptyRow ( String input ) {
  Set < Character > s = new HashSet < Character > ( ) ;
  for ( char c : input ) s . add ( c ) ;
  return s . size ( ) == 1 && ( s . contains ( "?" ) ) ? input . substring ( 0 , 1 ) : input ;
}
