@ VisibleForTesting static Iterable < List < Integer >> combinations ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> inputs = new ArrayList < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    inputs . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  int count = 0 ;
  for ( List < Integer > item : inputs ) {
    int [ ] A = item . get ( 0 ) , B = item . get ( 1 ) , C = item . get ( 2 ) ;
    if ( A [ 0 ] == B [ 0 ] == C [ 0 ] ) {
      continue ;
    }
    else if ( A [ 1 ] == B [ 1 ] == C [ 1 ] ) {
      continue ;
    }
    int S = Math . abs ( ( B [ 0 ] - A [ 0 ] ) * ( C [ 1 ] - A [ 1 ] ) - ( B [ 1 ] - A [ 1 ] ) * ( C [ 0 ] - A [ 0 ] ) ) ;
    if ( S != 0 && S % 2 == 0 ) {
      count ++ ;
    }
  }
  System . out . println ( count ) ;
  return inputs ;
}
