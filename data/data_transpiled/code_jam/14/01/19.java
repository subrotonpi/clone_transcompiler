public static void inputFile ( File inputFile ) throws IOException {
  BufferedReader reader = new BufferedReader ( new FileReader ( inputFile ) ) ;
  String line = reader . readLine ( ) ;
  reader . close ( ) ;
  PrintWriter outputFile = new PrintWriter ( new BufferedWriter ( new FileWriter ( "A-small-attempt0.out" ) ) ) ;
  int numTests = Integer . parseInt ( line ) ;
  int currLine = 1 ;
  for ( int i = 1 ;
  i <= numTests ;
  i ++ ) {
    String firstRow = line . substring ( Integer . parseInt ( line ) + currLine ) ;
    currLine += 5 ;
    String secondRow = line . substring ( Integer . parseInt ( line ) + currLine ) ;
    Integer [ ] firstNums = map . toArray ( ) ;
    Integer [ ] secondNums = map . toArray ( ) ;
    Arrays . sort ( firstNums ) ;
  }
}
