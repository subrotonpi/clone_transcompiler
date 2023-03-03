public static int [ ] getN ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] Aa = new int [ N ] ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int L = Integer . parseInt ( input . nextLine ( ) ) ;
    int R = Integer . parseInt ( input . nextLine ( ) ) ;
    int T = Integer . parseInt ( input . nextLine ( ) ) ;
    for ( int j = L - 1 ;
    j < R ;
    j ++ ) {
      Aa [ j ] = T ;
    }
  }
  for ( int a : Aa ) {
    System . out . println ( a ) ;
  }
  return Aa ;
}
