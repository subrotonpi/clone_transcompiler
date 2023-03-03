public static void print ( int n ) {
  int [ ] h = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) h [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] dp = new int [ n + 10 ] ;
  dp [ 0 ] = 100100 ;
  dp [ 1 ] = Math . min ( dp [ 1 ] , dp [ 1 ] - 1 + Math . abs ( h [ 1 ] - h [ 1 ] - 1 ) ) ;
  for ( int i = 2 ;
  i < n ;
  i ++ ) dp [ i ] = Math . min ( dp [ i - 1 ] + Math . abs ( h [ i ] - h [ i - 1 ] ) , dp [ i - 2 ] + Math . abs ( h [ i ] - h [ i - 2 ] ) ) ;
  System . out . println ( dp [ n - 1 ] ) ;
}
