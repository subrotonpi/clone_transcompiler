static final int [ ] [ ] G ( int [ ] [ ] a , int [ ] [ ] b , int [ ] [ ] c ) {
  int N = Integer . parseInt ( input [ 0 ] ) ;
  int M = Integer . parseInt ( input [ 1 ] ) ;
  int T = Integer . parseInt ( input [ 2 ] ) ;
  int [ ] A = new int [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    A [ i ] = null ;
  }
  a [ 0 ] = a [ 0 ] ;
  b [ 0 ] = b [ 0 ] ;
  c [ 0 ] = c [ 0 ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    a [ i ] = b [ i ] ;
  }
  return a ;
}
