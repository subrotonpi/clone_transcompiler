public static int N ( String input ) {
  int X = Integer . parseInt ( input ) ;
  int [ ] x = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    x [ i ] = Integer . parseInt ( input ) ;
  }
  x [ 0 ] = X ;
  Arrays . sort ( x ) ;
  /* if (x < y) { x = y; } else { y = x; } */
  int now = x [ 1 ] - x [ 0 ] ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    int distance = x [ i + 1 ] - x [ i ] ;
    now = gcd ( now , distance ) ;
    if ( now == 1 ) {
      break ;
    }
  }
  System . out . println ( now ) ;
  return 0 ;
}
