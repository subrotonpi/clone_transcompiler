@ VisibleForTesting static int [ ] [ ] createG0 ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  Set < Integer > [ ] G0 = new Set [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    G0 [ i ] = new Set < Integer > ( ) ;
    for ( int j = 0 ;
    j < M ;
    j ++ ) {
      a = Integer . parseInt ( input . nextLine ( ) ) ;
      b = Integer . parseInt ( input . nextLine ( ) ) ;
      G0 [ a - 1 ] . add ( b - 1 ) ;
      G0 [ b - 1 ] . add ( a - 1 ) ;
    }
  }
  Set < Integer > [ ] G = new Set [ N ] ;
  for ( int g : G0 ) {
    G [ g ] = A - g ;
  }
  int b = 1 ;
  int [ ] c = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( c [ i ] != - 1 ) continue ;
    int p = 0 ;
    int s = 0 ;
    Deque < Integer > que = new ArrayDeque < Integer > ( ) ;
    c [ i ] = 0 ;
    while ( que . hasRemaining ( ) ) {
      int v = que . pop ( ) ;
      s ++ ;
      if ( c [ v ] == 0 ) p ++ ;
      for ( int w : G [ v ] ) {
        if ( c [ w ] == - 1 ) {
          c [ w ] = c [ v ] ^ 1 ;
          que . push ( w ) ;
        }
        else if ( c [ w ] == c [ v ] ) {
          System . out . println ( - 1 ) ;
          exit ( 0 ) ;
        }
      }
    }
    b = ( b << p ) | ( b << ( s - p ) ) ;
  }
  int ans = 10 * 18 ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    if ( ( b >> i ) & 1 ) ans = Math . min ( ans , i * ( i - 1 ) / 2 + ( N - i ) * ( N - i - 1 ) / 2 ) ;
  }
  System . out . println ( ans ) ;
  return G ;
}
