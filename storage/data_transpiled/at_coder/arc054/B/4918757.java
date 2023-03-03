public static final double getDoubleInRange ( ) {
  final String input = System . getProperty ( "line.separator" ) ;
  final double p = Double . parseDouble ( input ) ;
  return p + p / 2 * ( p / 1.5 ) ;
}
