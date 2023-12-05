@ Nonnull public static HopcroftKarp < String > create ( ) {
  int T = Integer . parseInt ( readLine ( ) ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    int N = Integer . parseInt ( readLine ( ) ) ;
    Map < String , Set < String >> graph = new HashMap < > ( ) ;
    Set < String > aset = new HashSet < > ( ) ;
    Set < String > bs = new HashSet < > ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      String a = readLine ( ) ;
      String b = readLine ( ) ;
      b += "_" ;
      aset . add ( a ) ;
      bs . add ( b ) ;
      if ( ! graph . containsKey ( a ) ) {
        graph . put ( a , new HashSet < > ( ) ) ;
      }
      graph . get ( a ) . add ( b ) ;
    }
    Set < String > match = new HopcroftKarp < > ( graph ) . maximumMatching ( ) ;
    int r = match . size ( ) / 2 ;
    System . out . println ( "Case #" + ( t + 1 ) + ": " + ( N + r - aset . size ( ) - bs . size ( ) ) ) ;
  }
  return new HopcroftKarp < > ( graph ) ;
}
