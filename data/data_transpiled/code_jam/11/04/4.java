private static int solve ( int [ ] L ) {
  List < Integer > s = new ArrayList < > ( Arrays . asList ( L ) ) ;
  return s . stream ( ) . filter ( i -> L [ i ] != s . get ( i ) ) . collect ( Collectors . toList ( ) ) . stream ( ) . sorted ( ) . filter ( i -> i != s . size ( ) ) . collect ( Collectors . toList ( ) ) . stream ( ) . sorted ( ) . filter ( i -> i != s . size ( ) ) . collect ( Collectors . toList ( ) ) . stream ( ) . sorted ( ) . collect ( Collectors . toList ( ) ) . stream ( ) . mapToInt ( i -> i ) . map ( Integer :: valueOf ) . collect ( Collectors . toList ( ) ) . collect ( Collectors . toList ( ) ) . size ( ) ;
}
