public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] t = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) t [ i ] = i + 1 ;
  int [ ] v = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) v [ i ] = 0 ;
  for ( int i = N ;
  i > 0 ;
  i -- ) v [ i ] = Math . min ( v [ i ] , v [ i + 1 ] + t [ i ] ) ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) v [ i ] = Math . min ( v [ i ] , v [ i - 1 ] + t [ i ] ) ;
  float ans = 0 ;
  float vF = 0 ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    float vL = Math . min ( vF + t [ i ] , v [ i + 1 ] , v [ i ] ) ;
    if ( 2 * v [ i ] - vF - vL <= t [ i ] ) {
      ans += ( v [ i ] + vF ) * ( v [ i ] - vF ) / 2 + v [ i ] * ( t [ i ] - 2 * v [ i ] + vF + vL ) + ( v [ i ] + vL ) * ( v [ i ] - vL ) / 2 ;
    }
    else {
      float t_1 = ( t [ i ] + vL - vF ) / 2 ;
      float t_2 = t [ i ] - t_1 ;
      ans += ( 2 * vF + t_1 ) * t_1 / 2 + ( 2 * vL + t_2 ) * t_2 / 2 ;
    }
    vF = vL ;
  }
  System . out . println ( "{:.10f}" ) ;
}
