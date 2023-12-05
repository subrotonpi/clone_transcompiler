static final String print ( int i ) {
  final int NCASE = Integer . parseInt ( i ) ;
  for ( int testCase = 1 ;
  testCase <= NCASE ;
  testCase ++ ) {
    final int P = Integer . parseInt ( i ) ;
    final int E = Integer . parseInt ( i ) ;
    final int F = Integer . parseInt ( i ) ;
    final Map < Integer , Integer > count = Maps . newHashMap ( ) ;
    for ( int e = E ;
    e > 0 ;
    e -- ) {
      count . put ( e , F ) ;
    }
    final List < String > ans = new ArrayList < > ( ) ;
    if ( count . get ( 0 ) > 1 ) {
      while ( count . get ( 0 ) > 1 ) {
        ans . add ( 0 ) ;
        count . get ( 0 ) / = 2 ;
      }
      final int m = 1 << ans . size ( ) ;
      for ( int k : count . keySet ( ) ) {
        if ( k != 0 ) {
          count . get ( k ) / = m ;
        }
      }
    }
    List < Integer > keys = new ArrayList < > ( count . keySet ( ) ) ;
    while ( keys . size ( ) > 1 ) {
      final int key = keys . get ( 1 ) ;
      ans . add ( key ) ;
      final HashMap < Integer , Integer > nc = new HashMap < > ( ) ;
      final int nkeys = keys . size ( ) ;
      for ( int k : keys ) {
        if ( count . get ( k ) > 0 ) {
          count . get ( k - key ) - = count . get ( k ) ;
          nc . put ( k - key , count . get ( k ) ) ;
        }
      }
      count = nc ;
      keys = new ArrayList < > ( nc . keySet ( ) ) ;
    }
    ans = StringUtils . join ( ans , " " ) ;
    System . out . println ( "Case #" + testCase + ": " + ans ) ;
  }
  return ans ;
}
