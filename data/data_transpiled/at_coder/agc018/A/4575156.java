public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int x ;
  if ( N == 1 ) {
    x = A [ 0 ] ;
  }
  else {
    int a = A [ 0 ] ;
    for ( int i = 0 ;
    i < N - 1 ;
    i ++ ) {
      int b = A [ i + 1 ] ;
      a = new Integer ( a ) ;
      a = new Integer ( b ) ;
      do {
        if ( b % a == 0 ) break ;
        else {
          a = b % a ;
          b = a ;
        }
      }
      while ( true ) ;
    }
    x = a ;
  }
  if ( K % x == 0 && max ( A ) >= K ) {
    System . out . println ( "POSSIBLE" ) ;
  }
  else {
    System . out . println ( "IMPOSSIBLE" ) ;
  }
  return x ;
}
