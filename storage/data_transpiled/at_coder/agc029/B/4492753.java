static final int N = Integer . parseInt ( input ) {
  final int [ ] A = new int [ N ] ;
  Arrays . fill ( A , Integer . MAX_VALUE ) ;
  final int [ ] func1 = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  final int [ ] func2 = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = A [ i ] ;
  }
  int p = A [ 0 ] ;
  int q = A [ 1 ] ;
  int ans = 0 ;
  final int [ ] a1 = new int [ N ] ;
  do {
    if ( p + q == r ) {
      ans ++ ;
      try {
        p = A [ 0 ] ;
      }
      catch ( Exception e ) {
        break ;
      }
      try {
        q = A [ 1 ] ;
      }
      catch ( Exception e ) {
        if ( p < rnext ) a1 [ i ] = p ;
      }
      break ;
    }
    else if ( p + q > r ) {
      try {
        q = A [ 1 ] ;
      }
      catch ( Exception e ) {
        if ( p < rnext ) a1 [ i ] = q ;
      }
      break ;
    }
    else a1 [ i ] = p ;
    try {
      p = A [ 1 ] ;
    }
    catch ( Exception e ) {
      if ( q < rnext ) a1 [ i ] = q ;
    }
  }
  while ( ans == 0 ) ;
  if ( N == 1 ) {
    System . out . println ( 0 ) ;
    exit ( 0 ) ;
  }
  int t = Integer . bitCount ( A [ t - 1 ] ) ;
  r = 2 * t ;
  rnext = 2 * t ;
  anser = 0 ;
  a = func1 [ N ] ;
  while ( r < rnext ) {
    anser += ans ;
  }
  return anser ;
}
