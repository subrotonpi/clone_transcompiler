static int N = Integer . parseInt ( input ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] L = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) L [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  final int MAX = 10 * 9 ;
  /* dfs */
  if ( cur == N ) {
    return Math . min ( a , b , c ) > 0 ? Math . abs ( a - A ) + Math . abs ( b - B ) + Math . abs ( c - C ) - 30 : MAX ;
  }
  int ret0 = dfs ( cur + 1 , a , b , c ) ;
  int ret1 = dfs ( cur + 1 , a + L [ cur ] , b , c ) + 10 ;
  int ret2 = dfs ( cur + 1 , a , b + L [ cur ] , c ) + 10 ;
  int ret3 = dfs ( cur + 1 , a , b , c + L [ cur ] ) + 10 ;
  return Math . min ( ret0 , ret1 , ret2 , ret3 ) ;
}
