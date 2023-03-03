static final String readCase ( BufferedReader in ) throws IOException {
  int r = readSpaceLine ( in , Integer . MAX_VALUE ) ;
  int c = in . readInt ( ) ;
  String [ ] [ ] grid = new String [ r ] [ c ] ;
  for ( int i = 0 ;
  i < r ;
  ++ i ) {
    String [ ] line = readLine ( in , String . class ) ;
    List < String > list = new LinkedList < String > ( ) ;
    list . add ( line ) ;
    grid [ i ] = list . toArray ( new String [ list . size ( ) ] ) ;
  }
  return r + c + " " + grid [ 0 ] [ 0 ] ;
}
