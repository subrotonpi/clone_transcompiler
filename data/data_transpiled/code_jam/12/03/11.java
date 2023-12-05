public static int gen ( int a ) {
  int tmp = a ;
  int mul = 1 ;
  do {
    tmp /= 10 ;
  }
  while ( tmp == 0 ) ;
  mul *= 10 ;
  int aa = a ;
  do {
    int last = a % 10 ;
    a /= 10 ;
    a += last * mul ;
    if ( aa == a ) break ;
  }
  while ( aa == a ) ;
  /* main loop */
  int t = getLineAs ( Integer . class ) . intValue ( ) ;
  for ( int i = 1 ;
  i <= t ;
  i ++ ) {
    final int a = getLineAs ( Integer . class ) . intValue ( ) ;
    final int b = getLineAs ( Integer . class ) . intValue ( ) ;
    int ans = 0 ;
    for ( int n = a ;
    n <= b ;
    n ++ ) {
      for ( int m = gen ( n ) ;
      m > n && m <= b ;
      m ++ ) {
        ans ++ ;
      }
    }
    System . out . println ( "Case #" + i + ": " + ans ) ;
  }
  /* stdin */
  synchronized ( stdin ) {
    /* LineAs */
    LineAs tp = new LineAs ( Integer . class ) ;
    /* array */
    for ( int n = 0 ;
    n < n ;
    n ++ ) {
      /* array */
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        /* array */
        for ( int j = 0 ;
        j < init ;
        j ++ ) {
          /* array */
          for ( int k = 0 ;
          k < init ;
          k ++ ) {
            /* array */
            for ( int j = 0 ;
            j < init ;
            j ++ ) {
              /* array */
              for ( int k = 0 ;
              k < init ;
              k ++ ) {
                /* array */
                for ( int k = 0 ;
                k < init ;
                k ++ ) {
                  /* array */
                  for ( int j = 0 ;
                  k < init ;
                  k ++ ) {
                    /* array */
                    for ( int k = 0 ;
                    k < init ;
                    k ++ ) {
                      /* array */
                      for ( int k = 0 ;
                      k < init ;
                      k ++ ) {
                        /* array */
                        for ( int k = 0 ;
                        k < init ;
                        k ++ ) {
                          /* array */
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}
