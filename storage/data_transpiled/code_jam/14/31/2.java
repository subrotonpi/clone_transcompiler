static final String readStringFromFile ( ) {
  final String [ ] line = new String ( System . in ) . split ( "/" ) ;
  return Arrays . stream ( line ) . map ( x -> Integer . parseInt ( x ) ) . collect ( Collectors . joining ( ) ) ;
}
