static final int [ ] getNegativeInstances ( ) {
  final int n = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] A = Arrays . stream ( input . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  return A ;
}
