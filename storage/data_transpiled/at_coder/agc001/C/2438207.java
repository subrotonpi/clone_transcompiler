@ VisibleForTesting static int bfs ( int N , int K ) {
  int [ ] [ ] G = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    G [ a - 1 ] [ b ] = b - 1 ;
    G [ b - 1 ] [ a ] = a - 1 ;
    E [ i ] = new Integer ( a - 1 ) ;
  }
  return N ;
  /* First two elements are in order to keep the largest elements */
}
