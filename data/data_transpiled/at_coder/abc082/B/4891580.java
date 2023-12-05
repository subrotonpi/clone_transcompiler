public static final InputSupplier < String > IO_GENERATOR = new InputSupplier < String > ( ) {
  @ Override public String get ( ) {
    return input ;
  }
  @ Override public String get ( ) {
    List < String > s = Collections . singletonList ( input ) ;
    Collections . sort ( s ) ;
    List < String > t = Collections . singletonList ( input ) ;
    Collections . sort ( t , Collections . reverseOrder ( ) ) ;
    return s . size ( ) < t . size ( ) ? "Yes" : "No" ;
  }
}
