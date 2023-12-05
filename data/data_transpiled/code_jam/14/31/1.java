public static int T = Integer . parseInt ( Scanner in ) {
  int i , j ;
  int T = in . nextInt ( ) ;
  /* Compute the gcd of the two integers */
  int r = in . nextInt ( ) ;
  if ( r == 0 ) {
    return b ;
  }
  else {
    return gcd ( b , r ) ;
  }
  /* Compute the p2 of the two integers */
  if ( i == 0 ) {
    return 1 ;
  }
  else {
    return 2 * p2 ( i - 1 ) ;
  }
  for ( i = 0 ;
  i < T ;
  i ++ ) {
    String [ ] inpArr = in . nextLine ( ) . trim ( ) . split ( "/" ) ;
    int P = Integer . parseInt ( inpArr [ 0 ] ) ;
    int Q = Integer . parseInt ( inpArr [ 1 ] ) ;
    int g = gcd ( P , Q ) ;
    P /= g ;
    Q /= g ;
    if ( ( P * p2 ( 40 ) ) % Q == 0 ) {
      int gen = 0 ;
      while ( P < Q ) {
        gen ++ ;
        P *= 2 ;
      }
      System . out . println ( "Case #" + ( t + 1 ) + ": " + gen ) ;
    }
    else {
      System . out . println ( "Case #" + ( t + 1 ) + ": impossible" ) ;
    }
  }
  return T ;
}
