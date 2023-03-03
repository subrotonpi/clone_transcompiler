public static int [ ] [ ] readIntList ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int a = Integer . parseInt ( input ( ) ) ;
  int b = Integer . parseInt ( input ( ) ) ;
  int M = Integer . parseInt ( input ( ) ) ;
  a -- ;
  b -- ;
  float INF = Float . POSITIVE_INFINITY ;
  float [ ] [ ] mat = new float [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    mat [ i ] [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int x = Integer . parseInt ( input ( ) ) ;
    int y = Integer . parseInt ( input ( ) ) ;
    mat [ x - 1 ] [ y - 1 ] = 1 ;
    mat [ y - 1 ] [ x - 1 ] = 1 ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int x = 0 ;
    x < N ;
    x ++ ) {
      for ( int y = 0 ;
      y < N ;
      y ++ ) {
        mat [ x ] [ y ] = Math . min ( mat [ x ] [ y ] , mat [ x ] [ i ] + mat [ i ] [ y ] ) ;
      }
    }
  }
  int mod = 10 * 9 + 7 ;
  int [ ] [ ] num = new int [ N ] [ N ] ;
  num [ a ] = 1 ;
  for ( int r = 0 ;
  r < N ;
  r ++ ) {
    for ( int x = 0 ;
    x < N ;
    x ++ ) {
      if ( mat [ a ] [ x ] != r ) {
        continue ;
        for ( int y = 0 ;
        y < N ;
        y ++ ) {
          if ( mat [ a ] [ y ] == r + 1 && mat [ x ] [ y ] == 1 ) {
            num [ y ] += num [ x ] ;
            num [ y ] %= mod ;
          }
        }
      }
    }
  }
  System . out . println ( num [ b ] ) ;
  return num ;
}
