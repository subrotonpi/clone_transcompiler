public static int [ ] times ( ) throws IOException {
  long total = 0 ;
  long next = 0 ;
  long current = 0 ;
  for ( long t : times ) {
    total += ( long ) ( ctime / t ) ;
    if ( ( ctime % t ) == 0 ) {
      next ++ ;
    }
    else {
      current ++ ;
    }
  }
  if ( ( total + current ) >= N ) {
    return - 1 ;
  }
  if ( ( total + current + next ) < N ) {
    return 1 ;
  }
  else {
    return 0 ;
  }
  /* get the num */
  long num = 0 ;
  total = 0 ;
  for ( long t : times ) {
    total += ( long ) ( ctime / t ) ;
    if ( ( ctime % t ) > 0 ) {
      total ++ ;
    }
  }
  long left = N - total ;
  Iterator < Long > itr = times . iterator ( ) ;
  for ( int test_case = 1 ;
  test_case <= testCases ;
  test_case ++ ) {
    String first = itr . next ( ) ;
    B = Long . parseLong ( first ) ;
    N = Long . parseLong ( first ) ;
    times = Arrays . asList ( itr . next ( ) . split ( "\\s+" ) ) ;
    long low = 0 ;
    long high = max ( times ) * N + 1 ;
    long correct = - 1 ;
    while ( low < high ) {
      long mid = ( low ) + ( high - low ) / 2 ;
      int ret = checkTime ( mid ) ;
      if ( ret == - 1 ) {
        high = mid ;
      }
      else if ( ret == 1 ) {
        low = mid + 1 ;
      }
      else {
        correct = mid ;
        break ;
      }
    }
    System . out . println ( "Case #" + test_case + ": " + num ) ;
  }
  return times ;
}
