public static int input ( ) {
  int ans = 0 ;
  int [ ] white = new int [ S . length ] ;
  int w = 0 ;
  for ( int i = 0 ;
  i < S . length ;
  i ++ ) {
    if ( S . charAt ( i ) == 'W' ) {
      white [ w ] += i ;
      w ++ ;
    }
  }
  for ( int i = 0 ;
  i < S . length ;
  i ++ ) {
    if ( white [ i ] > 0 ) ans += white [ i ] - i ;
  }
  return ans ;
}
