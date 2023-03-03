static final int [ ] getRank ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > X = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    X . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  List < Integer > h = new ArrayList < > ( ) ;
  for ( int rank = 0 ;
  rank < X . size ( ) ;
  rank ++ ) {
    int x = X . get ( rank ) ;
    heapify ( h , - x , rank ) ;
    if ( rank < K ) continue ;
    if ( rank == K ) {
      System . out . println ( h . get ( 0 ) . intValue ( ) ) ;
      continue ;
    }
    heapify ( h ) ;
    System . out . println ( h . get ( 0 ) . intValue ( ) ) ;
  }
  return h . toArray ( new Integer [ h . size ( ) ] ) ;
}
