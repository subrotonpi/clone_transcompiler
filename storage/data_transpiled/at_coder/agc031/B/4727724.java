public static int solve ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] c = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) c [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int mod = 10 * 9 + 7 ;
  int [ ] dp = new int [ n ] ;
  dp [ 0 ] = 1 ;
  dp [ 1 ] = 1 ;
  int [ ] place = new int [ 200001 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( place [ c [ i ] - 1 ] != - 1 ) {
      if ( place [ c [ i ] - 1 ] == i - 1 ) dp [ i ] = dp [ i - 1 ] ;
      else dp [ i ] = ( dp [ i - 1 ] + dp [ place [ c [ i ] - 1 ] ] ) % mod ;
    }
    else dp [ i ] = dp [ i - 1 ] ;
    place [ c [ i ] - 1 ] = i ;
  }
  return dp [ dp . length - 1 ] % mod ;
}
