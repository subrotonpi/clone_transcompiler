public static int [ ] getDistance ( String input ) {
  int L = Integer . parseInt ( input ) ;
  int N = Integer . parseInt ( input ) ;
  int [ ] X = new int [ N ] ;
  int [ ] Y = new int [ N ] ;
  int [ ] SX = new int [ N ] ;
  int [ ] SY = new int [ N ] ;
  int sx = 0 ;
  int sy = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input ) ;
    X [ i ] = x ;
    sx += x ;
    SX [ i ] = sx ;
    Y [ i ] = L - x ;
    sy += L - x ;
    SY [ i ] = sy ;
  }
  int maxScore = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( i > N - i - 1 ) {
      maxScore = Math . max ( 2 * ( SX [ i ] - SX [ 2 * i - N ] ) + 2 * ( SY [ N ] - SY [ i + 1 ] ) + Y [ i ] , maxScore ) ;
    }
    else if ( i < N - i - 1 ) {
      maxScore = Math . max ( 2 * ( SX [ i ] - SX [ 0 ] ) + 2 * ( SY [ 2 * i + 2 ] - SY [ i + 1 ] ) + X [ i ] , maxScore ) ;
    }
    int ind = Math . min ( i , N - i - 1 ) ;
    maxScore = Math . max ( 2 * ( SX [ i ] - SX [ i - ind ] ) + 2 * ( SY [ i + ind + 1 ] - SY [ i + 1 ] ) + X [ i ] , maxScore ) ;
    maxScore = Math . max ( 2 * ( SX [ i ] - SX [ i - ind ] ) + 2 * ( SY [ i + ind + 1 ] - SY [ i + 1 ] ) + Y [ i ] , maxScore ) ;
  }
  System . out . println ( maxScore ) ;
  return X ;
}
