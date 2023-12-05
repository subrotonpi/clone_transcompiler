public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  Arrays . sort ( a ) ;
  int [ ] b = new int [ n ] ;
  int c = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    c += a [ i ] ;
    b [ i ] = c ;
  }
  Arrays . sort ( a , Collections . reverseOrder ( ) ) ;
  Arrays . sort ( b , Collections . reverseOrder ( ) ) ;
  int d = 0 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( b [ i ] * 2 < a [ i - 1 ] ) {
      d = i ;
      break ;
    }
  }
  if ( d > 0 ) {
    System . out . println ( d ) ;
  }
  else {
    System . out . println ( n ) ;
  }
}
