public static int recMemo ( String N ) {
  int [ ] [ ] [ ] dp = new int [ N . length ( ) + 1 ] [ 2 ] ;
  for ( int i = 0 ;
  i < dp . length ;
  i ++ ) {
    dp [ i ] [ i ] = new int [ N . length ( ) ] [ 2 ] ;
  }
  /*if (k == N.length) return flag;
  if (~dp[k][tight][flag]) return dp[k][tight][flag];
  int res = 0;
  int i = 0;
  if (tight) r = Integer.parseInt(N.substring(k));
  else r = 9;
  for (i = 0; i < r; i++) res += i;*/
  for ( int i = 0 ;
  i <= r ;
  i ++ ) {
    res += dp [ i ] [ i ] ;
  }
  return res ;
}
