public static void print ( int n ) {
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] x = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    x [ i ] = Math . min ( x [ i ] , Math . abs ( k - x [ i ] ) ) ;
  }
  System . out . println ( l ) ;
}
