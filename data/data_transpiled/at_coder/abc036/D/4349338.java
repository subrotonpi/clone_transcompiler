@ VisibleForTesting static int [ ] [ ] solve ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] G = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    G [ a - 1 ] [ b ] = b - 1 ;
    G [ b - 1 ] [ a ] = a - 1 ;
  }
  Queue < Integer > q = new LinkedList < > ( ) ;
  int [ ] P = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    P [ i ] = - 2 ;
  }
  P [ 0 ] = - 1 ;
  while ( ( i = q . size ( ) ) != 0 ) {
    int r = q . poll ( ) ;
    for ( int p : G [ r ] ) {
      if ( P [ p ] == - 2 ) {
        P [ p ] = r ;
        q . add ( p ) ;
      }
    }
  }
  int [ ] [ ] H = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    H [ P [ i ] ] = i ;
  }
  int mod = 10 * 9 + 7 ;
  int [ ] W = new int [ N ] ;
  int [ ] B = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    W [ i ] = 0 ;
  }
  /* White */
  if ( W [ i ] != 0 ) {
    return W [ i ] ;
  }
  if ( H [ i ] . length == 0 ) {
    W [ i ] = 1 ;
    return 1 ;
  }
  int res = 1 ;
  for ( int j : H [ i ] ) {
    res = res * ( black ( j ) + white ( j ) ) ;
    res %= mod ;
  }
  W [ i ] = res ;
  return W ;
}
