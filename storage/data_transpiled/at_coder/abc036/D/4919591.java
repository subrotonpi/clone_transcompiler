public static int draw ( int N , @ Nonnull int [ ] edges ) {
  final int MOD = 10 * 9 + 7 ;
  int [ ] memo_f = new int [ N ] , memo_g = new int [ N ] ;
  int [ ] [ ] graph = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) graph [ i ] [ 0 ] = i ;
  for ( int u = 0 ;
  u < edges . length ;
  u ++ ) graph [ u ] [ 1 ] = edges [ u ] - 1 ;
  graph [ u ] [ 0 ] = i ;
  for ( int v = 0 ;
  v < edges . length ;
  v ++ ) graph [ u ] [ v ] = i - 1 ;
  {
    if ( memo_f [ v ] != 0 ) return memo_f [ v ] ;
    memo_f [ v ] = 1 ;
    for ( int child : graph [ v ] ) {
      if ( parent == child ) continue ;
      memo_f [ v ] = ( memo_f [ v ] * g ( v , child ) ) % MOD ;
    }
    memo_f [ v ] = ( memo_f [ v ] + g ( parent , v ) ) % MOD ;
  }
  {
    if ( memo_g [ v ] != 0 ) return memo_g [ v ] ;
    memo_g [ v ] = 1 ;
    for ( int child : graph [ v ] ) {
      if ( parent == child ) continue ;
      memo_g [ v ] = ( memo_g [ v ] * f ( v , child ) ) % MOD ;
    }
  }
  return memo_g [ v ] ;
}
