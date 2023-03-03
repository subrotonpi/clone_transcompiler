public static int summary ( @ Nonnegative int N , @ Nonnegative int K , @ Nonnegative int [ ] A ) {
  int s = Arrays . stream ( A ) . sum ( ) ;
  int ans = s ;
  for ( int offset = 0 ;
  offset < N - K ;
  offset ++ ) {
    s = s - A [ offset ] + A [ offset + K ] ;
    ans += s ;
  }
  return ans ;
}
