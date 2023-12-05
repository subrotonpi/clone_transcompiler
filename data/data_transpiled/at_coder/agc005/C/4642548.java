@ VisibleForTesting static LinkedHashMap < Integer , Integer > map ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < Integer > As = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) As . add ( Integer . parseInt ( input ) ) ;
  int maxA = Collections . max ( As ) ;
  int minA = ( maxA + 1 ) / 2 ;
  Map < Integer , Integer > cnt = new HashMap < > ( As ) ;
  for ( Map . Entry < Integer , Integer > entry : cnt . entrySet ( ) ) {
    int A = entry . getKey ( ) ;
    int num = entry . getValue ( ) ;
    if ( A < minA ) {
      System . out . println ( "Impossible" ) ;
      break ;
    }
    else if ( A == minA ) {
      if ( ( maxA % 2 && num != 2 ) || ( maxA % 2 == 0 && num != 1 ) ) {
        System . out . println ( "Impossible" ) ;
        break ;
      }
    }
    else if ( num < 2 ) {
      System . out . println ( "Impossible" ) ;
      break ;
    }
  }
  else {
    for ( int A = minA + 1 ;
    A <= maxA ;
    A ++ ) {
      if ( ! cnt . containsKey ( A ) ) {
        System . out . println ( "Impossible" ) ;
        break ;
      }
    }
  }
  return cnt ;
}
