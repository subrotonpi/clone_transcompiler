public static int unite ( int N ) {
  int [ ] a = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] par = new int [ N + 1 ] ;
  int [ ] size = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    par [ i ] = 0 ;
  }
  int [ ] par = new int [ N + 1 ] ;
  int [ ] size = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    par [ i ] = i ;
  }
  /* unite */
  int x = par [ 0 ] ;
  int y = par [ 1 ] ;
  int res = size [ x ] * size [ y ] ;
  size [ x ] += size [ y ] ;
  par [ y ] = x ;
  return res ;
}
