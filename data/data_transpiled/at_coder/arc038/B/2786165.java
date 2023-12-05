public static boolean dfs ( int H , int W ) {
  int [ ] S = Integer . parseInt ( input ( ) ) ;
  int [ ] [ ] memo = new int [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    S [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  /* if (i >= H || j >= W || S[i][j] == '#') return true */
  if ( memo [ i ] [ j ] != 0 ) return true ;
  boolean win = false ;
  if ( ! dfs ( i + 1 , j ) ) win = true ;
  return win ;
}
