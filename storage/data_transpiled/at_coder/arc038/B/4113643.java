public static boolean dfs ( int H , int W ) {
  int [ ] S = Integer . parseInt ( input ( ) ) ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    S [ i ] = input . charAt ( i ) ;
  }
  /* Check if there are any problems */
  if ( i < 0 || i > H - 1 || j < 0 || j > W - 1 || S [ i ] [ j ] == '#' ) {
    return true ;
  }
  if ( dp [ i ] [ j ] != null ) {
    return dp [ i ] [ j ] ;
  }
  boolean res = false ;
  if ( ! dfs ( i + 1 , j ) || ! dfs ( i + 1 , j + 1 ) || ! dfs ( i , j + 1 ) ) {
    res = true ;
  }
  dp [ i ] [ j ] = res ;
  return dp [ i ] [ j ] ;
}
