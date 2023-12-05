public static int tests = Integer . parseInt ( input ) {
  int tests = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int t = 0 ;
  t < tests ;
  t ++ ) {
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] a = Lists . newArrayList ( ) . stream ( ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
    int first = 0 ;
    for ( int i = 0 ;
    i < n - 1 ;
    i ++ ) {
      if ( a [ i + 1 ] < a [ i ] ) {
        first += a [ i ] - a [ i + 1 ] ;
      }
    }
    int maxdiff = 0 ;
    for ( int i = 0 ;
    i < n - 1 ;
    i ++ ) {
      maxdiff = Math . max ( maxdiff , a [ i ] - a [ i + 1 ] ) ;
    }
    int current = a [ 0 ] , second = 0 ;
    for ( int i = 1 ;
    i < a . length ;
    i ++ ) {
      int now = Math . min ( current , maxdiff ) ;
      second += now ;
      current = a [ i ] ;
    }
    System . out . println ( "Case #" + ( t + 1 ) + ": " + first + " " + second ) ;
  }
  return tests ;
}
