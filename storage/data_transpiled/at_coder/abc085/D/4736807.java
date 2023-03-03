@ VisibleForTesting static String solve ( String string ) {
  int n , h , * ab = Integer . parseInt ( string ) ;
  int maxA = Math . max ( ab , 0 ) ;
  int cnt = 0 ;
  List < Integer > b = new ArrayList < > ( Arrays . asList ( ab . subList ( 1 , ab . size ( ) ) ) ) ;
  if ( Integer . parseInt ( b . get ( 0 ) ) < h ) {
    cnt = b . size ( ) + ceil ( ( h - Integer . parseInt ( b . get ( 0 ) ) ) / maxA ) ;
  }
  else {
    for ( Integer _b : b ) {
      cnt ++ ;
      h -= _b ;
      if ( h <= 0 ) break ;
    }
  }
  return String . valueOf ( cnt ) ;
}
