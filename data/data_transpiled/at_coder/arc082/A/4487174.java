@ VisibleForTesting static int max ( ) {
  if ( input . equals ( "" ) ) {
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] a = Arrays . stream ( input . nextLine ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
    System . out . println ( max ( Arrays . stream ( a ) . mapToInt ( x -> x - 1 ) . mapToInt ( x -> x + 1 ) . max ( ) . getAsInt ( ) ) ) ;
  }
  return n ;
}
