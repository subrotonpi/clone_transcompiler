public static double N = Integer . parseInt ( input ) {
  double A = Integer . parseInt ( input . nextLine ( ) ) ;
  double B = Integer . parseInt ( input . nextLine ( ) ) ;
  double su = 0 ;
  double ma = - 1 ;
  double mi = 10 * 10 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    double s = Integer . parseInt ( input . nextLine ( ) ) ;
    su += s ;
    ma = Math . max ( ma , s ) ;
    mi = Math . min ( mi , s ) ;
  }
  double ave = su / N ;
  if ( ma == mi ) {
    System . out . println ( - 1 ) ;
  }
  else {
    double a = B / ( ma - mi ) ;
    double b = A - ave * a ;
    System . out . println ( a + " " + b ) ;
  }
  return ave ;
}
