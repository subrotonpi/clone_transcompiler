public static int s ( ) {
  int i = 0 ;
  if ( ( s / 100 ) == 1 ) {
    i = i + 1 ;
    s = s - 100 ;
  }
  if ( ( s / 10 ) == 1 ) {
    i = i + 1 ;
  }
  return i ;
}
