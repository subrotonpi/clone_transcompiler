static final int [ ] [ ] resize ( int W , int N ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int K = Integer . parseInt ( input ( ) ) ;
  int [ ] wid = new int [ N ] ;
  int [ ] imp = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input ( ) ) ;
    int b = Integer . parseInt ( input ( ) ) ;
    wid [ i ] = a ;
    imp [ i ] = b ;
  }
  int [ ] [ ] dp = new int [ W + 1 ] [ N + 1 ] ;
  for ( int n = 1 ;
  n <= N ;
  n ++ ) {
    System . arraycopy ( wid [ n ] , 0 , dp [ n ] , n , 1 ) ;
    System . arraycopy ( wid [ n ] , 0 , dp [ n ] , n - 1 , 1 ) ;
    System . arraycopy ( imp [ n ] , 0 , dp [ n ] , n - wid [ n ] , n - 1 , - 1 ) + imp [ n ] ;
  }
  System . arraycopy ( dp , W , dp , N , K ) ;
  return dp ;
}
