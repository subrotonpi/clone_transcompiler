public static int dfs ( int i , ArrayList < Integer > sep , String s , int tot ) {
  int n = s . length ( ) ;
  i ++ ;
  if ( i == n ) {
    int ans = 0 ;
    if ( sep . size ( ) > 1 ) {
      for ( int j = 0 ;
      j < sep . size ( ) - 1 ;
      j ++ ) {
        ans += Integer . parseInt ( s . substring ( sep . get ( j ) , sep . get ( j + 1 ) ) ) ;
      }
    }
    ans += Integer . parseInt ( s . substring ( sep . size ( ) - 1 ) ) ;
    return ans ;
  }
  sep . add ( i ) ;
  tot += dfs ( i , sep , s , 0 ) ;
  return tot ;
}
