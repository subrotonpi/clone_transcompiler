static final String print ( String input ) {
  final int n = Integer . parseInt ( input ) ;
  final int [ ] A = Arrays . stream ( input . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  Queue < Integer > Q = new LinkedList < > ( ) ;
  return Q . toString ( ) ;
}
