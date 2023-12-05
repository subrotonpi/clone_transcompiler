public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  if ( n > 11 ) {
    n -= 12 ;
  }
  double x = 30 * n + 0.5 * m ;
  double y = 6 * m ;
  x = new Double ( x ) ;
  y = new Double ( y ) ;
  double z = y - x ;
  if ( z > 180 ) {
    z = 360 - z ;
  }
  System . out . println ( z ) ;
}
