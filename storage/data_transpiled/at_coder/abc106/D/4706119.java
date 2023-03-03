public static int N = Integer . parseInt ( input ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] coordinate = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int l = Integer . parseInt ( input . nextLine ( ) ) ;
    int r = Integer . parseInt ( input . nextLine ( ) ) ;
    l = l - 1 ;
    r = r - 1 ;
    coordinate [ l ] [ r ] ++ ;
  }
  int [ ] [ ] acc = new int [ N + 1 ] [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      acc [ i + 1 ] [ j + 1 ] = acc [ i ] [ j + 1 ] + acc [ i + 1 ] [ j ] - acc [ i ] [ j ] + coordinate [ i ] [ j ] ;
    }
  }
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int p = Integer . parseInt ( input . nextLine ( ) ) ;
    int q = Integer . parseInt ( input . nextLine ( ) ) ;
    p = p - 1 ;
    q = q - 1 ;
    int ans = acc [ N ] [ q + 1 ] - acc [ p ] [ q + 1 ] ;
    System . out . println ( ans ) ;
  }
  return M ;
}
