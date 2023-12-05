static final String getIntermediateOutputFileName ( ) {
  if ( System . getProperty ( "java.version" ) . startsWith ( "1.6" ) ) {
    xrange = xrange ;
  }
  return "output_" + new File ( fileName ) . getName ( ) ;
}
