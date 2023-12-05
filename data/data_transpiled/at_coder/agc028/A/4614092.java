static final int [ ] getBigIntegerArray ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int S = input . nextInt ( ) ;
  int T = input . nextInt ( ) ;
  /* lcm = (int) (a * b) / (a * b) */
  int ans = M ;
  int width = N ;
  for ( int i = 0 ;
  i < width ;
  i ++ ) {
    if ( S [ ( int ) ( N / width ) * i ] != T [ ( int ) ( M / width ) * i ] ) {
      ans = - 1 ;
      break ;
    }
  }
  return ans ;
}
