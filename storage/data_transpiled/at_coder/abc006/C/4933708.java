public static void main ( String input ) {
  int n = Integer . parseInt ( input ) , m = Integer . parseInt ( input ) ;
  if ( m == 0 || n == 0 || m / n < 2 || m / n > 4 ) {
    System . out . println ( "-1 -1 -1" ) ;
  }
  else {
    for ( int b = 0 ;
    b < 2 ;
    b ++ ) {
      for ( int a = 0 ;
      a < n + 1 ;
      a ++ ) {
        if ( m == ( ( 2 * a ) + ( 4 * ( n - a - b ) ) + ( 3 * b ) ) ) {
          System . out . println ( a + " " + b + " " + n - a - b ) ;
        }
      }
    }
  }
}
