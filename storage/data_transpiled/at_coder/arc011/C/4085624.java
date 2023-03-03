@ Function public static List < Integer > inpl ( ) {
  return Lists . newArrayList ( ) . stream ( ) . map ( input -> Integer . parseInt ( input . nextLine ( ) ) ) . collect ( Collectors . toList ( ) ) ;
  Integer first = input . nextInt ( ) ;
  Integer last = input . nextInt ( ) ;
  Integer N = Integer . parseInt ( input . nextLine ( ) ) ;
  Integer [ ] S = new Integer [ N + 1 ] ;
  S [ 0 ] = first ;
  S [ 1 ] = last ;
  int L = S [ 0 ] . intValue ( ) ;
  Integer [ ] candidate = new Integer [ L + 2 ] ;
  for ( int s = 1 ;
  s <= N ;
  s ++ ) candidate [ s ] = s ;
  {
    path ( p , q ) -> {
      return sum ( sp != sq ? 1 : 0 ) <= 1 ;
    }
    ;
  }
  List < Integer > B = new ArrayList < > ( N + 2 ) ;
  List < Integer > C = new ArrayList < > ( N + 2 ) ;
  C . add ( 10 * 4 ) ;
  C . add ( 0 ) ;
  Queue < Integer > Q = new ArrayDeque < > ( 0 ) ;
  while ( Q . size ( ) > 0 ) {
    int p = Q . poll ( ) ;
    List < Integer > nextCandidate = new ArrayList < > ( ) ;
    for ( int q : candidate ) {
      if ( ! path ( p , q ) ) {
        nextCandidate . add ( q ) ;
        continue ;
      }
      B . set ( q , p ) ;
      C . set ( q , C . get ( p ) + 1 ) ;
      Q . add ( q ) ;
      if ( q == N + 1 ) {
        Q . clear ( ) ;
        break ;
      }
    }
    candidate = nextCandidate ;
  }
  if ( B . get ( B . size ( ) - 1 ) != - 1 ) {
    List < Integer > ans = new ArrayList < > ( ) ;
    int i = - 1 ;
    while ( i > 0 ) {
      ans . add ( S . get ( i ) ) ;
      i = B . get ( i ) ;
    }
    ans . add ( S . get ( 0 ) ) ;
    System . out . println ( ans . size ( ) - 2 ) ;
    System . out . print ( ( String ) ans . toArray ( ) , 0 , ans . size ( ) ) ;
  }
  else {
    System . out . println ( - 1 ) ;
  }
  return ans ;
}
