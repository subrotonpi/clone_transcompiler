@ SafeVarargs public static void heapify ( String ... strings ) {
  int n = Integer . parseInt ( input ( strings [ 0 ] ) ) ;
  int m = Integer . parseInt ( input ( strings [ 1 ] ) ) ;
  int s = Integer . parseInt ( input ( strings [ 2 ] ) ) ;
  s -- ;
  int [ ] [ ] g = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int u = Integer . parseInt ( input ( strings [ i ] ) ) ;
    int v = Integer . parseInt ( input ( strings [ i ] ) ) ;
    u -- ;
    v -- ;
    g [ u ] [ v ] = v ;
    g [ v ] [ v ] = u ;
  }
}
