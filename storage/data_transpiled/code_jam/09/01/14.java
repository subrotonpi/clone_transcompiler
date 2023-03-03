static List < List < Character >> readPattern ( String patternAsString , int wordLen ) throws IOException {
  final List < List < Character >> pattern = new ArrayList < List < Character >> ( ) ;
  boolean insideGroup = false ;
  for ( int i = 0 ;
  i < patternAsString . length ( ) ;
  i ++ ) {
    final char c = patternAsString . charAt ( i ) ;
    switch ( c ) {
      case '(' : assert ! insideGroup ;
      insideGroup = true ;
      pattern . add ( new ArrayList < Character > ( ) ) ;
      break ;
      case ')' : assert insideGroup ;
      insideGroup = false ;
      break ;
      default : if ( insideGroup ) {
        pattern . get ( pattern . size ( ) - 1 ) . add ( c ) ;
      }
      else {
        pattern . add ( new ArrayList < Character > ( ) ) ;
      }
      break ;
    }
  }
  assert pattern . size ( ) == wordLen ;
  return pattern ;
}
