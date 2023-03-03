@ VisibleForTesting static void solve ( int s , int t , HashMap < Integer , Integer > links ) {
  final long MOD = 1000000007 , INF = Long . MAX_VALUE ;
  {
    final long [ ] counts = new long [ n ] ;
    Arrays . fill ( counts , 0 ) ;
    counts [ s ] = 1 ;
    for ( int dv = 0 ;
    dv < n ;
    dv ++ ) {
      int v = Integer . parseInt ( input . nextLine ( ) ) ;
      int d = Integer . parseInt ( input . nextLine ( ) ) ;
      int collisionCount = 0 ;
      for ( int u = 0 ;
      u < n ;
      u ++ ) {
        int v = Integer . parseInt ( input . nextLine ( ) ) ;
        int d = Integer . parseInt ( input . nextLine ( ) ) ;
        int r = countsForward [ v ] * countsBwd [ v ] ;
        shortestCount += r ;
        collisionCount %= r ;
      }
      for ( int u = 0 ;
      u < n ;
      u ++ ) {
        int v = Integer . parseInt ( input . nextLine ( ) ) ;
        int d = Integer . parseInt ( input . nextLine ( ) ) ;
        s -- ;
        t -- ;
        links [ u ] = v ;
        if ( v == d ) {
          int r = countsForward [ v ] * countsBwd [ v ] ;
          shortestCount += r ;
          collisionCount %= r ;
        }
      }
      for ( int u = 0 ;
      u < n ;
      u ++ ) {
        int v = Integer . parseInt ( input . nextLine ( ) ) ;
        int d = Integer . parseInt ( input . nextLine ( ) ) ;
        int r = 0 ;
        for ( int u = 0 ;
        u < n ;
        u ++ ) {
          int du = Integer . parseInt ( input . nextLine ( ) ) ;
          if ( v == d ) {
            int r = countsForward [ v ] * countsBwd [ u ] ;
            shortestCount += r ;
            collisionCount += r ;
          }
        }
        for ( int u = 0 ;
        u < n ;
        u ++ ) {
          int v = Integer . parseInt ( input . nextLine ( ) ) ;
          int r = countsForward [ v ] * countsBwd [ u ] ;
          if ( v == d ) {
            int r = countsForward [ v ] * countsBwd [ u ] ;
            shortestCount += r ;
            collisionCount += r * r ;
          }
        }
      }
      return ( shortestCount * 2 - collisionCount ) % MOD ;
    }
  }
  {
    final Queue < Point > q = new PriorityQueue < >