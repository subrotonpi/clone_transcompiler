private static int n ( int A , int B , int C ) {
  int [ ] l = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) l [ i ] = Integer . parseInt ( input ( ) ) ;
  int t = 10 * 9 ;
  {
    if ( level == n ) return Math . min ( a , b , c ) > 0 ? Math . abs ( a - A ) + Math . abs ( b - B ) + Math . abs ( c - C ) - 30 : t ;
  }
  int k1 = dfs ( level + 1 , a , b , c ) ;
  int k2 = dfs ( level + 1 , a + l [ level ] , b , c ) + 10 ;
  int k3 = dfs ( level + 1 , a , b + l [ level ] , c ) + 10 ;
  int k4 = dfs ( level + 1 , a , b , c + l [ level ] ) + 10 ;
  return Math . min ( k1 , k2 , k3 , k4 ) ;
}
