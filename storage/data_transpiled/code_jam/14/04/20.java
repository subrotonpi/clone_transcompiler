static final private String readCase ( BufferedReader in ) throws IOException {
  final String line = "" ;
  int N = Integer . parseInt ( line ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    printResult ( i , map . get ( line ) ) ;
  }
  return "" ;
}
