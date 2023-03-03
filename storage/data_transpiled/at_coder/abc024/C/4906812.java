public static int N = Integer . parseInt ( input ) {
  int [ ] [ ] lr = new int [ D ] [ K ] ;
  for ( int i = 0 ;
  i < D ;
  i ++ ) lr [ i ] = new int [ N ] ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    lr [ i ] = new int [ N ] ;
  }
  st = new StringTokenizer ( input . nextLine ( ) ) ;
  int [ ] time = new int [ K ] ;
  /* This will be the same as the linear search. */
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x1 = i ;
    int y1 = i ;
    int x2 = i ;
    int y2 = i ;
    if ( x2 < x1 && x1 <= y2 ) {
      x3 = x2 ;
    }
    else {
      x3 = x1 ;
    }
    if ( y1 < y2 && y1 >= x2 ) {
      y3 = y2 ;
    }
    else {
      y3 = y1 ;
    }
  }
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    int [ ] d = new int [ 2 ] ;
    d [ 0 ] = st [ i ] . nextToken ( ) ;
    int j = 0 ;
    while ( ! ( d [ 0 ] <= st [ i ] . nextToken ( ) && d [ 1 ] <= st [ i ] . nextToken ( ) ) ) {
      d [ 0 ] = d [ 1 ] = i ;
      d [ 1 ] = i ;
      j ++ ;
    }
    time [ i ] = j ;
  }
  for ( int t = 0 ;
  t < time . length ;
  t ++ ) {
    System . out . println ( time [ t ] ) ;
  }
  return time [ 0 ] ;
}
