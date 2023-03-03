@ VisibleForTesting static void input ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] an = Lists . newArrayList ( ) . stream ( ) . mapToInt ( Integer :: valueOf ) . toArray ( ) ;
  int [ ] ca = new int [ N ] ;
  ca [ 0 ] = an [ 0 ] % M ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( i > 0 ) ca [ i ] = ( ca [ i - 1 ] + an [ i ] ) % M ;
    if ( ca [ i ] % M == 0 ) ans ++ ;
  }
  Collection < Entry < Integer , Integer >> c = Lists . newArrayList ( ) ;
  for ( Entry < Integer , Integer > ci : c ) {
    if ( ci . getValue ( ) >= 2 ) ans += factorial ( ci . getValue ( ) ) / ( factorial ( 2 ) * factorial ( ci . getValue ( ) - 2 ) ) ;
  }
  System . out . println ( ans ) ;
}
