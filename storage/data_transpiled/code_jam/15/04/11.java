static final String solve ( int x , int r , int c ) throws IOException {
  final Scanner in = new Scanner ( new File ( "D-large.in" ) ) ;
  final PrintWriter out = new PrintWriter ( new File ( "D-large" ) ) ;
  final String [ ] lines = in . nextLine ( ) . split ( "\n" ) ;
  for ( int i = 1 ;
  i < lines . length ;
  i ++ ) {
    final int [ ] l = Arrays . stream ( StringUtils . split ( lines [ i ] ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
    out . println ( l [ 0 ] + ": " + solve ( l [ 1 ] , l [ 2 ] ) ) ;
  }
  out . close ( ) ;
  in . close ( ) ;
}
