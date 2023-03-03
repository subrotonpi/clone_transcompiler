static final double [ ] inpl ( ) {
  return Arrays . stream ( input . split ( " " ) ) . mapToDouble ( Integer :: parseInt ) . toArray ( ) ;
}
