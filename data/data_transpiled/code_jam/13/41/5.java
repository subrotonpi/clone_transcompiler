@ input public static void input ( ) {
  for ( int cas : xrange ( 1 , z + 1 ) ) {
    int n = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
    int m = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
    Map < Integer , Integer > enters = new TreeMap < > ( ) ;
    Map < Integer , Integer > leaves = new TreeMap < > ( ) ;
    Set < Integer > keys = new HashSet < > ( ) ;
    int normal = 0 ;
    for ( int i : xrange ( m ) ) {
      int o = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
      int e = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
      int p = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
      normal += p * ( e - o ) * ( e - o + 1 ) / 2 ;
      keys . add ( o ) ;
      keys . add ( e ) ;
      for ( int j : xrange ( p ) ) {
        enters . put ( o , ++ i ) ;
        leaves . put ( e , ++ i ) ;
      }
    }
    Stack < Integer > stak = new Stack < > ( ) ;
    for ( Integer k : sorted ( keys ) ) {
      for ( int v : xrange ( enters . get ( k ) ) ) stak . push ( k ) ;
      for ( int v : xrange ( leaves . get ( k ) ) ) {
        int w = stak . pop ( ) ;
        normal -= ( k - w ) * ( k - w + 1 ) / 2 ;
      }
    }
    System . out . println ( "Case #" + cas + ": " + - normal ) ;
  }
}
