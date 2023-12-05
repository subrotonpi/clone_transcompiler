static int [ ] readInts ( ) throws IOException {
  final String [ ] line = System . console ( ) . readLine ( ) . split ( " " ) ;
  return Arrays . stream ( line ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
}
