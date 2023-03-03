static final Iterable < List < String >> enum ( String [ ] a ) {
  final List < List < String >> result = new ArrayList < List < String >> ( ) ;
  if ( a . length == 1 ) {
    result . add ( a ) ;
    return result ;
  }
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    for ( String x : enum ( a , 0 , i + a . length , a . length ) ) {
      result . add ( Arrays . asList ( a ) . stream ( ) . map ( x -> x ) . collect ( Collectors . toList ( ) ) ) ;
    }
  }
  return result ;
}
