public static int [ ] [ ] getans ( ) {
  final int N = Integer . parseInt ( input . readLine ( ) ) ;
  final int M = Integer . parseInt ( input . readLine ( ) ) ;
  final int Q = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] a = new int [ N + 1 ] [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int L = Integer . parseInt ( input . readLine ( ) ) ;
    int R = Integer . parseInt ( input . readLine ( ) ) ;
    a [ L ] [ R ] ++ ;
  }
  int [ ] [ ] b = new int [ N + 1 ] [ N + 1 ] ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    for ( int j = i ;
    j <= N ;
    j ++ ) {
      b [ i ] [ j ] = a [ i ] [ j ] + b [ i ] [ j - 1 ] ;
    }
  }
  int [ ] [ ] ans = new int [ N + 2 ] [ N + 1 ] ;
  for ( int i = 0 ;
  i < N + 2 ;
  i ++ ) {
    for ( int q = 1 ;
    q <= N ;
    q ++ ) {
      for ( int p = q ;
      p > 0 ;
      p -- ) {
        ans [ p ] [ q ] = ans [ p + 1 ] [ q ] + b [ p ] [ q ] ;
      }
    }
  }
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int p = Integer . parseInt ( input . readLine ( ) ) ;
    int q = Integer . parseInt ( input . readLine ( ) ) ;
    System . out . println ( ans [ p ] [ q ] ) ;
  }
  return ans ;
}
