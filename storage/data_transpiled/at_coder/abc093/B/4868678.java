public static int A = Integer . parseInt ( input ) {
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > l = Arrays . asList ( A , A + K ) ;
  List < Integer > li = l . stream ( ) . filter ( i -> i >= A ) . collect ( Collectors . toList ( ) ) ;
  for ( Integer i : new ArrayList < Integer > ( li ) ) {
    System . out . println ( i ) ;
  }
  return li . size ( ) ;
}
