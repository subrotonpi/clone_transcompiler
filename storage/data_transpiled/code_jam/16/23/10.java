static final int [ ] read ( ) {
  final int N = Integer . parseInt ( input . readLine ( ) ) ;
  final int [ ] reads = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) reads [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  final int T = read ( ) ;
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    final int N = read ( ) ;
    final Map < Integer , List < Integer >> G = Maps . newHashMap ( ) ;
    final Set < Integer > V = Sets . newHashSet ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      final int S = read ( ) ;
      final int T = read ( ) ;
      V . add ( new Integer ( S ) ) ;
      V . add ( new Integer ( T ) ) ;
      if ( ! G . containsKey ( S ) ) G . put ( new Integer ( S ) , new ArrayList < Integer > ( ) ) ;
      G . get ( new Integer ( S ) ) . add ( new Integer ( T ) ) ;
      if ( ! G . containsKey ( T ) ) G . put ( new Integer ( T ) , new ArrayList < Integer > ( ) ) ;
      G . get ( new Integer ( T ) ) . add ( new Integer ( S ) ) ;
    }
    int res = 0 ;
    final Map < Integer , Integer > match = new HashMap < Integer , Integer > ( V . size ( ) ) ;
    for ( int v : V ) {
      final int w = match . get ( v ) ;
      if ( ( w == - 1 ) || ( ! used . get ( w ) ) && dfs ( w , used ) ) {
        match . put ( v , u ) ;
        match . put ( u , v ) ;
        return true ;
      }
    }
    for ( int v : V ) {
      if ( match . get ( v ) == - 1 ) {
        final Map < Integer , Integer > used = new HashMap < Integer , Integer > ( V . size ( ) ) ;
        for ( int i = v ;
        i < N ;
        i ++ ) {
          if ( dfs ( v , used ) ) res ++ ;
        }
      }
    }
    int result = N - ( res + Arrays . binarySearch ( match , - 1 ) ) ;
    System . out . println ( "Case #" + testCase + ": " + result ) ;
  }
  return reads ;
}
