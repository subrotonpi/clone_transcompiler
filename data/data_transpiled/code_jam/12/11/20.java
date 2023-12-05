public static void main ( String [ ] args ) {
  for ( int t = 0 ;
  t < Integer . parseInt ( readLine ( ) ) ;
  t ++ ) {
    int A = Integer . parseInt ( readLine ( ) ) ;
    int B = Integer . parseInt ( readLine ( ) ) ;
    float [ ] p = new float [ A ] ;
    for ( int i = 0 ;
    i < B ;
    i ++ ) p [ i ] = Float . parseFloat ( readLine ( ) ) ;
    float prob = 1 ;
    int r = B + 2 ;
    for ( int backspace = xrange ( A , - 1 , - 1 ) ;
    backspace < B ;
    backspace ++ ) {
      int i = backspace ;
      if ( i != - 1 ) prob *= p [ i ] ;
      r = Math . min ( r , ( 2 * backspace + B - A + 1 ) + ( 1 - prob ) * ( B + 1 ) ) ;
    }
    System . out . println ( String . format ( "Case #%d: %.9f" , t + 1 , r ) ) ;
  }
}
