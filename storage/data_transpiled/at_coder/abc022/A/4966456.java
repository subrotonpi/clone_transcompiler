public static int n ( ) {
  int s = Integer . parseInt ( input . nextLine ( ) ) ;
  int t = Integer . parseInt ( input . nextLine ( ) ) ;
  int w = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ n - 1 ] ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = 0 ;
  if ( s <= w && w <= t ) {
    ans ++ ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    w += a [ i ] ;
    if ( s <= w && w <= t ) {
      ans ++ ;
    }
  }
  return ans ;
}
