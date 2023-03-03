public static int N = Integer . parseInt ( input ) {
  if ( s . length ( ) == Integer . toString ( N ) . length ( ) ) return 0 ;
  int ans = 0 ;
  for ( char c : "357" ) {
    if ( Integer . toString ( s + c ) <= N && Arrays . contains ( s + c , "357" ) ) ans ++ ;
    ans += dfs ( s + c ) ;
  }
  return ans ;
}
