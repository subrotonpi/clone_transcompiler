public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int x = Integer . parseInt ( input ) ;
  int [ ] ans = new int [ 2 * n ] ;
  for ( int i = 1 ;
  i <= 2 * n ;
  i ++ ) ans [ i ] = i ;
  if ( x == 1 || x == 2 * n - 1 ) {
    System . out . println ( "No" ) ;
    exit ( ) ;
  }
  System . out . println ( "Yes" ) ;
  ans [ n - 1 ] = ans [ x - 1 ] ;
  ans [ x - 1 ] = ans [ n - 1 ] ;
  ans [ n - 2 ] = ans [ 0 ] ;
  ans [ n - 2 ] = ans [ n - 2 ] ;
  ans [ 0 ] = ans [ n - 2 ] ;
  ans [ n ] = ans [ n - 2 ] ;
  ans [ 2 * n - 2 ] = ans [ n - 2 ] ;
  if ( n == 2 ) {
    for ( int i = 0 ;
    i < ans . length ;
    i ++ ) System . out . println ( ans [ i ] ) ;
    exit ( ) ;
  }
  if ( x < 2 * n - 2 ) {
    ans [ n - 3 ] = ans [ 2 * n - 3 ] ;
    ans [ n - 3 ] = ans [ n - 3 ] ;
  }
  else {
    ans [ n + 1 ] = ans [ 1 ] ;
    ans [ n + 1 ] = ans [ n + 1 ] ;
  }
  for ( int i = 0 ;
  i < ans . length ;
  i ++ ) System . out . println ( ans [ i ] ) ;
}
