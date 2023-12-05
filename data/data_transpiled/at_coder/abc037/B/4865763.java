public static int [ ] getA ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int L = Integer . parseInt ( input . nextLine ( ) ) ;
    int R = Integer . parseInt ( input . nextLine ( ) ) ;
    int T = Integer . parseInt ( input . nextLine ( ) ) ;
    for ( int j = 0 ;
    j < R - L + 1 ;
    j ++ ) {
      A [ L - 1 + j ] = T ;
    }
  }
  for ( int a : A ) {
    System . out . println ( a ) ;
  }
  return A ;
}
