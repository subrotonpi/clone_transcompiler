public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  if ( m < 2 * n || 4 * n < m ) {
    System . out . println ( "-1 -1 -1" ) ;
  }
  else {
    int a ;
    int b ;
    if ( ( 4 * n - m ) % 2 == 0 ) {
      b = 0 ;
      a = ( int ) ( ( 4 * n - m ) / 2 ) ;
    }
    else {
      b = 1 ;
      a = ( int ) ( ( 4 * n - m - 1 ) / 2 ) ;
    }
    System . out . println ( a + " " + b + " " + ( n - a - b ) ) ;
  }
}
