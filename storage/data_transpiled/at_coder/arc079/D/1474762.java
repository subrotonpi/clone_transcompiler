@ VisibleForTesting static int [ ] [ ] getMatchingValues ( String input ) {
  final int N = Integer . parseInt ( input ) ;
  final int [ ] P = Lists . newArrayList ( Integer . parseInt ( input ) - 1 ) ;
  final int [ ] D = new int [ N ] ;
  for ( int p : P ) {
    D [ p ] ++ ;
  }
  final NavigableMap < Integer , Integer > childL = new TreeMap < > ( ) ;
  final List < Integer > S = new ArrayList < > ( ) ;
  for ( int p : P ) {
    S . add ( p ) ;
  }
  final List < Integer > L = new ArrayList < > ( N ) ;
  final List < Integer > L = new ArrayList < > ( N ) ;
  for ( int p : N ) {
    L . add ( p ) ;
  }
  final int [ ] [ ] S = new int [ N ] [ ] ;
  for ( int p : N ) {
    S . add ( p ) ;
  }
  final List < Integer > L = new ArrayList < > ( N ) ;
  while ( S . size ( ) > 0 ) {
    final int n = S . remove ( 0 ) ;
    final int [ ] q = childL . get ( n ) ;
    System . arraycopy ( q , 0 , q , 0 , n ) ;
    Hheapheapify ( q ) ;
    int i = 0 ;
    while ( q . length > 0 ) {
      final int t = Hheapify ( q ) ;
      if ( i < t ) break ;
      else i += ( i == t ? 1 : 0 ) ;
    }
    L . set ( n , i ) ;
    final int m = P [ n ] ;
    childL . get ( m ) . add ( i ) ;
    D [ m ] -- ;
    if ( D [ m ] == 0 ) {
      S . add ( m ) ;
    }
  }
  try {
    final int start = D . indexOf ( 1 ) ;
    final int s1 = D . indexOf ( 1 ) ;
    final int s2 = D . indexOf ( 1 ) ;
    final List < int [ ] > G = new ArrayList < > ( ) ;
    int n = P [ start ] ;
    while ( n != start ) {
      G . add ( helper ( n ) ) ;
      n = P [ n ] ;
    }
  }
  catch ( final NoSuchElementException e ) {
    System . out . println ( "POSSIBLE" ) ;
    exit ( ) ;
  }
  return L . toArray ( new int [ 0 ] [ ] ) ;
}
