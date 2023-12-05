public static int N = Integer . parseInt ( input ) {
  int depth = Integer . numberOfTrailingZeros ( N ) - 2 ;
  /* func */
  int x = 1 ;
  for ( int d = 0 ;
  d < 80 ;
  d ++ ) {
    if ( d % 2 == depth % 2 ) x = 2 * x ;
    else if ( d % 2 != depth % 2 ) x = 2 * x + 1 ;
    if ( x > N ) break ;
  }
  return d ;
}
