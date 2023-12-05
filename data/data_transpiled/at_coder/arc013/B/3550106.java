static final String getInput ( ) {
  final String input = System . getProperty ( "line.separator" ) ;
  return new Scanner ( System . in ) . useDelimiter ( " " ) . next ( ) ;
}
