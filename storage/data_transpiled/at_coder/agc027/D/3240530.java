public static int [ ] [ ] sieve ( int N ) {
  if ( N == 2 ) {
    System . out . println ( 4 + " " + 7 ) ;
    System . out . println ( 23 + " " + 10 ) ;
    exit ( ) ;
  }
  int [ ] [ ] a = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] [ 0 ] = i ;
  }
  /* sieve n */
  int [ ] prime = new int [ N + 1 ] ;
  boolean [ ] isPrime = new boolean [ N + 1 ] ;
  isPrime [ 0 ] = false ;
  isPrime [ 1 ] = false ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    if ( isPrime [ i ] ) {
      prime [ i ] = i ;
      for ( int j = 2 * i ;
      j <= n ;
      j += i ) {
        isPrime [ j ] = false ;
      }
    }
  }
  /* sieve n */
  int [ ] P = sieve ( 8000 ) ;
  /* p1 */
  int p1 = P [ ( k / 2 ) + 1 ] ;
  /* p2 */
  if ( k >= 0 ) {
    /* p1 */
    if ( k < N ) {
      /* p2 */
      if ( k >= N ) {
        /* p1 */
        if ( k < N ) {
          /* p2 */
          if ( k < N ) {
            /* p1 */
            if ( k < N ) {
              /* p2 */
              if ( k < N ) {
                /* p1 */
                if ( k < N ) {
                  a [ i ] [ j ] = p1 ( i + j ) * p2 ( i - j ) ;
                }
                else {
                  a [ i ] [ j ] = p1 ( i + j + 1 ) * p1 ( i + j - 1 ) * p2 ( i - j + 1 ) * p2 ( i - j - 1 ) + 1 ;
                }
              }
            }
          }
        }
      }
    }
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      System . out . println ( Arrays . toString ( a [ i ] ) ) ;
    }
  }
  return a ;
}
