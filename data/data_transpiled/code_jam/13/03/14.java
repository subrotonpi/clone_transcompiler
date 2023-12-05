public static int sqrt ( int x , boolean ge ) {
  if ( x == 1 ) return 1 ;
  int sx = x >> 1 ;
  int step = sx >> 1 ;
  while ( step > 0 ) {
    if ( sx * sx >= x ) sx = sx - step ;
    else sx = sx + step ;
    step = step >> 1 ;
  }
  if ( ge ) {
    while ( ! sx * sx < x ) sx = sx - 1 ;
    while ( ! sx * sx >= x ) sx = sx + 1 ;
  }
  else {
    while ( ! sx * sx > x ) sx = sx + 1 ;
    while ( ! sx * sx <= x ) sx = sx - 1 ;
  }
  return sx ;
}
