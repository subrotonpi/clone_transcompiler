static final long [ ] [ ] getDijkstra ( ) {
  final int K = Integer . parseInt ( input . nextLine ( ) ) ;
  final Map < Integer , Map < Integer , Integer >> [ ] adj = new Map [ K ] ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    adj [ i ] = new HashMap < Integer , Integer > ( ) ;
    adj [ i ] [ ( i + 1 ) % K ] = 1 ;
    adj [ i ] [ ( i * 10 ) % K ] = 0 ;
  }
  return adj ;
}
