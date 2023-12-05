public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  if ( m < 2 * n || 4 * n < m ) {
    System . out . println ( "-1 -1 -1" ) ;
  }
  for ( int b = 0 ;
  b < 2 ;
  b ++ ) {
    for ( int a = 0 ;
    a < n + 1 - b ;
    a ++ ) {
      if ( 2 * a + 3 * b + 4 * ( n - a - b ) == m ) {
        System . out . println ( a + " " + b + " " + n - a - b ) ;
        break ;
      }
    }
    else {
      continue ;
    }
    break ;
  }
}
