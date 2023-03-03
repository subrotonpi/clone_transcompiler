public static void main ( String input , int n , int x ) {
  int i ;
  int x = Integer . parseInt ( input ) ;
  if ( x == n ) {
    System . out . println ( "Yes" ) ;
    for ( i = 1 ;
    i <= 2 * n ;
    i ++ ) System . out . println ( i ) ;
  }
  else if ( 1 < x && x < n ) {
    System . out . println ( "Yes" ) ;
    for ( i = x + 1 ;
    i <= n ;
    i ++ ) System . out . println ( i ) ;
    for ( i = 1 ;
    i <= x ;
    i ++ ) System . out . println ( i ) ;
    for ( i = n + 1 ;
    i <= 2 * n ;
    i ++ ) System . out . println ( i ) ;
  }
  else if ( n < x && x < 2 * n - 1 ) {
    System . out . println ( "Yes" ) ;
    for ( i = 1 ;
    i <= n ;
    i ++ ) System . out . println ( i ) ;
    for ( i = x ;
    i <= 2 * n ;
    i ++ ) System . out . println ( i ) ;
    for ( i = n ;
    i <= x ;
    i ++ ) System . out . println ( i ) ;
  }
  else System . out . println ( "No" ) ;
}
