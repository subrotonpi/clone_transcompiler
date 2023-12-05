@ VisibleForTesting static int [ ] getPairs ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > As = new ArrayList < > ( Arrays . asList ( input . nextLine ( ) . split ( " " ) ) ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    As . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  Integer prev = null ;
  List < Integer > pair = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < As . size ( ) ;
  i ++ ) {
    Integer A = As . get ( i ) ;
    if ( prev . equals ( A ) ) {
      prev = null ;
      pair . add ( A ) ;
      if ( pair . size ( ) == 2 ) {
        break ;
      }
    }
    else {
      prev = A ;
    }
  }
  if ( pair . size ( ) == 2 ) {
    System . out . println ( pair . get ( 0 ) * pair . get ( 1 ) ) ;
  }
  else {
    System . out . println ( 0 ) ;
  }
  return pair . toArray ( new Integer [ 0 ] ) ;
}
