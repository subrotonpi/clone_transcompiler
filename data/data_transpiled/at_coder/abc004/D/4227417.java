public static int [ ] countup ( String input , int R , int G , int B ) {
  int [ ] ans = new int [ 900 ] ;
  for ( int i = 0 ;
  i < 900 ;
  i ++ ) ans [ i ] = 0 ;
  /* Count up */
  int Left = 0 ;
  int Right = 900 - offset ;
  if ( Right < 0 ) {
    Left = - 1 * Left ;
    Right = - 1 * Right ;
    return ( Left * ( Left + 1 ) - Right * ( Right - 1 ) ) >> 1 ;
  }
  else if ( Left <= 0 && 0 <= Right ) {
    Left = - 1 * Left ;
    return ( Left * ( Left + 1 ) + Right * ( Right + 1 ) ) >> 1 ;
  }
  else {
    return ( Right * ( Right + 1 ) - Left * ( Left - 1 ) ) >> 1 ;
  }
}
