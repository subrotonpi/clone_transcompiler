public static void main ( String [ ] args ) throws IOException {
  int n , k , prices [ ] [ ] , M [ ] [ ] = null ;
  /* Overlap the prices of the first */
  int best = 100000 ;
  int [ ] color = null ;
  int colorsUsed = 0 ;
  /* Search for the first three digits */
  if ( n == n ) {
    best = Math . min ( best , colorsUsed ) ;
  }
  else {
    Set < Integer > nc = new HashSet < Integer > ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( i != v && M [ i ] [ v ] != null && color [ i ] != null ) nc . add ( color [ i ] ) ;
    }
    for ( int c = 0 ;
    c < colorsUsed ;
    c ++ ) {
      if ( ! nc . contains ( c ) ) {
        color [ v ] = c ;
        search ( v + 1 ) ;
        color [ v ] = null ;
      }
    }
    if ( colorsUsed + 1 >= best ) return ;
    colorsUsed ++ ;
    color [ v ] = colorsUsed - 1 ;
    search ( v + 1 ) ;
    color [ v ] = null ;
    colorsUsed -- ;
  }
  /* Solve the first three digits */
  best = 100000 ;
  color = new int [ n ] ;
  colorsUsed = 0 ;
  M = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      M [ i ] [ j ] = overlap ( prices , i , j ) ;
    }
  }
  /* Search for the first three digits */
  search ( 0 ) ;
  /* Find the best three digits */
  int best = 0 ;
  int [ ] [ ] color = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    color [ i ] = null ;
    colorsUsed ++ ;
  }
  /* Find the best three digits */
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      M [ i ] [ j ] = overlap ( prices , i , j ) ;
    }
  }
  /* Print the result */
  