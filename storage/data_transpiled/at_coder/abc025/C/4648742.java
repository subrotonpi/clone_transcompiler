@ Nonnull public static LinkedHashMap < Integer , Double > map ( @ Nonnull final int d ) {
  final int [ ] p = new int [ 9 ] ;
  final int [ ] i = new int [ 9 ] ;
  int [ ] i = new int [ 9 ] ;
  for ( int i = 0 ;
  i < 9 ;
  i ++ ) {
    if ( ! m % 3 ) k [ i ] = p [ i ] ;
    m /= 3 ;
    i [ 0 ] = 0 ;
    for ( int j = 0 ;
    j < i ;
    j ++ ) {
      i [ j ] = max ( i , i ) ;
    }
  }
  final int [ ] b = new int [ 2 ] ;
  final int [ ] c = new int [ 3 ] ;
  for ( int i = 0 ;
  i < 10 ;
  i ++ ) {
    p [ i ] = 1 ;
  }
  final int [ ] f = new int [ 10 ] ;
  for ( int i = 0 ;
  i < 10 ;
  i ++ ) {
    f [ i ] = null ;
  }
  dfs ( 0 , 0 ) ;
  System . out . println ( f [ 0 ] ) ;
  System . out . println ( s - f [ 0 ] ) ;
  return f ;
}
