private static String sol ( String s ) {
  StringBuilder r = new StringBuilder ( s . charAt ( 0 ) ) ;
  for ( int i = 1 ;
  i < s . length ( ) ;
  i ++ ) {
    char c = s . charAt ( i ) ;
    if ( c < r . charAt ( 0 ) ) r . append ( c ) ;
    else r . insert ( 0 , c ) ;
  }
  return r . toString ( ) ;
}
