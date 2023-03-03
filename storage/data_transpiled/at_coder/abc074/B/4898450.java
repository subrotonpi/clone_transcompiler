public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] X = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < X . length ;
  i ++ ) {
    X [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = 0 ;
  for ( int x : X ) {
    ans += x < K - x ? x * 2 : ( K - x ) * 2 ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
