public static int [ ] [ ] readInput ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int M = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] aArray = new int [ N + 1 ] ;
  int [ ] bArray = new int [ M + 1 ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    aArray [ i ] = a ;
    bArray [ i ] = b ;
  }
  int [ ] par = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) par [ i ] = i ;
  int [ ] rank = new int [ N + 1 ] ;
  int [ ] size = new int [ N + 1 ] ;
  /* find the first element */
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int xPar = par [ i ] ;
    int yPar = par [ i ] ;
    if ( xPar == yPar ) return null ;
    if ( rank [ xPar ] < rank [ yPar ] ) {
      par [ xPar ] = yPar ;
      size [ yPar ] += size [ xPar ] ;
    }
    else {
      par [ yPar ] = xPar ;
      size [ xPar ] += size [ yPar ] ;
      if ( rank [ xPar ] == rank [ yPar ] ) rank [ xPar ] ++ ;
    }
  }
  /* boolean func */
  if ( par [ N ] == par [ N ] ) {
    /* return true */
  }
  else {
    /* return false */
  }
  int [ ] [ ] ansArray = new int [ M ] [ ] ;
  int ans = ( int ) ( N * ( N - 1 ) / 2 ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    ansArray [ N - i ] = ans ;
    int a = aArray [ M - 1 - i ] ;
    int b = bArray [ M - 1 - i ] ;
    int p = size [ N - i ] ;
    int q = size [ N - i ] ;
    if ( boolFunc ( a , b ) ) {
    }
    else {
      ans -= p * q ;
      unite ( a , b ) ;
    }
  }
  for ( int i = 0 ;
  i <