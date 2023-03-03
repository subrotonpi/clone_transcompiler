static int compute ( int N , int K , int [ ] x ) {
  final int N = N ;
  int K = K ;
  int [ ] data ;
  int result ;
  int minDist = 0 ;
  int s0 = 0 ;
  int [ ] v = new int [ N ] ;
  for ( int i = 0 ;
  i < Range . N ;
  i ++ ) {
    diffs [ i ] = x [ i ] - x [ i - 1 ] ;
  }
  minDist = N ;
  s0 = 0 ;
  v [ 0 ] = 0 ;
  for ( int i = 0 ;
  i < Range . N ;
  i ++ ) {
    int [ ] d = diffs [ i ] ;
    int [ ] z = new int [ N ] ;
    z [ 0 ] = 0 ;
    for ( int j = 0 ;
    j < Range . N ;
    j ++ ) z [ j ] = z [ j ] + d [ j ] ;
    s0 -= min ( z ) ;
    v [ i ] = max ( z ) - min ( z ) ;
  }
  m = max ( v ) ;
  s1 = s0 + v . length * m - Arrays . binarySearch ( v , 0 , N , K ) ;
  if ( s1 - s0 >= K ) return m ;
  s1 = s1 % K ;
  s0 = s0 % K ;
  int q = x [ 0 ] % K ;
  if ( s0 <= q && q <= s1 ) return m ;
  if ( s1 < s0 && ( q >= s0 || q <= s1 ) ) return m ;
  return m + 1 ;
}
