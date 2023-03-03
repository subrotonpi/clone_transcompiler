public static int [ ] getStdIn ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int Q = Integer . parseInt ( input ) ;
  int [ ] a = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int L = Integer . parseInt ( input ) ;
    int R = Integer . parseInt ( input ) ;
    int T = Integer . parseInt ( input ) ;
    for ( int j = L ;
    j <= R ;
    j ++ ) {
      a [ j ] = T ;
    }
  }
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    System . out . println ( a [ i ] ) ;
  }
  return a ;
}
