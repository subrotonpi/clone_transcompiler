static final String getTestName ( ) throws IOException {
  /* First check if we have a flights */
  int n = 0 ;
  int m = 0 ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    flights [ i ] = Integer . parseInt ( fileLines [ index + i ] . toString ( ) ) ;
  }
  /* First check if we have a flights */
  int answer = solve ( zipCodes , flights ) ;
  System . out . println ( "Case #" + ( caseNum + 1 ) + ": " + answer ) ;
  /* Find the first cities in the path */
  StringBuilder sb = new StringBuilder ( ) ;
  sb . append ( " " ) ;
  sb . append ( "citiesSorted: " ) ;
  for ( int i = 0 ;
  i < citiesSorted . length ;
  i ++ ) {
    sb . append ( " " ) ;
    sb . append ( citiesSorted [ i ] ) ;
  }
  /* Now check if we have a flights */
  if ( "_main" . equals ( getClass ( ) . getName ( ) ) ) {
    /* This is a flights */
    sb . append ( " " ) ;
  }
  /* Now check if we have a flights */
  for ( int i = 0 ;
  i < citiesSorted . length ;
  i ++ ) {
    sb . append ( " " ) ;
  }
  /* Now check if we have a flights */
  int [ ] path = sb . toString ( ) . toCharArray ( ) ;
  int [ ] pathFromStart = sb . toString ( ) . toCharArray ( ) ;
  if ( path . length == citiesSorted . length ) {
    /* The citiesSorted array */
    pathFromStart = sb . toString ( ) . toCharArray ( ) ;
  }
  /* Now check if we have a flights */
  for ( int i = 0 ;
  i < citiesSorted . length ;
  i ++ ) {
    /* The citiesSorted array */
    pathFromStart [ i ] = sb . toString ( ) . toCharArray ( ) ;
  }
  /* Now check if we have a flights */
  return "" ;
}
