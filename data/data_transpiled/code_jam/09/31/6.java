@ VisibleForTesting static Iterable < Integer > combinations ( ) {
  int T = input . nextInt ( ) ;
  for ( int i : xrange ( T ) ) {
    String s = scanner . nextLine ( ) ;
    int m = Collections . frequency ( s , Integer . MAX_VALUE ) ;
    if ( m == 1 ) m = 2 ;
    int n = 0 ;
    Map < Character , Integer > map = new HashMap < > ( ) ;
    for ( int k = 0 ;
    k < s . length ( ) ;
    k ++ ) {
      char c = s . charAt ( k ) ;
      if ( k == 0 ) {
        map . put ( c , 1 ) ;
      }
      else if ( map . containsKey ( c ) ) {
      }
      else if ( map . size ( ) == 1 ) {
        map . put ( c , 0 ) ;
      }
      else {
        map . put ( c , map . size ( ) ) ;
      }
      n *= m ;
      n += map . get ( c ) ;
    }
    System . out . printf ( "Case #%i: %i%n" , i + 1 , n ) ;
  }
  return Collections . singleton ( new Integer ( i ) ) ;
}
