public static int [ ] ints ( ) {
  return map . get ( in . nextLine ( ) ) . ints ;
  int numCases = ints . get ( ) , infty = 9001 ;
  for ( int caseNum = xrange . get ( ) ;
  caseNum <= numCases ;
  caseNum ++ ) {
    int n = Integer . parseInt ( in . nextLine ( ) ) ;
    List < Pair > pairs = new ArrayList < > ( ) ;
    for ( int i : xrange . get ( n ) ) {
      int a = ints . get ( ) ;
      int b = ints . get ( ) ;
      pairs . add ( new Pair ( b , a ) ) ;
    }
    Collections . sort ( pairs , Collections . reverseOrder ( ) ) ;
    int level = 0 ;
    int games = 0 ;
    while ( pairs . size ( ) > 0 ) {
      if ( pairs . get ( pairs . size ( ) - 1 ) . left <= level ) {
        Pair pair = pairs . remove ( pairs . size ( ) - 1 ) ;
        games ++ ;
        if ( pair . second == infty ) level ++ ;
        else level += 2 ;
      }
      else {
        boolean finished = true ;
        for ( Pair pair : pairs ) {
          if ( pair . second <= level ) {
            pair . second = infty ;
            games ++ ;
            level ++ ;
            finished = false ;
            break ;
          }
        }
        if ( finished ) break ;
      }
    }
    System . out . println ( "Case #" + caseNum + ": " + ( level == 2 * n ? games : "Too Bad" ) ) ;
  }
  return new int [ numCases ] ;
}
