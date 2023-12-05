public static void dfs ( int n ) {
  int [ ] t = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    t [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  double ans = Double . MAX_VALUE ;
  /* dfs(i, one, two); */
  if ( i == n ) {
    ans = Math . min ( ans , Math . max ( one , two ) ) ;
    return ;
  }
  dfs ( i + 1 , one + t [ i ] , two ) ;
  dfs ( i + 1 , one , two + t [ i ] ) ;
}
