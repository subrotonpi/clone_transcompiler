@ VisibleForTesting static LinkedHashMap < Integer , Integer > solve ( ) {
  final BufferedReader stdin = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final Function < Integer , List < Integer >> readInt = new Function < Integer , Integer > ( ) {
    @ Override public Integer apply ( Integer input ) {
      return Integer . parseInt ( stdin . readLine ( ) ) ;
    }
  }
  ;
  final Function < String , String > readString = new Function < String , String > ( ) {
    @ Override public String apply ( String input ) {
      return stdin . readLine ( ) ;
    }
  }
  ;
  final int N = readInt . apply ( ) . asInt ( ) ;
  final List < Integer > items = new ArrayList < Integer > ( 1 ) ;
  int Nd6 = 0 ;
  do {
    if ( N / ( 6 * ( Nd6 + 1 ) ) > 0 ) {
      Nd6 ++ ;
      items . add ( 6 * Nd6 ) ;
    }
    else break ;
  }
  while ( N / ( 9 * ( Nd9 + 1 ) ) > 0 ) ;
  items . add ( 9 * Nd9 ) ;
  do {
    if ( N / ( 9 * ( Nd9 + 1 ) ) > 0 ) {
      Nd9 ++ ;
      items . add ( 9 * Nd9 ) ;
    }
    else break ;
  }
  while ( N / ( N + 1 ) > 0 ) ;
  Collections . sort ( items ) ;
  final int [ ] dp = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  ++ i ) {
    dp [ i ] = 0 ;
  }
  /* solve */
  for ( int i = 0 ;
  i < N ;
  ++ i ) {
    for ( int itm : items ) {
      if ( i + itm < N + 1 ) {
        if ( dp [ i + itm ] == 0 ) {
          dp [ i + itm ] = dp [ i ] + 1 ;
        }
        else {
          dp [ i + itm ] = Math . min ( dp [ i + itm ] , dp [ i ] + 1 ) ;
        }
      }
    }
  }
  return dp [ N ] ;
}
