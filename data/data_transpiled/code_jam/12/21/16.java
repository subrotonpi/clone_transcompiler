static final int count_require ( int [ ] b ) {
  return Arrays . stream ( b ) . reduce ( 0 , ( a , b . length - 1 ) ) ;
}
