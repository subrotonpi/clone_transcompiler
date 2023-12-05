public static int N = Integer . parseInt ( input ) {
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( i ) ;
  }
  A . add ( x ) ;
  INF = 10 * 18 ;
  int ans = INF ;
  int [ ] B = new int [ N ] ;
  for ( int cnt = 0 ;
  cnt < N ;
  cnt ++ ) {
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      B [ i ] = Math . min ( B [ i ] , A . get ( N + i - cnt ) ) ;
    }
    ans = Math . min ( ans , cnt * x + sum ( B ) ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
