static final int [ ] readInts ( ) throws IOException {
  final String line = readLine ( ) ;
  return Arrays . stream ( line . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
}
