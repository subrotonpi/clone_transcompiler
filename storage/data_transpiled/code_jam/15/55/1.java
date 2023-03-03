@ SafeVarargs public static < T > String print ( final T ... args ) {
  return String . join ( "," , args ) . stream ( ) . map ( value -> {
    return value . toString ( ) ;
  }
  ) . map ( String :: toString ) . map ( String :: trim ) . map ( String :: toLowerCase ) . map ( String :: trim ) . map ( String :: trim ) . map ( String :: trim ) . map ( String :: toLowerCase :: plus ) . map ( String :: trim ) . map ( String :: trim ) . map ( String :: trim ) . map ( String :: toLowerCase :: plus ) . map ( String :: trim ) . map ( String :: trim ) . map ( String :: trim ) . orElse ( null ) ;
}
