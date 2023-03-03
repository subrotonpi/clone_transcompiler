@ Parameters ( "b-sample.in" ) public static String input ( ) throws IOException {
  File f = new File ( "B-small-attempt1.in" ) ;
  File f = new File ( "B-large.in" ) ;
  List < String > in = CollectionUtils . toList ( Collections . singletonList ( String . valueOf ( f ) ) . subList ( 1 , in . size ( ) ) ) ;
  /* solve the number of B */
  StringBuilder mat = new StringBuilder ( ) ;
  for ( int j = 0 ;
  j < B ;
  j ++ ) {
    mat . append ( mat . append ( "01" . charAt ( j > i ) ) ) ;
  }
  for ( int i = 1 ;
  i < B ;
  i ++ ) {
    mat . append ( mat . append ( "01" . charAt ( i ) ) ) ;
  }
  int ma = 2 * ( B - 2 ) ;
  if ( M > ma ) {
    return "IMPOSSIBLE" ;
  }
  else if ( M == ma ) {
    return "POSSIBLE\n0" + "1" . substring ( 1 , B - 1 ) + "\n" + mat . toString ( ) ;
  }
  else {
    return "POSSIBLE\n" + Integer . toString ( M ) . replaceAll ( " " , "0" ) . replace ( " " , "0" ) + "0\n" + mat . toString ( ) ;
  }
}
