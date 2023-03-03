public static void print ( int n ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = Integer . parseInt ( input ( ) ) ;
  System . out . println ( a . length >= 2 ? Math . abs ( a [ n - 1 ] - a [ 0 ] ) : 0 ) ;
}
