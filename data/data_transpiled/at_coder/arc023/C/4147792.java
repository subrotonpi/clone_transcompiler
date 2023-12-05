public static List < Integer > inpl ( ) {
  return Lists . newArrayList ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int MOD = 10 * 9 + 7 ;
  /* make inv */
  int [ ] inv = new int [ N + 1 ] ;
  inv [ 1 ] = 1 ;
  for ( int i = 2 ;
  i <= N ;
  i ++ ) {
    inv [ i ] = inv [ MOD % i ] * ( MOD - MOD / i ) % MOD ;
  }
  /* inv */
  inv = makeInv ( 2000 ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = inpl ( ) ;
  int [ ] mins = new int [ N ] ;
  int [ ] maxs = new int [ N ] ;
  int [ ] streaks = new int [ N ] ;
  int min_ = 0 ;
  int max_ = 1e9 + 1 ;
  int streak = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( A [ i ] != - 1 ) min_ = Math . max ( min_ , A [ i ] ) ;
    mins [ i ] = min_ ;
  }
  for ( int i = N - 1 ;
  i >= 0 ;
  i -- ) {
    if ( A [ i ] != - 1 ) max_ = Math . min ( max_ , A [ i ] ) ;
    maxs [ i ] = max_ ;
  }
  maxs = maxs . clone ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    streak = ( streak + ( A [ i ] == - 1 ) ) * ( A [ i ] == - 1 ) ;
    streaks [ i ] = streak ;
  }
  int ans = 1 ;
  int S = 1 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( A [ i ] != - 1 ) {
      ans = ( ans * S ) % MOD ;
      S = 1 ;
    }
    else {
      int d = maxs [ i ] - mins [ i ] + 1 ;
      S = ( S * ( d - 1 + streaks [ i ] ) * inv [ streaks [ i ] ] ) % MOD ;
    }
  }
  System . out . println ( ans ) ;
  return inv ;
}
