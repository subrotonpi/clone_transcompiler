public static double N = Integer . parseInt ( input ) {
  double res = 0.0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String mon = input . next ( ) ;
    String sib = input . next ( ) ;
    if ( sib . equals ( "JPY" ) ) {
      res += Double . parseDouble ( mon ) ;
    }
    else if ( sib . equals ( "BTC" ) ) {
      res += Double . parseDouble ( mon ) * 380000.0 ;
    }
  }
  System . out . println ( res ) ;
  return res ;
}
