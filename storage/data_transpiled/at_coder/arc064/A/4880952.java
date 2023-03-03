public static int N ( int x ) {
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = i ;
  }
  int total = 0 ;
  for ( int i = 1 ;
  i < A . length ;
  i ++ ) {
    int diff = A [ i - 1 ] + A [ i ] - x ;
    if ( diff <= 0 ) continue ;
    if ( diff <= A [ i ] ) A [ i ] -= diff ;
    else {
      A [ i - 1 ] -= diff - A [ i ] ;
      A [ i ] = 0 ;
    }
    total += diff ;
  }
  return total ;
}
