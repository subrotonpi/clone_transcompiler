public static String S = String . valueOf ( input ) ;
ArrayList < String > list = new ArrayList < String > ( ) ;
for ( int i = 0 ;
i < S . length ( ) ;
i ++ ) {
  if ( ( S . charAt ( i ) >= 48 ) && ( S . charAt ( i ) <= 57 ) ) {
    list . add ( S . charAt ( i ) ) ;
  }
}
if ( list . size ( ) == 0 ) {
  return "0" ;
}
