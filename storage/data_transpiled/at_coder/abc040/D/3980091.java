public static int [ ] [ ] parse ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  int [ ] rank = new int [ N + 1 ] ;
  int [ ] par = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    par [ i ] = i ;
  }
  int [ ] size = new int [ N + 1 ] ;
  /* find the first element */
  int x = Integer . parseInt ( input ) ;
  int y = Integer . parseInt ( input ) ;
  if ( x == y ) {
    return null ;
  }
  if ( rank [ x ] < rank [ y ] ) {
    par [ x ] = y ;
    size [ y ] += size [ x ] ;
  }
  else {
    par [ y ] = x ;
    size [ x ] += size [ y ] ;
    if ( rank [ x ] == rank [ y ] ) {
      rank [ x ] ++ ;
    }
  }
  /* same */
  int x = Integer . parseInt ( input ) ;
  int y = Integer . parseInt ( input ) ;
  if ( x == y ) {
    return null ;
  }
  if ( rank [ x ] < rank [ y ] ) {
    par [ x ] = y ;
    size [ y ] += size [ x ] ;
  }
  else {
    par [ y ] = x ;
    size [ x ] += size [ y ] ;
    if ( rank [ x ] == rank [ y ] ) {
      rank [ x ] ++ ;
    }
  }
  /* get the size */
  int [ ] [ ] road = new int [ M ] [ ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    int c = Integer . parseInt ( input ) ;
    road [ i ] = new int [ ] {
      a , b , c }
      ;
    }
    int [ ] [ ] Q = new int [ q ] ;
    int q = Integer . parseInt ( input ) ;
    for ( int i = 0 ;
    i < q ;
    i ++ ) {
      int v = Integer . parseInt ( input ) ;
      int w = Integer . parseInt ( input ) ;
      Q [ i ] [ 0 ] = v ;
      Q [ i ] [ 1 ] = w ;
    }
    Arrays . sort ( Q ) ;
    int [ ] [ ] ans = new int [ q ] [ ] ;
    Arrays . sort ( road