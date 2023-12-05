public static int [ ] convert ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int T = Integer . parseInt ( input ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input ) ;
  }
  int [ ] B = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    B [ i ] = 0 ;
  }
  B [ 0 ] = A [ 0 ] ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    B [ i ] = Math . min ( B [ i - 1 ] , A [ i ] ) ;
  }
  int M = Math . max ( C , M ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( C [ i ] == M ) ans ++ ;
  }
  System . out . println ( ans ) ;
  return A ;
}
