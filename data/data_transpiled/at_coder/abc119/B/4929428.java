public static double getDoubleFromInput ( ) {
  int n = Integer . parseInt ( input ) ;
  double ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String x = input . nextLine ( ) ;
    String u = input . nextLine ( ) ;
    double d = Double . parseDouble ( x ) ;
    if ( u . equals ( "JPY" ) ) {
      ans += d ;
    }
    else {
      ans += d * 380000 ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
