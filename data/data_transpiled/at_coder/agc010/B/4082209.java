public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) A [ i ] = Integer . parseInt ( input ) ;
  String P = "possible" ;
  int Nsum = N * ( N + 1 ) / 2 ;
  if ( sum ( A ) % Nsum == 0 ) {
    int K = sum ( A ) / Nsum ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) A [ i ] -= K * ( i + 1 ) ;
    int A0 = A [ 0 ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) A [ i ] -= A0 ;
    int [ ] B = new int [ N ] ;
    for ( int i = 1 ;
    i < N ;
    i ++ ) {
      if ( ( A [ i ] - A [ i - 1 ] ) % N != 0 ) P = "impossible" ;
      else B [ i ] = ( A [ i - 1 ] - A [ i ] ) / N ;
    }
    B [ 0 ] = K - sum ( B ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) if ( B [ i ] < 0 ) P = "impossible" ;
    for ( int i = 1 ;
    i < N ;
    i ++ ) A0 -= B [ i ] * ( N - i ) ;
    if ( A0 != 0 ) P = "impossible" ;
  }
  else P = "impossible" ;
  if ( P . equals ( "impossible" ) ) System . out . println ( "NO" ) ;
  else System . out . println ( "YES" ) ;
}
