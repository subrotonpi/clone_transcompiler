public static void q ( ) {
  System . out . println ( 0 ) ;
  exit ( ) ;
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int d = Integer . parseInt ( input . readLine ( ) ) ;
  int x = Integer . parseInt ( input . readLine ( ) ) , y = Integer . parseInt ( input . readLine ( ) ) ;
  if ( x % d + y % d > 0 ) q ( ) ;
  else {
    x = Math . abs ( x / d ) ;
    y = Math . abs ( y / d ) ;
    if ( x < y ) x = y ;
  }
  if ( ( n + x + y ) % 2 > 0 ) q ( ) ;
  int a = ( n - x - y ) / 2 , b = ( n - x + y ) / 2 ;
  if ( a < 0 || b < 0 ) q ( ) ;
  int p = 1 ;
  int c = 2 * n ;
  for ( int i = 0 ;
  i < a ;
  i ++ ) {
    p = p * ( n - i ) / ( i + 1 ) ;
    while ( p > 1 ) {
      p /= 2 ;
      c -- ;
    }
  }
  for ( int i = 0 ;
  i < c ;
  i ++ ) p /= 2 ;
  System . out . println ( p ) ;
}
