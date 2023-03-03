private static PrintWriter inpReader ( Reader inpReader ) throws IOException {
  PrintWriter out = new PrintWriter ( new BufferedWriter ( new FileWriter ( "C-small.in" ) ) ) ;
  /* solve the line */
  Arrays . sort ( line . split ( ) ) ;
  int cardNum = line . indexOf ( ' ' ) ;
  int [ ] indices = new int [ cardNum ] ;
  Arrays . sort ( indices ) ;
  StringBuilder sb = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < cardNum ;
  i ++ ) {
    sb . append ( 0 ) ;
  }
  int [ ] positions = new int [ cardNum ] ;
  for ( int i = 0 ;
  i < cardNum ;
  i ++ ) {
    positions [ i ] = indices [ i ] ;
  }
  return out ;
}
