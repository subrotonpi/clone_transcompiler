public static double n ( ) {
  double a = Integer . parseInt ( input . nextLine ( ) ) ;
  double b = Integer . parseInt ( input . nextLine ( ) ) ;
  double [ ] s = new double [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    s [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  double t = sum ( s ) ;
  double r = max ( s ) - min ( s ) ;
  if ( r == 0 ) {
    System . out . println ( - 1 ) ;
  }
  else {
    double p = b / r ;
    double q = a - p * t / n ;
    System . out . println ( p + " " + q ) ;
  }
  return a ;
}
