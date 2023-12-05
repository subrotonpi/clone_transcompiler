public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int a = 1 ;
  int b = 1 ;
  if ( Math . abs ( n - m ) >= 2 ) {
    System . out . println ( 0 ) ;
  }
  else {
    for ( int i = 2 ;
    i <= n ;
    i ++ ) {
      a = ( a * i ) % ( 10 * 9 + 7 ) ;
    }
    for ( int j = 2 ;
    j <= m ;
    j ++ ) {
      b = ( b * j ) % ( 10 * 9 + 7 ) ;
    }
    if ( n == m ) {
      System . out . println ( ( a * b * 2 ) % ( 10 * 9 + 7 ) ) ;
    }
    else {
      System . out . println ( ( a * b ) % ( 10 * 9 + 7 ) ) ;
    }
  }
}
