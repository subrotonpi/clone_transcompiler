static int N ( int N , int A , int B , int C ) {
  int [ ] list = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) list [ i ] = Integer . parseInt ( input ( ) ) ;
  /* dfs */
  if ( cnt == N ) return Math . min ( A , b ) > 0 ? Math . abs ( A - a ) + Math . abs ( B - b ) + Math . abs ( C - c ) : 10 * 9 ;
  int l = dfs ( cnt + 1 , a , b , c ) ;
  int la = dfs ( cnt + 1 , a + list [ cnt ] , b , c ) + ( a != 0 ? 10 : 0 ) ;
  int lb = dfs ( cnt + 1 , a , b + list [ cnt ] , c ) + ( b != 0 ? 10 : 0 ) ;
  int lc = dfs ( cnt + 1 , a , b , c + list [ cnt ] ) + ( c != 0 ? 10 : 0 ) ;
  return Math . min ( l , la , lb , lc ) ;
}
