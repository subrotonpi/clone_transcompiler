static int N = Integer . parseInt ( input ) {
  A = Integer . parseInt ( input . nextLine ( ) ) ;
  B = Integer . parseInt ( input . nextLine ( ) ) ;
  C = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] l = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) l [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  final int INF = 10 * 9 ;
  /* dfs */
  if ( cur == N ) return Math . min ( a , b , c ) > 0 ? Math . abs ( a - A ) + Math . abs ( b - B ) + Math . abs ( c - C ) - 30 : INF ;
  int ret0 = dfs ( cur + 1 , a , b , c ) ;
  int ret1 = dfs ( cur + 1 , a + l [ cur ] , b , c ) + 10 ;
  int ret2 = dfs ( cur + 1 , a , b , c + l [ cur ] ) + 10 ;
  int ret3 = dfs ( cur + 1 , a , b , c + l [ cur ] ) + 10 ;
  return Math . min ( ret0 , ret1 , ret2 , ret3 ) ;
}
