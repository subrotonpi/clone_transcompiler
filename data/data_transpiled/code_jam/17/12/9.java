public static boolean isFinished ( int [ ] currents , int p ) {
  return max ( currents ) >= p ;
  /* testcase */
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  p = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] requirements = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    requirements [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  TreeSet < Integer > [ ] ingridients = new TreeSet [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ingridients [ i ] = new TreeSet < Integer > ( ) ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
    }
  }
  currents = new int [ n ] ;
  int candidate = 1 ;
  int result = 0 ;
  while ( ! isFinished ( currents , p ) ) {
    boolean success = true ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      while ( currents [ i ] < p && ingridients [ i ] . get ( currents [ i ] ) < 0.9 * ( requirements [ i ] * candidate ) ) {
        currents [ i ] ++ ;
      }
      success = success && ( currents [ i ] < p && ingridients [ i ] . get ( currents [ i ] ) <= 1.1 * ( requirements [ i ] * candidate ) ) ;
    }
    if ( success ) {
      result ++ ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        currents [ i ] ++ ;
      }
    }
    else {
      candidate ++ ;
    }
  }
  int t = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int num = 0 ;
  num < t ;
  num ++ ) {
    System . out . println ( "Case #" + num + ": " + result ) ;
  }
  return true ;
}
