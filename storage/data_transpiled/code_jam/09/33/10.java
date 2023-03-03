public static void memoize ( final Runnable runnable ) {
  final Map < Integer , Runnable > results = new HashMap < > ( ) ;
  new Thread ( new Runnable ( ) {
    @ Override public void run ( ) {
      if ( ! results . containsKey ( runnable ) ) {
        results . put ( runnable , runnable ) ;
      }
    }
  }
  ) . start ( ) ;
  new Thread ( new Runnable ( ) {
    @ Override public void run ( ) {
      int N = Integer . parseInt ( readLine ( ) ) ;
      for ( int testCase : xrange ( N ) ) {
        int P = Integer . parseInt ( readLine ( ) ) ;
        int Q = Integer . parseInt ( readLine ( ) ) ;
        int [ ] releases = Ints . toArray ( new int [ 0 ] ) ;
        @ SuppressWarnings ( "unchecked" ) int minCost = 0 ;
        for ( int release : xrange ( firstRelease , lastRelease + 1 ) ) {
          int cost = lastCell - firstCell ;
          if ( release > firstRelease ) {
            int previousRelease = release - 1 ;
            int previousCell = releases [ release - 1 ] - 1 ;
            cost += solve ( firstCell , previousCell , firstRelease , previousRelease ) ;
          }
          if ( release < lastRelease ) {
            int nextRelease = release + 1 ;
            int nextCell = releases [ release - 1 ] + 1 ;
            cost += solve ( nextCell , lastCell , nextRelease , lastRelease ) ;
          }
          if ( minCost == 0 ) {
            minCost = cost ;
          }
          else {
            minCost = Math . min ( minCost , cost ) ;
          }
        }
        System . out . println ( "Case #" + ( testCase + 1 ) + ": " + solve ( 1 , P , 1 , Q ) ) ;
      }
    }
  }
  ) . start ( ) ;
}
