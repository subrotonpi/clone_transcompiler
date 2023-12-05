public static int N = Integer . parseInt ( input ) {
  if ( input . length ( ) > 100 ) return 0 ;
  int cnt = input . length ( ) == N ? 1 : 0 ;
  cnt += dfs ( input . length ( ) + 4 ) ;
  cnt += dfs ( input . length ( ) + 7 ) ;
  return cnt ;
}
