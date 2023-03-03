public static int [ ] construct ( int N ) {
  for ( int n = 40 ;
  n >= 0 ;
  n -- ) {
    if ( N >= ( 1 << n ) - 1 ) {
      break ;
    }
  }
  int [ ] p = new int [ n + 1 ] ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    p [ i ] = i ;
  }
  N -= ( 1 << n ) - 1 ;
  for ( int i = n - 1 ;
  i >= 0 ;
  i -- ) {
    if ( N < 1 << i ) {
      continue ;
    }
    n ++ ;
    p = Arrays . copyOf ( p , i ) ;
  }
  return p ;
}
