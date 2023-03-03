static final String getSymbolName ( ) throws IOException {
  Stream < String > data = Stream . of ( Arrays . asList ( args ) ) . map ( String :: trim ) . filter ( x -> x . isEmpty ( ) ) . findFirst ( ) ;
  return data . map ( x -> x . trim ( ) ) . map ( x -> x . trim ( ) ) . map ( x -> x . trim ( ) ) . map ( x -> x . trim ( ) ) . map ( x -> x . trim ( ) ) . orElse ( null ) ;
}
