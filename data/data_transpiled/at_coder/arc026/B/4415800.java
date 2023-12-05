static Map < Integer , Integer > primeFactor ( int N ) {
  int i = 2 ;
  Map < Integer , Integer > ret = new HashMap < Integer , Integer > ( ) ;
  int n = N ;
  int mrFlg = 0 ;
  if ( n < 0 ) {
    ret . put ( - 1 , 1 ) ;
    n = - n ;
  }
  if ( n == 0 ) {
    ret . put ( 0 , 1 ) ;
  }
  while ( i * 2 <= n ) {
    int k = 0 ;
    while ( n % i == 0 ) {
      n /= i ;
      k ++ ;
      ret . put ( i , k ) ;
    }
    if ( i == 2 ) {
      i = 3 ;
    }
    else {
      i += 2 ;
    }
    if ( i == 101 && n >= ( 2 * 20 ) ) {
      /* find the prime factor */
      int [ ] pf = primeFactor ( N ) ;
      ret = new int [ pf . length ] ;
      for ( int i = 0 ;
      i < pf . length ;
      i ++ ) {
        int k = 0 ;
        while ( n % i == 0 ) {
          n /= i ;
          k ++ ;
        }
      }
      int y = pow ( a , n ) ;
      while ( y != 1 && y != n - 1 ) {
        y = ( y * y ) % n ;
      }
      if ( y != 1 && n == 2 ) {
        /* print the prime */
        if ( n == 101 ) {
          return i ;
        }
      }
      /* print the prime */
      if ( n == 101 ) {
        return i ;
      }
      i += 2 ;
    }
  }
  /* find the prime factor */
  int [ ] pf = primeFactor ( N ) ;
  ret = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int k = 0 ;
    int t = 1 ;
    while ( k == 1 ) {
      x = f ( x , c ) ;
      y = f ( f ( y , c ) , c ) ;
      d = gcd ( abs ( x - y ) , N ) ;
    }
    if ( d != N ) {
      if ( isPrimeMR ( d ) ) {
        return d ;
      }
      else if ( isPrimeMR ( N / d ) ) {
        return N / d ;
      }
      else {
        semi [ i ] = d ;
      }
    }
  }
  /* print the prime */
  if ( n > 1 ) {
    /* print the prime */
  }
  return ret ;
}
