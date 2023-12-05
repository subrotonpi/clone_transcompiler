public static void print ( String input ) {
  n = Integer . parseInt ( input ) ;
  a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  Arrays . sort ( a ) ;
  int m = a . indexOf ( a [ a . length - 1 ] ) ;
  if ( m == 1 ) {
    System . out . println ( a [ a . length - 2 ] ) ;
  }
  else {
    System . out . println ( a [ a . length - 1 - m ] ) ;
  }
}
