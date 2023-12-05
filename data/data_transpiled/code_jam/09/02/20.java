static private void readMap ( Scanner in ) throws IOException {
  int height = in . nextInt ( ) ;
  int width = in . nextInt ( ) ;
  int [ ] [ ] altitudes = new int [ height ] [ width ] ;
  for ( int i = 0 ;
  i < height ;
  i ++ ) {
    int [ ] row = new int [ width ] ;
    for ( int j = 0 ;
    j < width ;
    j ++ ) {
      row [ j ] = in . nextInt ( ) ;
    }
    altitudes [ i ] = row ;
  }
  /* print the altitudes */
  int height = in . nextInt ( ) ;
  for ( int i = 0 ;
  i < height ;
  i ++ ) {
    int [ ] [ ] altitudes = readMap ( in ) ;
    int numCases = in . nextInt ( ) ;
    for ( int j = 0 ;
    j < width ;
    j ++ ) {
      altitudes [ i ] [ j ] = in . nextInt ( ) ;
    }
  }
  /* main case */
  if ( in . hasNext ( ) ) {
    in . next ( ) ;
  }
  else {
    in . next ( ) ;
  }
  PrintWriter out = new PrintWriter ( System . out ) ;
  int numCases = in . nextInt ( ) ;
  for ( int i = 0 ;
  i < height ;
  i ++ ) {
    int [ ] [ ] neighbors = new int [ width ] [ 2 ] ;
    if ( i > 0 ) {
      neighbors [ 0 ] = new int [ ] {
        altitudes [ i - 1 ] [ j ] , i - 1 , j }
        ;
      }
      if ( j > 0 ) {
        neighbors [ 1 ] = new int [ ] {
          altitudes [ i ] [ j - 1 ] , i , j - 1 }
          ;
        }
        if ( i + 1 < height ) {
          neighbors [ 0 ] = new int [ ] {
            altitudes [ i ] [ j ] , i + 1 , j }
            ;
          }
          if ( j + 1 < width ) {
            neighbors [ 0 ] = new int [ ] {
              altitudes [ i ] [ j + 1 ] , i , j + 1 }
              ;
            }
            Arrays . sort ( neighbors ) ;
            if ( neighbors [ 0 ] [ 0 ] < altitudes [ i ] [ j ] ) {
              altitudes [ i ] [ j ] = ( altitudes [ i ] [ j ] [ 0 ] ) ;
            }
            else {
              altitudes [ i ] [ j ] = ( altitudes [ i