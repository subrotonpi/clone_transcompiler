public static int N ( ) {
  int N = ( list . length ) ;
  int M = ( list . length ) ;
  int S = input . nextInt ( ) ;
  int T = input . nextInt ( ) ;
  /* Compute the gcd of the integers */
  int x = Math . min ( S , T ) ;
  int y = Math . max ( T , S ) ;
  if ( y % x == 0 ) {
    return x ;
  }
  /* Main */
  if ( S [ 0 ] != T [ 0 ] ) {
    return - 1 ;
  }
  int g = gcd ( N , M ) ;
  int n = N / g ;
  int m = M / g ;
  for ( int i = 0 ;
  i < g ;
  i ++ ) {
    if ( S [ n * i ] != T [ m * i ] ) {
      return - 1 ;
    }
  }
  return N * M / g ;
}
