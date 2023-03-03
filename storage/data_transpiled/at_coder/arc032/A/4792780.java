public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int ans = n * ( n + 1 ) / 2 ;
  int [ ] so = new int [ 10 * 6 + 5 ] ;
  for ( int i = 0 ;
  i < 10 * 6 ;
  i ++ ) so [ i ] = 1 ;
  so [ 0 ] = 0 ;
  so [ 1 ] = 0 ;
  for ( int i = 2 ;
  i < 1005 ;
  i ++ ) {
    if ( so [ i ] == 1 ) {
      for ( int j = 2 ;
      j < 10 * 6 ;
      j ++ ) {
        if ( i * j > 10 * j ) break ;
        else so [ i * j ] = 0 ;
      }
    }
  }
  if ( so [ ans ] == 1 ) System . out . println ( "WANWAN" ) ;
  else System . out . println ( 'BOWWOW' ) ;
}
