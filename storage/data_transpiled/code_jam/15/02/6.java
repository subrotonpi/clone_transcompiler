static int compute ( int D , int [ ] P ) {
  final int best = max ( P ) ;
  for ( int n : xrange ( 1 , 1001 ) ) {
    int c = Integer . parseInt ( Integer . toString ( P [ n ] ) ) ;
    if ( c + n < best ) {
      best = c + n ;
    }
    if ( c == 0 ) {
      break ;
    }
  }
  return best ;
}
