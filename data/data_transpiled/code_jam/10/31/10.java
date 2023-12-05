@ VisibleForTesting static long readInLong ( String inpath ) throws IOException {
  String outpath = "A-large.in" ;
  File fin = new File ( inpath ) ;
  File fout = new File ( outpath ) ;
  /* Intranet wires */
  int count = 0 ;
  for ( int i = 0 ;
  i < wires . length ;
  i ++ ) {
    int [ ] x = wires [ i ] ;
    for ( int j = i + 1 ;
    j < wires . length ;
    j ++ ) {
      int t = ( x [ j ] - y [ j ] ) * ( x [ j ] - y [ j ] ) ;
      assert t != 0 ;
      if ( t < 0 ) count ++ ;
    }
  }
  long timestart = System . currentTimeMillis ( ) ;
  int T = Integer . parseInt ( fin . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < T ;
  i ++ ) {
    long result = in . nextLong ( ) ;
    long result = in . nextLong ( ) ;
    result += result ;
  }
  return timestart ;
}
