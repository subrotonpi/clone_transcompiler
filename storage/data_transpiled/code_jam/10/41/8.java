static final String solve ( int N , int [ ] [ ] diamond ) {
  final int best1 = N ;
  for ( int i = - N + 1 ;
  i < N ;
  i ++ ) {
    boolean ok = true ;
    for ( int x = 0 ;
    x < N ;
    x ++ ) {
      for ( int y = 0 ;
      y < N ;
      y ++ ) {
        final int x0 = y + i ;
        final int y0 = x - i ;
        if ( x0 >= 0 && x0 < N && y0 >= 0 && y0 < N ) {
          if ( diamond [ x0 ] [ y0 ] != diamond [ x ] [ y ] ) {
            ok = false ;
            break ;
          }
        }
      }
      if ( ! ok ) break ;
    }
    if ( ! ok ) continue ;
    final int par = i % 2 ;
    final int qual = Math . abs ( i ) ;
    if ( best1 > qual ) best1 = qual ;
  }
  int best2 = N ;
  for ( int i = - N + 1 ;
  i < N ;
  i ++ ) {
    boolean ok = true ;
    for ( int x = 0 ;
    x < N ;
    x ++ ) {
      for ( int y = 0 ;
      y < N ;
      y ++ ) {
        final int x0 = N - 1 - y - i ;
        final int y0 = N - 1 - x - i ;
        if ( x0 >= 0 && x0 < N && y0 >= 0 && y0 < N ) {
          if ( diamond [ x0 ] [ y0 ] != diamond [ x ] [ y ] ) {
            ok = false ;
            break ;
          }
        }
      }
      if ( ! ok ) break ;
    }
    if ( ! ok ) continue ;
    final int par = i % 2 ;
    final int qual = Math . abs ( i ) ;
    if ( best2 > qual ) best2 = qual ;
  }
  final int newSize = N + best1 + best2 ;
  return newSize * newSize - N * N ;
}
