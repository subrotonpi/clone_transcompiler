public static double N = Integer . parseInt ( input ) {
  double rate = 380000.0 ;
  double ans = 0.0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String x = input . nextLine ( ) ;
    String u = input . nextLine ( ) ;
    ans += u . equals ( "BTC" ) ? x * rate : x ;
  }
  System . out . println ( ans + ".11f" ) ;
  return ans ;
}
