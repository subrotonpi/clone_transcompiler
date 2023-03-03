public static int [ ] [ ] getM ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int D = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] S = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    S [ i ] = i ;
  }
  int [ ] Q = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Q [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Q [ i ] = i ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Q [ i ] = i ;
  }
  int [ ] L = new int [ N ] ;
  for ( int q = 0 ;
  q < N ;
  q ++ ) {
    if ( L [ q ] == 0 ) {
      int [ ] P = new int [ N ] ;
      P [ 0 ] = q ;
      int nq = q ;
      while ( Q [ nq ] != q ) {
        nq = Q [ nq ] ;
        P [ nq ] = nq ;
      }
      int k = D % P . length ;
      for ( int i = 0 ;
      i < P . length ;
      i ++ ) {
        L [ p ] = P [ ( i + k ) % P . length ] + 1 ;
      }
    }
  }
  for ( int l : L ) {
    System . out . println ( l ) ;
  }
  return L ;
}
