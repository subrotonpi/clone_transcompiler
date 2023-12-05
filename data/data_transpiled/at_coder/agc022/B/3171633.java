public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  if ( n == 3 ) {
    System . out . println ( 2 , 5 , 63 ) ;
    exit ( ) ;
  }
  else if ( n == 4 ) {
    System . out . println ( 2 , 5 , 20 , 63 ) ;
    exit ( ) ;
  }
  else if ( n == 5 ) {
    System . out . println ( 2 , 5 , 20 , 30 , 63 ) ;
    exit ( ) ;
  }
  int [ ] ans = new int [ n ] ;
  ans [ 0 ] = 8 ;
  ans [ 1 ] = 9 ;
  ans [ 2 ] = 2 ;
  ans [ 3 ] = 4 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) ans [ i ] = 0 ;
  int temp = Integer . parseInt ( ans [ i ] ) % 6 ;
  switch ( temp ) {
  }
}
