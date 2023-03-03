public static double dfs ( int bit ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] cost = new int [ m ] ;
  int [ ] [ ] gatya = new int [ 10 ] [ n ] ;
  for ( int j = 0 ;
  j < m ;
  j ++ ) gatya [ j ] [ 0 ] = 0 ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int c = Integer . parseInt ( input . nextLine ( ) ) ;
    int co = Integer . parseInt ( input . nextLine ( ) ) ;
    cost [ i ] = co ;
    for ( int j = 0 ;
    j < c ;
    j ++ ) {
      int idol = Integer . parseInt ( input . nextLine ( ) ) ;
      int p = Integer . parseInt ( input . nextLine ( ) ) ;
      idol -- ;
      gatya [ i ] [ idol ] = p ;
    }
  }
  double [ ] dp = new double [ 1 << n ] ;
  for ( int i = 0 ;
  i < dp . length ;
  i ++ ) {
    dp [ i ] = Double . POSITIVE_INFINITY ;
  }
  dp [ ( 1 << n ) - 1 ] = 0 ;
  /* dfs(bit) */
  if ( dp [ bit ] != Double . NEGATIVE_INFINITY ) return dp [ bit ] ;
  double exp = Double . POSITIVE_INFINITY ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    double ex = 0 ;
    int [ ] p = new int [ n ] ;
    int sum = 0 ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( ( gatya [ i ] [ j ] != 0 ) && ( ( 1 << j ) & bit ) == 0 ) {
        p [ p . length - 1 ] = j ;
        sum += gatya [ i ] [ j ] ;
      }
    }
    if ( p . length == 0 ) continue ;
    for ( int j : p ) ex += ( dfs ( bit | ( 1 << j ) ) + 100 / ( sum ) * cost [ i ] ) * ( gatya [ i ] [ j ] ) / sum ;
    if ( exp > ex ) exp = ex ;
  }
  dp [ bit ] = exp ;
  return exp ;
}
