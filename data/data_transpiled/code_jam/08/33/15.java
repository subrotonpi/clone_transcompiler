static private long [ ] genseq ( int n , int m , long X , long Y , long Z , long [ ] A ) {
  final long [ ] s = new long [ n ] ;
  for ( int i = 0 ;
  i < n ;
  ++ i ) {
    s [ i ] = A [ i % m ] ;
    A [ i % m ] = ( X * A [ i % m ] + Y * ( i + 1 ) ) % Z ;
  }
  return s ;
}
