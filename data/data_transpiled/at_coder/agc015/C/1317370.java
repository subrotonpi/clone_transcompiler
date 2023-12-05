static final int [ ] [ ] S ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] S = new int [ N + 1 ] [ M + 1 ] ;
  for ( int n = 1 ;
  n <= N ;
  n ++ ) {
    S [ n ] [ 1 ] = Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  int [ ] [ ] N_cum = new int [ N ] [ M + 1 ] ;
  int [ ] [ ] ER_cum = new int [ N ] [ M + 1 ] ;
  int [ ] [ ] EC_cum = new int [ M ] [ M + 1 ] ;
  int [ ] [ ] sol_list = new int [ Q ] [ M + 1 ] ;
  for ( int q = 0 ;
  q < Q ;
  q ++ ) {
    int x1 = Integer . parseInt ( input . nextLine ( ) ) ;
    int y1 = Integer . parseInt ( input . nextLine ( ) ) ;
    int x2 = Integer . parseInt ( input . nextLine ( ) ) ;
    int y2 = Integer . parseInt ( input . nextLine ( ) ) ;
    int N_nodes = N_cum [ x2 ] [ y2 ] - N_cum [ x1 - 1 ] [ y2 ] - N_cum [ x2 ] [ y1 - 1 ] + N_cum [ x1 - 1 ] [ y1 - 1 ] ;
    int N_edges1 = ER_cum [ x2 - 1 ] [ y2 ] - ER_cum [ x1 - 1 ] [ y2 ] - ER_cum [ x2 - 1 ] [ y1 - 1 ] + ER_cum [ x1 - 1 ] [ y1 - 1 ] ;
    int N_edges2 = EC_cum [ x2 ] [ y2 - 1 ] - EC_cum [ x1 - 1 ] [ y2 - 1 ] - EC_cum [ x2 ] [ y1 - 1 ] + EC_cum [ x1 - 1 ] [ y1 - 1 ] ;
    sol_list [ q ] = N_nodes - N_edges1 - N_edges2 ;
  }
  for ( int q = 0 ;
  q < Q ;
  q ++ ) {
    System . out . println ( ( int [ ] [ ] ) sol_list [ q ] ) ;
  }
  return S ;
}
