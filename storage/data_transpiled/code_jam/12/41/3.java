static final String concatStr ( Object [ ] args ) {
  final String s = " " ;
  for ( Object arg : args ) {
    s += arg . toString ( ) ;
  }
  return s ;
}
