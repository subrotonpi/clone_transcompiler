public static int [ ] countup ( String input ) {
  int R , G , B ;
  int [ ] ans = new int [ 1000 ] ;
  for ( int i = 0 ;
  i < 1000 ;
  i ++ ) ans [ i ] = 0 ;
  /* Count up */
  int Left = 0 ;
  int Right = 0 ;
  int offset = 0 ;
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
  for ( int g = - 500 ;
  g <= 500 ;
  g ++ ) {
    int G_Left = g ;
    int G_Right = g + G - 1 ;
    int R_Right ;
    if ( ( ( ( R - 1 ) >> 1 ) - 100 ) < G_Left ) R_Right = ( ( R - 1 ) >> 1 ) - 100 ;
    else R_Right = G_Left - 1 ;
    int R_Left = R_Right - R + 1 ;
    int B_Right ;
    if ( ( 100 - ( ( B - 1 ) >> 1 ) ) > G_Right ) B_Left = 100 - ( ( B - 1 ) >> 1 ) ;
    else B_Left = G_Right + 1 ;
    int B_Right = B_Left + B - 1 ;
    ans [ g + 500 ] += countup ( G_Left , G_Right , 0 ) ;
    ans [ g + 500 ] += countup ( R_Left , R_Right , - 100 ) ;
    ans [ g + 500 ] += countup ( B_Left , B_Right , 100 ) ;
  }
  System . out . println ( min ( ans ) ) ;
}
