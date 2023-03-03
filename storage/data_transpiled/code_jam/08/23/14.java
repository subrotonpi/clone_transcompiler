static final String getSolutionName ( ) throws IOException {
  Stream < String > data = Stream . of ( Arrays . asList ( "" ) ) . map ( String :: trim ) . filter ( x -> x . isEmpty ( ) ) . map ( x -> x . trim ( ) ) ;
  return data . map ( x -> x . trim ( ) ) . map ( x -> x . trim ( ) ) . map ( x -> x . trim ( ) ) . map ( x -> x . trim ( ) ) . map ( x -> x . trim ( ) ) . map ( x -> x . trim ( ) ) . map ( x -> x . trim ( ) ) . map ( x -> x . trim ( ) ) . orElse ( "" ) ;
}
