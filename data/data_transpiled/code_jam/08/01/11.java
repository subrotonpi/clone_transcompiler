static int solve ( int [ ] S , int [ ] Q ) {
  final Set < Integer > a = new HashSet < > ( Arrays . asList ( S ) ) ;
  int c = 0 ;
  final int se = S [ 0 ] ;
  for ( int q : Q ) {
    if ( a . contains ( q ) ) {
      a . remove ( q ) ;
      if ( a . size ( ) == 0 ) {
        c ++ ;
        a . clear ( ) ;
        a . remove ( q ) ;
      }
    }
    print >> System . err . println ( q + " " + a . size ( ) + " " + c ) ;
  }
  for ( int testCase = 0 ;
  testCase < input . length ;
  testCase ++ ) {
    S = new int [ input . length ] ;
    for ( int i = 0 ;
    i < S . length ;
    i ++ ) {
      S [ i ] = StdIn . readInt ( ) ;
    }
    Q = new int [ input . length ] ;
    for ( int i = 0 ;
    i < Q . length ;
    i ++ ) {
      Q [ i ] = StdIn . readInt ( ) ;
    }
    System . out . println ( "Case #" + ( testCase + 1 ) + ": " + solve ( S , Q ) ) ;
  }
  return c ;
}
