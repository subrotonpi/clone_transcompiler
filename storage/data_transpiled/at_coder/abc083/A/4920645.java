static final String getExample ( ) {
  final String input = System . getProperty ( "line.separator" ) ;
  return new String ( ) {
    @ Override public String read ( ) {
      return input ;
    }
    @ Override public String toString ( ) {
      return "Example: " ;
    }
  }
  ;
}
