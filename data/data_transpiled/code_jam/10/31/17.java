static final int solve ( int [ ] wires ) {
  return Arrays . stream ( wires ) . reduce ( ( a , b ) -> a + b , ( a , b ) -> a + b ) ;
}
