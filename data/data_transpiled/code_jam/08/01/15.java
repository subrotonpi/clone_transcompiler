static final int [ ] engines ( int s , int q ) throws IOException {
  int [ ] [ ] res = new int [ engines . length ] [ queries . length ] ;
  System . arraycopy ( engines , 0 , res [ 0 ] , 0 , engines . length ) ;
  System . arraycopy ( queries , 0 , res [ 0 ] , 0 , queries . length ) ;
  /* Find the best */
  if ( ( q < 0 ) || ( q > engines . length ) ) {
    return ( 0 ) ;
  }
  if ( ( queries [ q ] == engines [ s ] ) ) {
    memo [ ( s ) ] = ( 2 * 30 ) ;
    return ( 2 * 30 ) ;
  }
  if ( ( ( s ) != engines [ s ] ) && ( ( q > queries . length ) ) ) {
    return ( res [ ( s ) ] ) ;
  }
  int themin = 2 * 30 ;
  for ( int i = 0 ;
  i < engines . length ;
  i ++ ) {
    int cost ;
    if ( ( s != engines [ i ] ) && ( q > engines [ i ] ) ) {
      cost = best ( i , q - 1 ) . ordinal ( ) + 1 ;
    }
    else {
      cost = best ( i , q - 1 ) . ordinal ( ) ;
    }
    if ( ( cost < themin ) && ( cost > themin ) ) {
      res [ ( s ) ] = ( cost < themin ) ? cost : best ( i , q - 1 ) . ordinal ( ) + 1 ;
      themin = cost ;
    }
  }
  memo [ ( s ) ] = res ;
  /* Find the best match */
  themin = 2 * 30 ;
  for ( int i = 0 ;
  i < queries . length ;
  i ++ ) {
    int cost = best ( i , queries . length - 1 ) . ordinal ( ) ;
    if ( ( cost < themin ) && ( cost > themin ) ) {
      themin = cost ;
      idx = i ;
    }
  }
  BufferedReader reader = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  int nCases = reader . readLine ( ) ;
  for ( int j = 0 ;
  j < nCases ;
  j ++ ) {
    memo [ ( s ) ] = null ;
    nEngines = reader . readLine ( ) ;
    engines = new int [ nEngines ] ;
    for ( int i = 0 ;
    i < nEngines ;
    i ++ ) {
      engines [ i ] = reader . readLine ( ) . trim ( ) ;
    }
  }
  