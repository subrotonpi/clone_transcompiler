static final String [ ] shift ( String [ ] a , int sh ) {
  return Arrays . stream ( a ) . map ( s -> s . substring ( sh ) ) . toArray ( String [ ] :: new ) ;
}
