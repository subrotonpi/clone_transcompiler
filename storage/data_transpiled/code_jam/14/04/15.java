public static String war ( String n , String k ) throws IOException {
  Arrays . sort ( n . split ( "\\s+" ) ) ;
  Arrays . sort ( k . split ( "\\s+" ) ) ;
  int points = 0 ;
  n = new ArrayList < Double > ( Arrays . asList ( n . split ( "\\s+" ) ) ) ;
  for ( Double nblock : n ) {
    if ( nblock > max ( k ) ) {
      points ++ ;
      k . remove ( min ( k ) ) ;
    }
    else {
      k . remove ( min ( Arrays . asList ( k ) ) ) ;
    }
  }
  return String . valueOf ( points ) ;
}
