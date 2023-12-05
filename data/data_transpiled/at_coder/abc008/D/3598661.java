public static int W = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] pos = new int [ N ] [ 2 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    pos [ i ] [ 0 ] = Integer . parseInt ( input . nextLine ( ) ) ;
    pos [ i ] [ 1 ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  HashMap < Integer , Integer > dp = new HashMap < > ( ) ;
  /* DP */
  if ( ( dp . containsKey ( new Integer ( N ) ) ) ) {
    return dp . get ( new Integer ( N ) ) ;
  }
  int res = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = pos [ i ] [ 0 ] ;
    int y = pos [ i ] [ 1 ] ;
    if ( l <= x && x <= r && b <= y && y <= t ) {
      res = Math . max ( res , r - l + t - b + 1 + DP ( l , x - 1 , y + 1 , t ) + DP ( x + 1 , r , y + 1 , t ) + DP ( l , x - 1 , b , y - 1 ) ) ;
    }
  }
  dp . put ( new Integer ( N ) , res ) ;
  return res ;
}
