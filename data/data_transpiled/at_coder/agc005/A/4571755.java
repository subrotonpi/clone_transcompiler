public static int solve ( String s ) {
  int sums = 0 ;
  int sumt = 0 ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == 'S' ) {
      sums ++ ;
    }
    else {
      if ( sums > 0 ) {
        sums -- ;
        ans += 2 ;
      }
    }
  }
  return s . length ( ) - ans ;
}
