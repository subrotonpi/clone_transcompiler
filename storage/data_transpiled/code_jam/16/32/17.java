static private String solveTest ( Scanner in ) throws IOException {
  int B = Integer . parseInt ( in . nextLine ( ) ) ;
  int M = Integer . parseInt ( in . nextLine ( ) ) ;
  if ( M > 2 * ( B - 2 ) ) return "IMPOSSIBLE" ;
  String first ;
  if ( M == 2 * ( B - 2 ) ) {
    first = "0" + "1" ;
  }
  else {
    first = "0" + Integer . toBinaryString ( M ) . substring ( 2 ) . toUpperCase ( ) + "0" ;
  }
  System . out . println ( Integer . toBinaryString ( M ) + " " + Integer . toBinaryString ( M ) . substring ( 2 ) ) ;
  StringBuilder sb = new StringBuilder ( ) ;
  for ( int i = 2 ;
  i <= B ;
  i ++ ) {
    sb . append ( "0" ) ;
  }
  sb . append ( "1" ) ;
  sb . append ( " " ) ;
  sb . append ( first ) ;
  sb . append ( "\n" ) ;
  return "POSSIBLE\n" + sb . toString ( ) ;
}
