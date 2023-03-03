public static void print ( int n ) {
  int k = Integer . parseInt ( input ( ) ) ;
  int [ ] x = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    x [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ans += Math . min ( x [ i ] , k - x [ i ] ) ;
  }
  System . out . println ( ans * 2 ) ;
}
