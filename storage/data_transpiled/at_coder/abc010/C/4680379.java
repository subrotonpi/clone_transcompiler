public static void tXA ( double tXA , double tYA , double tXB , double tYB , double t , double v ) {
  int n = Integer . parseInt ( input ( ) ) ;
  double [ ] x = new double [ n ] ;
  double [ ] y = new double [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    double _x = Integer . parseInt ( input ( ) ) ;
    double _y = Integer . parseInt ( input ( ) ) ;
    x [ i ] = _x ;
    y [ i ] = _y ;
  }
  boolean isCheating = false ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ( ( tXA - x [ i ] ) * tXA + ( tYA - y [ i ] ) * tYA ) * tYA <= t * v ) {
      isCheating = true ;
      break ;
    }
  }
  System . out . println ( isCheating ? "YES" : "NO" ) ;
}
