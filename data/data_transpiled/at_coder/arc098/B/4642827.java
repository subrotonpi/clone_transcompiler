public static int [ ] solve ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int [ ] A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) A [ i ] = Integer . parseInt ( input ( ) ) ;
  int l = 0 ;
  int r = 0 ;
  int ans = 0 ;
  int X = 0 ;
  int Y = A [ 0 ] ;
  while ( true ) {
    if ( X == Y ) {
      ans += r - l + 1 ;
      if ( r < N - 1 ) {
        r ++ ;
        X ^= A [ r ] ;
        Y += A [ r ] ;
      }
      else break ;
    }
    else {
      X ^= A [ l ] ;
      Y -= A [ l ] ;
      l ++ ;
    }
  }
  System . out . println ( ans ) ;
  return A ;
}
