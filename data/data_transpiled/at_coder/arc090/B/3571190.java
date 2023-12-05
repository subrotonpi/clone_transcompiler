public static int [ ] inpl ( ) {
  return Arrays . stream ( input . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  /* Find the first value in the list */
  if ( par [ 0 ] == 0 ) {
    return par [ 0 ] ;
  }
  else {
    par [ 0 ] = find ( par [ 0 ] ) ;
    dist [ 0 ] = dist [ 0 ] + dist [ par [ 0 ] ] ;
    return par [ 0 ] ;
  }
  int N = inpl ( ) ;
  int M = inpl ( ) ;
  int [ ] par = new int [ N + 1 ] ;
  int [ ] dist = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    par [ i ] = 0 ;
    dist [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int l = inpl ( ) ;
    int r = inpl ( ) ;
    int d = inpl ( ) ;
    int fl = par [ i ] ;
    int fr = par [ i ] ;
    if ( fl != fr ) {
      par [ fr ] = fl ;
      dist [ fr ] = d + dist [ l ] - dist [ r ] ;
    }
    else if ( d + dist [ l ] - dist [ r ] != 0 ) {
      System . out . println ( "No" ) ;
      break ;
    }
  }
  else {
    System . out . println ( "Yes" ) ;
  }
  return par ;
}
