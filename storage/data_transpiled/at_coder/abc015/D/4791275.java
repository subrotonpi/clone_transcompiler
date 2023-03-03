static final int [ ] [ ] resize ( int N , int W ) {
  int W = Integer . parseInt ( input ( ) ) ;
  N = Integer . parseInt ( input ( ) ) ;
  K = Integer . parseInt ( input ( ) ) ;
  int [ ] [ ] widVal = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) widVal [ i ] = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) widVal [ i ] [ 0 ] = Integer . parseInt ( input ( ) ) ;
  int [ ] [ ] dp = new int [ N + 1 ] [ W + 1 ] ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    int key = widVal [ i - 1 ] [ 0 ] ;
    dp [ i ] [ 0 ] = dp [ i - 1 ] [ 0 ] ;
    dp [ i ] [ 1 ] = Math . max ( dp [ i - 1 ] [ key ] , dp [ i ] [ 1 ] ) ;
  }
  System . out . println ( dp [ N ] [ W ] [ K ] ) ;
}
