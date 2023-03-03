public static int [ ] [ ] getSuretsu ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int Q = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] suretsu = new int [ N ] [ Q ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    suretsu [ i ] = 0 ;
  }
  for ( int j = 0 ;
  j < Q ;
  j ++ ) {
    int L = Integer . parseInt ( input . readLine ( ) ) ;
    int R = Integer . parseInt ( input . readLine ( ) ) ;
    int T = Integer . parseInt ( input . readLine ( ) ) ;
    int [ ] T_li = new int [ R - L + 1 ] ;
    for ( int i = 0 ;
    i < R - L ;
    i ++ ) {
      T_li [ i ] = T ;
    }
    System . arraycopy ( suretsu [ L - 1 ] , 0 , T_li , 0 , L - 1 ) ;
    suretsu [ L - 1 ] = T_li ;
  }
  for ( int k = 0 ;
  k < suretsu . length ;
  k ++ ) {
    System . out . println ( suretsu [ k ] ) ;
  }
  return suretsu ;
}
