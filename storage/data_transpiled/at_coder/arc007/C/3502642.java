public static void input ( ) {
  S = input ( ) ;
  int [ ] a = new int [ S . length ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    a [ i ] = Integer . valueOf ( 2 * i ) ;
  }
  int goal = 2 * S . length - 1 ;
  for ( int i = 0 ;
  i < S . length - 1 ;
  i ++ ) {
    a [ i ] = a [ i ] % 2 * ( 2 * ( S . length - 1 ) ) + ( a [ i ] >> 1 ) ;
  }
  int [ ] ans = new int [ 10 ] ;
  /* rec n */
  if ( n == goal ) {
    ans [ 0 ] = Math . min ( ans [ 0 ] , count ) ;
    return ;
  }
  for ( int i = count ;
  i < a . length ;
  i ++ ) {
    if ( n | a [ i ] != n ) {
      /* rec n */
      ans [ i ] = Math . min ( ans [ i ] , count + 1 ) ;
    }
  }
}
