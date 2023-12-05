public static String parse ( final File inFile ) {
  return ( new ImmutableString ( inFile . getInts ( ) . toArray ( new String [ inFile . getInts ( ) . size ( ) ] ) ) ) . toString ( ) ;
}
