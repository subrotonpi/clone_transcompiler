static int getInt ( ) {
  return Integer . parseInt ( input . nextLine ( ) ) ;
  /* IntList */
  IntList intList = new IntList ( ) ;
  for ( String s : input . nextLine ( ) . split ( " " ) ) {
    /* print out */
    if ( debug ) {
      System . out . println ( s ) ;
    }
  }
  /* probC */
  int N = intList . size ( ) ;
  int T = intList . size ( ) ;
  /* print out */
  return T ;
}
