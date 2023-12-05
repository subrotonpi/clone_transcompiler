@ org . junit . experimental . theories . DataPoint public static int [ ] [ ] divide ( final int [ ] [ ] in ) {
  final HashMap < Integer , Integer > mem = new HashMap < > ( ) ;
  final int [ ] [ ] result = new int [ in . length ] [ ] ;
  for ( int i = 0 ;
  i < in . length ;
  i ++ ) {
    if ( ! mem . containsKey ( in [ i ] [ 0 ] ) ) {
      mem . put ( in [ i ] [ 0 ] , in [ i ] [ 0 ] ) ;
    }
    result [ i ] = mem . get ( in [ i ] [ 0 ] ) ;
  }
  final String TASK = "B" ;
  @ SuppressWarnings ( "unchecked" ) final java . io . PrintWriter out = new java . io . PrintWriter ( new java . io . File ( TASK + ".in" ) ) ;
  out . println ( "Calculation..." ) ;
  try {
    in [ 0 ] [ 0 ] = new java . io . BufferedReader ( new java . io . FileReader ( TASK + ".in" ) ) . readLine ( ) ;
    out . println ( "Calculation..." ) ;
  }
  catch ( final java . io . IOException e ) {
    e . printStackTrace ( ) ;
  }
  return result ;
}
