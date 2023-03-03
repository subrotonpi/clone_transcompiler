public static void input ( Scanner in ) {
  int N = in . nextInt ( ) ;
  int a ;
  if ( in . next ( ) == '0' ) {
    int cnt = 1 ;
    while ( cnt < N && in . next ( ) == '0' ) ++ cnt ;
    in . next ( ) ;
    a = 10 * cnt ;
  }
  else {
    int cnt = 1 ;
    while ( cnt < N && in . next ( ) == '0' ) ++ cnt ;
    a = Integer . parseInt ( in . next ( ) . substring ( 0 , cnt ) ) ;
    in . next ( ) ;
  }
  int L = in . nextInt ( ) ;
  int d = 1 ;
  if ( in . next ( ) != ' ' ) {
    d = in . nextInt ( ) - a ;
    int b = in . nextInt ( ) ;
    int p = 1 ;
    while ( p < L && ( b <= a || in . next ( ) == '0' ) ) {
      b = b * 10 + in . nextInt ( ) ;
      p ++ ;
    }
    if ( p == L ) {
      int numl = 0 ;
      int numr = b ;
      while ( numr <= a ) {
        numl *= 10 ;
        numr = numr * 10 + 9 ;
      }
      d = Math . max ( numl - a , 1 ) ;
    }
    for ( int i = p ;
    i < L ;
    i ++ ) {
      if ( in . next ( ) == ' ' ) {
        b = b * 10 + in . nextInt ( ) ;
        continue ;
      }
      int d0 = b - a ;
      int nxt = a + d0 + d0 ;
      int numl = 0 ;
      int j = in . nextInt ( ) ;
      while ( j < L || 0 < numr && in . next ( ) < nxt ) {
        if ( L <= j ) {
          numl = 10 * numl ;
          numr = 10 * numr + 9 ;
        }
        else {
          numl = 10 * numl + in . nextInt ( ) ;
          numr = 10 * numr + in . nextInt ( ) ;
        }
        if ( numl <= nxt && nxt <= numr && ( L <= j + 1 || in . next ( ) != '0' ) ) {
          numl = numr = 0 ;
          nxt += d0 ;
        }
        ++ j ;
      }
      if ( numr == 0 ) {
        d = d0 ;
        break ;
      }
      b = b * 10 + in . nextInt ( ) ;
    }
  }
  System . out . println ( a + " " + d ) ;
}
