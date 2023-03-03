private static int toMin ( String s ) throws IOException {
  final String [ ] time = s . split ( ":" ) ;
  return Integer . parseInt ( time [ 0 ] ) * 60 + Integer . parseInt ( time [ 1 ] ) ;
}
