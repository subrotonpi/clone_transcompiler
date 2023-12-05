static final double ceil ( ) {
  String [ ] work = input ( ) . split ( "\\s+" ) ;
  int a = Integer . parseInt ( work [ 0 ] ) ;
  int b = Integer . parseInt ( work [ 1 ] ) ;
  return Math . ceil ( ( a + b ) / 2 ) ;
}
