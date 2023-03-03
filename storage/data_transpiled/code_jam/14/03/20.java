@ GwtIncompatible ( "java.io.BufferedReader" ) static int [ ] [ ] readCase ( BufferedReader in ) throws IOException {
  return map ( Integer . parseInt ( in . readLine ( ) ) , '*' ) ;
  /* Print result */
  System . out . println ( "Case #" + ( i + 1 ) + ":" ) ;
  System . out . println ( ) ;
  /* Solve the number of rows in the board */
  int space = r * c - m ;
  char [ ] [ ] board = new char [ r ] [ ] ;
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    board [ i ] = '*' ;
  }
  /* Check for the next row */
  for ( int i = 0 ;
  i < board . length ;
  i ++ ) {
    board [ i ] [ 0 ] = 'c' ;
    /* Check for the next row */
  }
  if ( space == 1 ) {
    board [ 0 ] [ 0 ] = 'c' ;
    /* Return the row */
  }
  if ( r == 1 ) {
    /* Return the row */
    char [ ] row = new char [ r ] ;
    for ( int i = 0 ;
    i < r ;
    i ++ ) {
      board [ i ] [ 1 ] = '*' ;
      /* Return the row */
    }
  }
  /* Check for the next row */
  if ( space < 4 || space == 5 || space == 7 ) {
    /* Return the row */
  }
  /* Return the row */
  if ( space < 4 ) {
    /* Return the row */
    if ( space % 2 == 0 && m / 2 < c - 1 ) {
      /* Return the row */
      board [ r - 1 ] [ 0 ] = '*' ;
      board [ r ] [ 1 ] = '*' ;
      x ++ ;
      space -= 2 ;
    }
  }
  /* Return the row */
  int x = 0 ;
  while ( space >= 2 && x < r ) {
    board [ x ] [ 0 ] = '.' ;
    board [ x ] [ 1 ] = '.' ;
    x ++ ;
    space -= 2 ;
  }
  if ( space == 0 ) {
    /* Return the row */
  }
  /* Return the row */
  return board