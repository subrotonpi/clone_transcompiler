public static Node < String > create ( String label ) {
  Node < String > graph ;
  int c = 0 ;
  int N = Integer . parseInt ( input ( ) ) ;
  graph = new Graph < String > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int [ ] M = new int [ input ( ) . length ( ) ] ;
    for ( int j = 0 ;
    j < input ( ) . length ( ) ;
    j ++ ) M [ i ] = Integer . parseInt ( input ( ) . substring ( i , i + 1 ) ) ;
    graph . addEdges ( i , M ) ;
  }
  return graph ;
}
