public static int [ ] [ ] X ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] X = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    X [ a - 1 ] [ b ] = b - 1 ;
    X [ b - 1 ] [ a ] = a - 1 ;
  }
  /* farthest */
  int [ ] L = new int [ N ] ;
  L [ N ] = - 1 ;
  L [ N ] = 0 ;
  int d = 0 ;
  int [ ] post = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L [ i ] = L [ i ] ;
  }
  while ( post . length > 0 ) {
    d ++ ;
    int [ ] pre = post ;
    post = new int [ N ] ;
    for ( int j = 0 ;
    j < pre . length ;
    j ++ ) {
      for ( int k = 0 ;
      k < X [ j ] ;
      k ++ ) {
        if ( L [ k ] < 0 ) {
          L [ k ] = d ;
          post [ j ] = k ;
        }
      }
    }
  }
  return pre ;
}
