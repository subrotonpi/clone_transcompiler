static int N = Integer . parseInt ( input ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] list = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    list [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int INF = 10 * 18 ;
  /* dfs */
  if ( cur == N ) {
    return Math . min ( A , b ) > 0 ? Math . abs ( A - a ) + Math . abs ( B - b ) + Math . abs ( C - c ) - 30 : INF ;
  }
  int ptn1 = dfs ( cur + 1 , a , b , c ) ;
  int ptn2 = dfs ( cur + 1 , a + list [ cur ] , b , c ) + 10 ;
  int ptn3 = dfs ( cur + 1 , a , b + list [ cur ] , c ) + 10 ;
  int ptn4 = dfs ( cur + 1 , a , b , c + list [ cur ] ) + 10 ;
  return Math . min ( ptn1 , ptn2 , ptn3 , ptn4 ) ;
}
