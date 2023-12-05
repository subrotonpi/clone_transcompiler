private static int solve ( ) {
  int m = Integer . parseInt ( readLine ( ) ) ;
  int n = Integer . parseInt ( readLine ( ) ) ;
  double [ ] p = new double [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    p [ i ] = Double . parseDouble ( readLine ( ) ) ;
  }
  double [ ] ps = new double [ m ] ;
  ps [ 0 ] = 1.0 ;
  for ( int i : xrange ( m ) ) {
    ps [ i ] = ps [ i - 1 ] * p [ i ] ;
  }
  int result = n + 2 ;
  for ( int d : xrange ( m + 1 ) ) {
    int expected = ( d + n - ( m - d ) + 1 ) + ( 1 - ps [ m - d ] ) * ( n + 1 ) ;
    result = Math . min ( result , expected ) ;
  }
  return result ;
}
