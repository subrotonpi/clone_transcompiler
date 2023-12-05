static final String concatStr ( Object [ ] args ) {
  final StringBuilder sb = new StringBuilder ( ) ;
  sb . append ( "" ) ;
  for ( Object arg : args ) {
    sb . append ( arg . toString ( ) ) ;
  }
  return sb . toString ( ) ;
}
