private static Solution solve ( ) {
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    for ( int j = 0 ;
    j < c ;
    j ++ ) {
      if ( m [ i ] [ j ] == '#' ) {
        if ( j + 1 >= c || m [ i ] [ j + 1 ] != '#' ) return Solution . Impossible ;
        else m [ i ] [ j + 1 ] = '\\' ;
        if ( i + 1 >= r || m [ i + 1 ] [ j ] != '#' ) return Solution . Impossible ;
        else m [ i + 1 ] [ j ] = '\\' ;
        if ( m [ i + 1 ] [ j + 1 ] != '#' ) return Solution . Impossible ;
        else m [ i + 1 ] [ j + 1 ] = '/' ;
        m [ i ] [ j ] = '/' ;
      }
    }
    return Solution . Good ;
  }
  int r = scanner . nextInt ( ) ;
  for ( int testCase = 1 ;
  testCase <= r ;
  testCase ++ ) {
    int l = Integer . parseInt ( scanner . nextLine ( ) ) ;
    r = Integer . parseInt ( scanner . nextLine ( ) ) ;
    c = Integer . parseInt ( scanner . nextLine ( ) ) ;
    m = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < r ;
    i ++ ) m . add ( new LinkedList < > ( ) ) ;
    Solution sol = solve ( ) ;
    System . out . println ( "Case #" + testCase + ":" ) ;
    if ( sol == Solution . Good ) {
      for ( int i = 0 ;
      i < r ;
      i ++ ) System . out . println ( m . get ( i ) ) ;
    }
    else System . out . println ( sol ) ;
  }
  return Solution . Good ;
}
