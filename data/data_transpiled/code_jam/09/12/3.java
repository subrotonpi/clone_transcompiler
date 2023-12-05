static int go ( int N , int M , int [ ] [ ] R ) {
  int [ ] P = new int [ N ] ;
  IntStream C = new IntStream ( ) ;
  IntStream H = new IntStream ( ) ;
  IntStream . range ( 0 , 2 * N - 1 ) . parallel ( ) . forEach ( i -> {
    int c = Integer . parseInt ( R [ i ] [ 0 ] ) ;
    for ( int j = 0 ;
    j < M ;
    j ++ ) {
      int s = Integer . parseInt ( R [ i ] [ j ] ) ;
      int w = Integer . parseInt ( R [ i ] [ j ] ) ;
      int t = Integer . parseInt ( R [ i ] [ j ] ) ;
      H . add ( t , s , w , ( t % ( s + w ) ) ) ;
    }
  }
  ) ;
  while ( P . hasNext ( ) ) {
    int t = Integer . parseInt ( P [ 0 ] [ 0 ] ) ;
    int n = Integer . parseInt ( R [ 0 ] [ 1 ] ) ;
    int m = Integer . parseInt ( R [ 0 ] [ 2 ] ) ;
    H . remove ( ) ;
    if ( n == 0 && m == 2 * M - 1 ) return t ;
    if ( n < 0 ) continue ;
    if ( m < 0 ) continue ;
    if ( n >= 2 * N ) continue ;
    if ( m >= 2 * M ) continue ;
    if ( C . mapToInt ( new IntStream ( ) ) . min ( ) . contains ( t ) ) continue ;
    {
      int k0 = ( t - t0 ) / ( s + w ) ;
      int c0 = t0 + k0 * ( s + w ) ;
      return c0 ;
    }
    int s = R [ n / 2 ] [ m / 2 ] ;
    int w = R [ m / 2 ] [ n / 2 ] ;
    int t0 = k0 + s ;
    if ( n % 2 == 1 ) {
      int k0 = getcycle ( t , t0 , s , w ) ;
      int k1 = k0 + s ;
      if ( k1 < t + 1 ) k0 += s + w ;
      push ( P , new IntStream ( ) ) ;
      k0 += k1 ;
      if ( k1 < t + 1 ) k0 += s + w ;
      push ( P , new IntStream ( ) ) ;
      k1 = k0 + w ;
      if ( k1 < t + 1 ) k1 += s + w ;
      push ( P , new IntStream ( ) ) ;
    }
    return - 1 ;
  }
  return