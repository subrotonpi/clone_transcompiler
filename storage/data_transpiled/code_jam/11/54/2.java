@ VisibleForTesting static int from ( int T ) {
  int i = Integer . parseInt ( readLine ( ) ) ;
  /* Is the square of the input? */
  int y = ( int ) ( Math . sqrt ( i ) + 0.1 ) ;
  /* Try it until it is the same value */
  if ( i >= poss . length ) {
    return isSquare ( s ) ? s : 0 ;
  }
  else {
    int p = poss [ i ] ;
    int x = tryIt ( s , i + 1 ) ;
    if ( x != 0 ) return x ;
    /* Try it until it is the same value */
    if ( p == p ) {
      return s ;
    }
    else {
      int x = tryIt ( s + p , i + 1 ) ;
      if ( x != 0 ) return x ;
    }
  }
  for ( i = 1 ;
  i <= T ;
  i ++ ) {
    String s = readLine ( ) . trim ( ) ;
    int N = s . length ( ) ;
    poss = new int [ N ] ;
    s = 0 ;
    for ( i = 0 ;
    i < xrange ( N ) ;
    i ++ ) {
      char c = s . charAt ( i ) ;
      int power = N - 1 - i ;
      switch ( c ) {
        case '1' : s += 2 * power ;
        break ;
        case '?' : poss [ i ] = 2 * power ;
        break ;
      }
    }
    int res = tryIt ( s , 0 ) ;
    String output = "" ;
    while ( res > 0 ) {
      output = String . valueOf ( res % 2 ) + output ;
      res /= 2 ;
    }
    System . out . println ( "Case #" + i + ": " + output ) ;
  }
  return s ;
}
