public static void print ( int n ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = Integer . parseInt ( input ( ) ) ;
  Arrays . sort ( a ) ;
  int m = a [ a . length - 1 ] ;
  int s = a [ 0 ] ;
  if ( m != a . length - 2 || ( m + 1 ) / 2 != s || ( m % 2 && s - a [ 1 ] ) || ( ( ! m % 2 ) && s == a [ 1 ] ) || any ( a ) ) {
    System . out . println ( "Impossible" ) ;
  }
  else System . out . println ( "Possible" ) ;
}
