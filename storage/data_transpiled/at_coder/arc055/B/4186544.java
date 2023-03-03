static final int solve ( int i , int j , int b ) {
  System . setSecurityManager ( new RMISecurityManager ( ) ) ;
  int N = Integer . parseInt ( input ( ) ) ;
  int K = Integer . parseInt ( input ( ) ) ;
  int [ ] [ ] [ ] dp = new int [ K + 2 ] [ N + 1 ] [ K + 1 ] ;
  for ( int i = 0 ;
  i < K + 1 ;
  i ++ ) {
    dp [ N ] [ i ] = new int [ K + 1 ] ;
  }
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    dp [ N ] [ K + 1 ] [ i ] = new int [ K + 1 ] ;
  }
  /* solve */
  if ( dp [ i ] [ j ] [ b ] == - 1 ) {
    float maxProb = 1 / ( i + 1 ) , notMaxProb = 1 - 1 / ( i + 1 ) ;
    if ( N - i + j == K ) {
      dp [ i ] [ j ] [ b ] = solve ( i + 1 , j + 1 , b ) * notMaxProb + solve ( i + 1 , j + 1 , 1 ) * maxProb ;
    }
    else {
      dp [ i ] [ j ] [ b ] = 0 ;
    }
  }
  return dp [ i ] [ j ] [ b ] ;
}
