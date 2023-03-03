@ VisibleForTesting static String solve ( String string ) {
  int n , h , * ab = Integer . parseInt ( string ) ;
  int maxA = Math . max ( ab , 0 ) ;
  int cnt = 0 ;
  List < Integer > b = new ArrayList < > ( Arrays . asList ( ab . subList ( 1 , ab . size ( ) ) ) ) ;
  if ( sum ( b ) < h ) {
    cnt = b . size ( ) + ceil ( ( h - sum ( b ) ) / maxA ) ;
  }
  else {
    cnt = ( cumSum ( b ) >= h ) ? b . size ( ) + 1 : cnt ;
  }
  return String . valueOf ( cnt ) ;
}
