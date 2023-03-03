@ VisibleForTesting static void from ( LinkedHashMap < Integer , Integer > input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  boolean [ ] reached = new boolean [ K ] ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) reached [ i ] = true ;
  int [ ] dist = new int [ K ] ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) dist [ i ] = 0 ;
  Queue < Integer > q = new LinkedList < Integer > ( ) ;
  q . add ( 1 ) ;
  while ( ( q . size ( ) > 0 ) ) {
    int r = q . poll ( ) ;
    int v = ( r + 1 ) % K ;
    reached [ v ] = true ;
    if ( ( reached [ v ] == 0 ) && ( dist [ v ] == 1 ) ) break ;
  }
  System . out . println ( dist [ 0 ] + 1 ) ;
}
