@ SafeVarargs public static int [ ] getMath ( ) {
  int R = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  int G = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  int pr = - 100 ;
  int pg = 0 ;
  int pb = 100 ;
  int R0min = min ( floor ( - ( R - 1 ) / 2 ) + pr , floor ( - ( B - 1 ) / 2 ) - G - R ) ;
  int R0max = ceil ( - ( R - 1 ) / 2 ) + pr ;
  int B0min = floor ( - ( B - 1 ) / 2 ) + pb ;
  int B0max = max ( ceil ( - ( B - 1 ) / 2 ) + pb , ceil ( ( R - 1 ) / 2 ) + G ) ;
  /* sumn = (int) (n*(n+1)/2); */
  /* calc count = (int) (n * (n+1) / 2); */
  /* calc = (int) (n * (n + 1) / 2); */
  /* calc = (int) (n * (n + 1) / 2); */
  /* calc = (int) (n * (n + 1) / 2); */
  /* calc = (int) (n * (n + 1) / 2); */
  /* calc = (int) (n * (n + 1) / 2); */
  /* calc = (int) (n * (n + 1) / 2); */
  int minmove = 2 * 31 ;
  for ( int r0 = R0min ;
  r0 <= R0max ;
  r0 ++ ) {
    for ( int b0 = B0min ;
    b0 <= B0max ;
    b0 ++ ) {
      int r1 = r0 + R - 1 ;
      int b1 = b0 + B - 1 ;
      if ( G >= b0 - r1 ) {
        continue ;
      }
      int g0 ;
      int g1 ;
      if (