static final int [ ] getDoubleArray ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] ans = new int [ N ] ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int L = Integer . parseInt ( input . nextLine ( ) ) ;
    int R = Integer . parseInt ( input . nextLine ( ) ) ;
    int T = Integer . parseInt ( input . nextLine ( ) ) ;
    ans [ L - 1 ] = T ;
  }
  for ( int i = 0 ;
  i < ans . length ;
  i ++ ) {
    System . out . println ( ans [ i ] ) ;
  }
  return ans ;
}
