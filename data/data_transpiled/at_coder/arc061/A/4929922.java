public static int dfs ( String x , int len_x , int i ) {
  if ( i < len_x ) {
    dfs ( x , len_x , i + 1 ) ;
  }
  if ( i < len_x ) {
    x = x . substring ( 0 , i + 1 ) + "+" + x . substring ( i + 1 ) ;
    dfs ( x , len_x + 1 , i + 2 ) ;
    ans += Integer . parseInt ( x ) ;
  }
  if ( i == len_x ) {
    return Integer . parseInt ( x ) ;
  }
  else {
    return 0 ;
  }
}
