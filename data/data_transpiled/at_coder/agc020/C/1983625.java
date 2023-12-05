static final int [ ] getLengths ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = Lists . newArrayList ( ) . stream ( ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  return A ;
}
