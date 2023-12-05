public static boolean can ( String line , int idx ) {
  return line . substring ( idx + 1 ) . indexOf ( "1" ) == - 1 ;
  /* main program */
  int T = Integer . parseInt ( readLine ( ) ) ;
  for ( int t = 1 ;
  t <= T ;
  t ++ ) {
    System . out . println ( "Case #" + t + ":" ) ;
    int N = Integer . parseInt ( readLine ( ) ) ;
    int [ ] A = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) A [ i ] = readLine ( ) ;
    int [ ] P = new int [ N ] ;
    int [ ] U = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      for ( int j = 0 ;
      j < N ;
      j ++ ) {
        if ( U [ j ] == 0 && can ( A [ i ] , j ) ) {
          P [ i ] = j ;
          U [ j ] = 1 ;
          break ;
        }
      }
    }
    int result = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      for ( int j = i + 1 ;
      j < N ;
      j ++ ) {
        result += P [ i ] > P [ j ] ? P [ i ] : P [ j ] ;
      }
    }
    System . out . println ( result ) ;
  }
  if ( getClass ( ) . equals ( Main . class ) ) {
    Main . main ( ) ;
  }
  return false ;
}
