static final Scanner scanner = new Scanner ( System . in ) {
  @ Override public int next ( ) {
    int C = scanner . nextInt ( ) ;
    for ( int testcase = 0 ;
    testcase < C ;
    testcase ++ ) {
      String [ ] line = scanner . nextLine ( ) . split ( " " ) ;
      long L = Long . parseLong ( line [ 0 ] ) ;
      long P = Long . parseLong ( line [ 1 ] ) ;
      long C = Long . parseLong ( line [ 2 ] ) ;
      int count = 0 ;
      while ( ( L * C * ( 2 * count ) < P ) && ( L * C * ( 2 * count ) < P ) ) {
        count ++ ;
      }
      System . out . println ( "Case #" + ( testcase + 1 ) + ": " + count ) ;
    }
    return count ;
  }
}
