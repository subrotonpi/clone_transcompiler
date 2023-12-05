, n = Integer . numberOfTrailingZeros , * a = Integer . numberOfTrailingZeros , * * kwargs ) {
  int [ ] stack = new int [ n ] ;
  int p = 1 ;
  int c = 1 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    if ( a [ i + 1 ] - a [ i ] <= 0 ) {
      p = a [ i + 1 ] - a [ i ] ;
      stack [ i ] = c * ( c + 1 ) / 2 ;
    }
  }
  return stack ;
}
