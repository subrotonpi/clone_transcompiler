public static int T = Integer . parseInt ( Scanner in ) {
  for ( int t = 1 ;
  t <= T ;
  t ++ ) {
    int A = in . nextInt ( ) , B = in . nextInt ( ) ;
    float [ ] P = in . nextGaussian ( ) ;
    float Best = B + 2.0f ;
    float probRight = 1 ;
    for ( int i = 0 ;
    i < A ;
    i ++ ) {
      probRight *= P [ i ] ;
      float EV = ( 2 * B + 2 + A - 2 * ( i + 1 ) ) - probRight * ( B + 1 ) ;
      if ( EV < Best ) Best = EV ;
    }
    System . out . println ( "Case #" + t + ":" + Best ) ;
  }
  return T ;
}
