static final void solve ( @ Nonnull final String [ ] args ) {
  final int N = args . length ;
  final int digit = args [ 0 ] . length ( ) ;
  if ( args . length < digit ) {
    return dfs ( N , digit , args [ 1 ] + "3" ) + dfs ( N , digit , args [ 2 ] + "7" ) + dfs ( N , digit , args [ 3 ] + "5" ) ;
  }
  else {
    if ( Integer . parseInt ( args [ 0 ] ) > N ) {
      return ;
    }
    if ( args [ 1 ] . indexOf ( "3" ) > 0 && args [ 1 ] . indexOf ( "7" ) > 0 && args [ 1 ] . indexOf ( "5" ) > 0 ) {
      return ;
    }
    else {
      return ;
    }
  }
  final int N = Integer . parseInt ( args [ 1 ] ) ;
  final int N = Integer . parseInt ( args [ 2 ] ) ;
  final int i ;
  final int sum = 0 ;
  for ( i = 3 ;
  i <= digit ;
  i ++ ) {
    sum += dfs ( N , i , "" ) ;
  }
  System . out . println ( sum ) ;
  return ;
}
