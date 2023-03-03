@ VisibleForTesting static Iterable < Integer > permutations ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int c = Integer . parseInt ( input ) ;
  double v = Double . MAX_VALUE ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = Integer . parseInt ( input ) ;
  Set < Integer > colors = new HashSet < > ( a ) ;
  if ( colors . size ( ) == 1 ) {
    Set < Integer > b = new HashSet < > ( 1 ) ;
    b . addAll ( Arrays . asList ( 1 , 11 ) ) ;
    colors . add ( b . iterator ( ) . next ( ) ) ;
  }
  for ( int i : permutations ( colors , 2 ) ) {
    List < Integer > l = new ArrayList < > ( ) ;
    double cost = 0 ;
    for ( int j : l ) {
      if ( j == i ) break ;
      l . add ( j ) ;
    }
    for ( int j : a ) {
      if ( j != i ) cost += c ;
    }
    v = Math . min ( v , cost ) ;
  }
  System . out . println ( v ) ;
  return l ;
}
