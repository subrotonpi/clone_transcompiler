@ VisibleForTesting static void dfs ( int n ) {
  int [ ] [ ] G = new int [ n ] [ n ] ;
  int mod = 10 * 9 + 7 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    G [ a ] [ b ] = b ;
    G [ b ] [ a ] = a ;
  }
  int [ ] [ ] dp = new int [ 100005 ] [ 2 ] ;
  for ( int j = 0 ;
  j < dp . length ;
  j ++ ) {
    dp [ j ] [ 0 ] = 0 ;
  }
  dfs ( v , pre ) ;
  for ( int u : G [ v ] ) {
    if ( u == pre ) continue ;
    dfs ( u , v ) ;
  }
  int f = 1 , g = 1 ;
  for ( int u : G [ v ] ) {
    if ( u == pre ) continue ;
    g = g * dp [ u ] [ 1 ] % mod ;
    f = f * ( dp [ u ] [ 0 ] + dp [ u ] [ 1 ] ) % mod ;
  }
  dfs ( v , 1 , - 1 ) ;
  System . out . println ( ( dp [ 1 ] [ 0 ] + dp [ 1 ] [ 1 ] ) % mod ) ;
}
