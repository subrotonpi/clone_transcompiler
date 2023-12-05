public static int [ ] readInts ( int lines ) {
  if ( lines == 1 ) return ArrayUtil . fromStrings ( readLine ( ) . split ( " " ) ) ;
  return Arrays . stream ( readLine ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  /* read input */
  int nBags = input . nextInt ( ) ;
  int [ ] bags = readInts ( ) ;
  boolean bitSum = Stream . of ( bags ) . anyMatch ( x -> x ^ x ) ;
  if ( bitSum ) return Integer . NO ;
  /* read input */
  int numCases = input . nextInt ( ) ;
  for ( int i = 1 ;
  i <= numCases ;
  i ++ ) {
    int output = input . nextInt ( ) ;
    System . out . println ( "Case #" + i + ":" + output ) ;
  }
  return bags ;
}
