public static int findMin ( int N , int C ) {
  int [ ] [ ] D = new int [ C ] [ N ] ;
  for ( int y = 0 ;
  y < C ;
  y ++ ) {
    D [ y ] [ x ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] [ ] C_map = new int [ N ] [ N ] ;
  for ( int y = 0 ;
  y < N ;
  y ++ ) {
    for ( int x = 0 ;
    x < N ;
    x ++ ) {
      C_map [ y ] [ x ] -- ;
    }
  }
  int [ ] [ ] colLines = new int [ C ] [ 3 ] ;
  for ( int y = 0 ;
  y < N ;
  y ++ ) {
    for ( int x = 0 ;
    x < N ;
    x ++ ) {
      int idx = ( x + y ) % 3 ;
      colLines [ idx ] [ C_map [ y ] [ x ] ] ++ ;
    }
  }
  /* Calculate cost */
  int cost = 0 ;
  for ( int col = 0 ;
  col < C ;
  col ++ ) {
    int count = 0 ;
    cost += D [ col ] [ targetColor ] * count ;
  }
  int [ ] [ ] costs = new int [ C ] [ C ] ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    for ( int c = 0 ;
    c <= C ;
    c ++ ) {
      costs [ i ] [ c ] = new int [ ] {
        calcCost ( colLines [ i ] , c ) , c }
        ;
      }
      costs [ i ] [ 0 ] = cost ;
    }
    /* Find min */
    if ( i1 >= 3 || i2 >= 3 || i3 >= 3 ) {
      return 100000000000000 ;
    }
    int [ ] [ ] line1 = costs [ 0 ] ;
    int [ ] [ ] line2 = costs [ 1 ] ;
    int [ ] [ ] line3 = costs [ 2 ] ;
    if ( i1 >= line1 . length || i2 >= line2 . length || i3 >= line3 . length ) {
      return 1000000000000 ;
    }
    int c1 = line1 [ i1 ] [ 1 ] ;
    int c2 = line2 [ i2 ] [ 1 ] ;
    int c3 = line3 [ i3 ] [ 1 ] ;
    if ( c1 == c2 && c1 == c3 ) {
      return Math . min ( findMin ( i1 + 1 , i2 , i3 ) , findMin ( i1 , i2 + 1 , i3 ) ) ;
    }
    if ( c1 == c2 ) {
      return Math . min