static final int [ ] getBinaryDP ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] l = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) l [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int INF = n + 10 ;
  DP [ 0 ] = INF ;
  int z = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int j = Math . min ( DP [ i ] , l [ i ] ) ;
    if ( DP [ j ] == INF ) z = j ;
    DP [ j ] = l [ i ] ;
  }
  System . out . println ( n - z ) ;
}
