@ Sys public static int compute ( List < Integer > numbers ) {
  if ( numbers . size ( ) == 1 ) {
    return 1 ;
  }
  int size = numbers . size ( ) ;
  int base = Math . max ( 2 , new HashSet < Integer > ( size ) ) ;
  List < Integer > values = assignValues ( numbers , 1 ) ;
  int power = 0 ;
  int accum = 0 ;
  Collections . reverse ( values ) ;
  for ( int v : values ) {
    accum += v * ( base * power ) ;
    power ++ ;
  }
  return accum ;
}
private List < Integer > assignValues ( List < Integer > numbers , int next ) {
  if ( numbers . size ( ) == 0 ) {
    return Collections . emptyList ( ) ;
  }
  if ( ( numbers . get ( 0 ) instanceof String ) ) {
    return Arrays . asList ( numbers . get ( 0 ) ) . stream ( ) . map ( x -> x == c ? 1 : x ) . collect ( Collectors . toList ( ) ) ;
  }
  int c = numbers . get ( 0 ) ;
  int size = numbers . size ( ) ;
  for ( int i = 0 ;
  i < size ;
  i ++ ) {
    size += numbers . get ( i ) == c ? 1 : numbers . get ( i ) ;
  }
  int result ;
  if ( next == 1 ) {
    next = 0 ;
  }
  else if ( next == 0 ) {
    next = 2 ;
  }
  else {
    next ++ ;
  }
  return Arrays . asList ( numbers . get ( 0 ) ) . stream ( ) . mapToInt ( Integer :: intValue ) . sum ( ) ;
}
