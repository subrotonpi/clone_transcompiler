public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] LR = new int [ N + 1 ] [ N + 1 ] ;
  int [ ] ans = new int [ Q ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int l = Integer . parseInt ( input . nextLine ( ) ) ;
    int r = Integer . parseInt ( input . nextLine ( ) ) ;
    LR [ l ] [ r ] ++ ;
  }
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    for ( int j = 1 ;
    j <= N ;
    j ++ ) {
      LR [ i ] [ j ] += LR [ i ] [ j - 1 ] ;
    }
  }
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    for ( int j = 1 ;
    j <= N ;
    j ++ ) {
      LR [ i ] [ j ] += LR [ i - 1 ] [ j ] ;
    }
  }
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int p = Integer . parseInt ( input . nextLine ( ) ) ;
    int q = Integer . parseInt ( input . nextLine ( ) ) ;
    ans [ i ] = LR [ q ] [ q ] + LR [ p - 1 ] [ p - 1 ] - LR [ p - 1 ] [ q ] - LR [ q ] [ p - 1 ] ;
  }
  for ( int a : ans ) {
    System . out . println ( a ) ;
  }
}
