static final double [ ] range ( int n ) {
  int a = Integer . parseInt ( input ( ) ) ;
  double res = 0 ;
  Function f = new Function ( ) {
    @ Override public double apply ( double x ) {
      return x / n ;
    }
  }
  ;
  while ( true ) {
    double b = f . apply ( a ) ;
    double s = b ;
    if ( s == 0 ) {
      break ;
    }
    else {
      res += s ;
      a -= b * n ;
      a += ( s - b ) ;
    }
  }
  System . out . println ( res ) ;
}
