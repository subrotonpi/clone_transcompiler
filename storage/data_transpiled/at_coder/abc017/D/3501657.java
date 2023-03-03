public static void dp ( int N , int M ) {
  int [ ] f = Integer . parseInt ( input . nextLine ( ) ) . split ( " " ) ;
  int mod = 1000000007 ;
  int [ ] LIST = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    LIST [ i ] = - 1 ;
  }
  int [ ] NOW = new int [ M + 1 ] ;
  NOW [ M + 1 ] = - 1 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = f [ i ] ;
    if ( NOW [ x ] != - 1 ) {
      LIST [ i ] = NOW [ x ] ;
    }
    NOW [ x ] = i ;
  }
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    DP [ i ] = 1 ;
  }
  System . out . println ( DP [ N + 1 ] ) ;
}
