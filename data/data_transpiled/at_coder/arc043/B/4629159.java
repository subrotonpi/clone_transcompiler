public static int [ ] [ ] X ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = 100000 ;
  int [ ] [ ] X = new int [ 4 ] [ M + 1 ] ;
  int [ ] D = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int d = Integer . parseInt ( input . nextLine ( ) ) ;
    D [ i ] = d ;
    X [ 0 ] [ i ] ++ ;
  }
  for ( int k = 0 ;
  k < 4 ;
  k ++ ) {
    for ( int i = 1 ;
    i < M ;
    i ++ ) {
      int d = Integer . parseInt ( input . nextLine ( ) ) ;
      D [ k ] = d ;
      X [ k ] [ i ] ++ ;
    }
  }
  return X ;
}
