public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  Arrays . sort ( a ) ;
  int cnt = 0 ;
  for ( int i = 1 ;
  i < a . length ;
  i ++ ) {
    if ( a [ i - 1 ] == a [ i ] ) {
      cnt ++ ;
    }
  }
  if ( cnt % 2 == 0 ) {
    System . out . println ( n - cnt ) ;
  }
  else {
    System . out . println ( n - cnt - 1 ) ;
  }
}
