public static void print ( int n ) {
  int k = Integer . parseInt ( input ( ) ) ;
  int [ ] xl = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    xl [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ans += Math . min ( 2 * Math . abs ( xl [ i ] ) , 2 * Math . abs ( k - xl [ i ] ) ) ;
  }
  System . out . println ( ans ) ;
}
