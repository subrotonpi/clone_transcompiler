public static int pay ( int x ) {
  if ( n == 1 ) {
    System . out . println ( 1 ) ;
    exit ( ) ;
  }
  int [ ] b = new int [ n - 1 ] ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) b [ i ] = - 1 ;
  b [ 0 ] = Integer . parseInt ( input ( ) ) - 1 ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = b [ i ] ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) a [ i ] = a [ i ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = a [ i ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = a [ i ] ;
  return i ;
}
