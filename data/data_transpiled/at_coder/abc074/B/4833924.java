public static void print ( int n ) {
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] x = Lists . newArrayList ( ) . stream ( ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( x [ i ] >= k ) {
      ans += 2 * ( x [ i ] - k ) ;
    }
    else {
      ans += 2 * Math . min ( x [ i ] , k - x [ i ] ) ;
    }
  }
  System . out . println ( ans ) ;
}
