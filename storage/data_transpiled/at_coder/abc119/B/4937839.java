public static double getAmount ( ) {
  N = Integer . parseInt ( input ( ) ) ;
  List < String > A = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( Collections . singletonList ( String . valueOf ( input ) ) ) ;
  }
  double ans = 0 ;
  for ( String value : A ) {
    String unit = value ;
    if ( unit . equals ( "BTC" ) ) {
      ans += ( double ) value * 380000 ;
    }
    else {
      ans += ( double ) value ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
