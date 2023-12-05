public static double dfs ( int A , int B , int C ) {
  int * X = Integer . parseInt ( input ( ) ) ;
  int * Y = Integer . parseInt ( input ( ) ) ;
  double R = sum ( X ) / A ;
  double [ ] [ ] L = new double [ B + 1 ] [ B + 1 ] ;
  double [ ] [ ] memo = new double [ B + 1 ] [ B + 1 ] ;
  for ( int i = 0 ;
  i < B + 1 ;
  i ++ ) {
    memo [ i ] [ 0 ] = null ;
  }
  /* dfs(int c, int k) */
  if ( k == 0 ) {
    return 1. ;
  }
  if ( c == B ) {
    return 0 ;
  }
  if ( memo [ c ] [ k ] != - 1 ) {
    return memo [ c ] [ k ] ;
  }
  double r = dfs ( c + 1 , k ) + dfs ( c + 1 , k - 1 ) * Y [ c ] ;
  memo [ c ] [ k ] = r ;
  return r ;
}
