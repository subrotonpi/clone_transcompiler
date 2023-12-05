public static int solve ( int armin , List < Integer > sizes ) {
  int cost = 0 ;
  int minCost = sizes . size ( ) ;
  while ( sizes . size ( ) > 0 ) {
    while ( sizes . size ( ) > 0 && sizes . get ( 0 ) < armin ) {
      armin += sizes . get ( 0 ) ;
      sizes . remove ( 0 ) ;
    }
    minCost = Math . min ( minCost , cost + sizes . size ( ) ) ;
    if ( sizes . size ( ) > 0 ) {
      if ( armin == 1 ) {
        break ;
      }
      while ( sizes . get ( 0 ) >= armin ) {
        armin = 2 * armin - 1 ;
        cost ++ ;
      }
    }
    minCost = Math . min ( minCost , cost + sizes . size ( ) ) ;
  }
  return minCost ;
  Scanner scanner = new Scanner ( new File ( "A-large.in" ) ) ;
  int T = scanner . nextInt ( ) ;
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    final int armin = scanner . nextInt ( ) ;
    final int num = scanner . nextInt ( ) ;
    final List < Integer > sizes = map ( scanner . nextLine ( ) ) ;
    assert num == sizes . size ( ) ;
    Collections . sort ( sizes ) ;
    System . out . println ( "Case #" + testCase + ": " + solve ( armin , sizes ) ) ;
  }
  scanner . close ( ) ;
  return minCost ;
}
