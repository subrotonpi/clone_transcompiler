static String fract ( int K , int C , int S ) {
  if ( S * C < K ) return "IMPOSSIBLE" ;
  int [ ] l = new int [ C ] ;
  for ( int c = 0 ;
  c < K ;
  c += C ) {
    int t = 0 ;
    for ( int i = 0 ;
    i < C ;
    i ++ ) t = t * K + Math . min ( c + i , K - 1 ) ;
    l [ c ] = t ;
  }
  return String . join ( " " , l ) ;
}
