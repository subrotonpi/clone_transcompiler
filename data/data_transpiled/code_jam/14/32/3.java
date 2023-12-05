@ VisibleForTesting static int solve ( ) {
  final long M = 1000000007 ;
  int result ;
  int groups = 1 ;
  for ( int p = 1 ;
  p <= p ;
  p ++ ) {
    r *= i ;
    r %= M ;
  }
  /* debug */
  System . err . println ( "Case #" + p + ": " + result ) ;
  final String ALPHABET = "abcdefghijklmnopqrstuvwxyz" ;
  class SolveError {
  }
  public int solve2 ( List < String > cars ) {
    int result = 0 ;
    for ( List < String > perm : permutations ( cars ) ) {
      String cc = "" ;
      for ( String car : perm ) cc += car ;
      String trimmed = trim ( cc ) ;
      if ( new HashSet < > ( trimmed ) . size ( ) == trimmed . length ( ) ) result ++ ;
    }
    return result ;
  }
  /* solve */
  final Map < Character , Integer > start = new HashMap < Character , Integer > ( ) ;
  final Map < Character , Integer > end = new HashMap < Character , Integer > ( ) ;
  final Map < Character , Integer > singular = new HashMap < Character , Integer > ( ) ;
  final Map < Character , Integer > mid = new HashMap < Character , Integer > ( ) ;
  for ( String c : ALPHABET . keySet ( ) ) {
    start . put ( c , 0 ) ;
    end . put ( c , 0 ) ;
    singular . put ( c , 0 ) ;
    mid . put ( c , 0 ) ;
  }
  final List < String > pairs = new ArrayList < String > ( ) ;
  for ( String car : cars ) {
    final String trimmed = trim ( car ) ;
    if ( trimmed . length ( ) != new HashSet < > ( trimmed ) . size ( ) ) {
      throw new SolveError ( "Duplicate cars in set" ) ;
    }
    else if ( trimmed . length ( ) == 1 ) {
      singular . put ( trimmed , 1 ) ;
    }
    else {
      for ( int i = 0 ;
      i < trimmed . length ( ) ;
      i ++ ) {
        char c = trimmed . charAt ( i ) ;
        if ( i == 0 ) start . put ( c , 1 ) ;
        else if ( i == trimmed . length ( ) - 1 ) end . put ( c , 1 ) ;
        else mid . put ( c , 1 ) ;
      }
      pairs . add ( trimmed . charAt ( trimmed . length ( ) - 1 ) ) ;
    }
  }
  for ( int i = pairs . size (