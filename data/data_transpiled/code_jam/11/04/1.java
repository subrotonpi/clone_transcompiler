public static int [ ] readInts ( int lines ) {
  if ( lines == 1 ) return ArrayUtil . fromStrings ( readLine ( ) . split ( " " ) ) ;
  return Arrays . stream ( readInts ( ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  /* read input */
  int length = input . nextInt ( ) ;
  int [ ] array = readInts ( ) ;
  /* write array */
  for ( int i = 0 ;
  i < length ;
  i ++ ) {
    array [ i ] = array [ i ] ;
  }
  /* write output */
  int numCases = input . nextInt ( ) ;
  for ( int i = 1 ;
  i <= numCases ;
  i ++ ) {
    int output = input . nextInt ( ) ;
    System . out . println ( "Case #" + i + ":" + output ) ;
  }
  return array ;
}
