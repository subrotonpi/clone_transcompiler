public static void print ( int n ) {
  int [ ] a = new int [ n ] ;
  if ( n >= 3 ) {
    a [ 2 ] = 1 ;
  }
  for ( int i = 3 ;
  i < n ;
  i ++ ) {
    a [ i ] = ( a [ i - 1 ] + a [ i - 2 ] + a [ i - 3 ] ) % 10007 ;
  }
  System . out . println ( a [ a . length - 1 ] ) ;
}
