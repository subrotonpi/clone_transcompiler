public static int tests = Integer . parseInt ( input ) {
  /* TODO Auto-generated method stub */
  double d = Integer . parseInt ( input . nextLine ( ) ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  double [ ] a = new double [ n ] ;
  double t = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    double s = Integer . parseInt ( input . nextLine ( ) ) ;
    double v = Integer . parseInt ( input . nextLine ( ) ) ;
    t = Math . max ( t , ( d - s ) / v ) ;
  }
  return ( d / t ) ;
}
