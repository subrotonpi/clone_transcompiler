public static long solve ( ) {
  long ans = 1000000 ;
  for ( int i = 0 ;
  i < 2 ;
  i ++ ) {
    if ( H [ i ] % 3 == 0 ) {
      return 0 ;
    }
    ans = Math . min ( ans , H [ 1 - i ] ) ;
    int H1 = H [ i ] / 3 ;
    long S_max = ( H1 + 1 ) * H [ 1 - i ] ;
    long S_min = ( H [ i ] - H1 - 1 ) * ( H [ 1 - i ] / 2 ) ;
    ans = Math . min ( ans , S_max - S_min ) ;
    S_min = H1 * H [ 1 - i ] ;
    S_max = ( H [ i ] - H1 ) * ( ( H [ 1 - i ] + 1 ) / 2 ) ;
    ans = Math . min ( ans , S_max - S_min ) ;
  }
  return ans ;
}
