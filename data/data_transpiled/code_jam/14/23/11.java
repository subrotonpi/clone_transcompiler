private static List < List < Integer >> getPerms ( List < Integer > s ) {
  if ( s . size ( ) == 1 ) {
    return Arrays . asList ( Collections . singletonList ( s . get ( 0 ) ) ) ;
  }
  List < List < Integer >> result = new ArrayList < > ( ) ;
  for ( int i : s ) {
    for ( List < Integer > j : getPerms ( s . stream ( ) . filter ( i -> i >= 0 ) . collect ( Collectors . toList ( ) ) ) ) {
      result . add ( Arrays . asList ( i ) . stream ( ) . map ( i -> i + j ) . collect ( Collectors . toList ( ) ) ) ;
    }
  }
  return result ;
}
