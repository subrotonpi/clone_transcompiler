public static void print ( int n ) {
  int [ ] h = Integer . parseInt ( input ( ) ) ;
  long [ ] dp = new long [ n + 10 ] ;
  dp [ 0 ] = 10000000010 ;
  dp [ 1 ] = 0 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    dp [ i ] = Math . min ( dp [ i ] , dp [ i - 1 ] + Math . abs ( h [ i ] - h [ i - 1 ] ) ) ;
    if ( i > 1 ) dp [ i ] = Math . min ( dp [ i ] , dp [ i - 2 ] + Math . abs ( h [ i ] - h [ i - 2 ] ) ) ;
  }
  System . out . println ( dp [ n - 1 ] ) ;
}
