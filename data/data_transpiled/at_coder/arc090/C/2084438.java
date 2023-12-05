@ VisibleForTesting static int [ ] solve ( int s , int t , HashMap < Integer , Integer > links ) {
  final long MOD = 1000000007 , INF = Long . MAX_VALUE ;
  {
    final PriorityQueue < Integer > q = new PriorityQueue < > ( ) ;
    q . add ( new Integer ( 0 ) ) ;
    q . add ( new Integer ( s ) ) ;
    q . add ( new Integer ( t ) ) ;
    final long [ ] visitedFwd = new long [ n ] ;
    final long [ ] visitedBwd = new long [ n ] ;
    for ( int i = 0 ;
    i < n ;
    ++ i ) {
      final int u = Integer . parseInt ( input . readLine ( ) ) ;
      final int v = Integer . parseInt ( input . readLine ( ) ) ;
      final int d = Integer . parseInt ( input . readLine ( ) ) ;
      u -- ;
      v -- ;
      links . put ( u , new Integer ( v ) ) ;
    }
    final long [ ] r = new long [ n ] ;
    for ( int i = 0 ;
    i < n ;
    ++ i ) {
      if ( visitedFwd [ i ] == visitedBwd [ i ] ) {
        r [ i ] = INF ;
        shortestCount += r [ i ] ;
        collisionCount %= MOD ;
      }
    }
    for ( int i = 0 ;
    i < n ;
    ++ i ) {
      final int u = Integer . parseInt ( input . readLine ( ) ) ;
      final int v = Integer . parseInt ( input . readLine ( ) ) ;
      final int d = Integer . parseInt ( input . readLine ( ) ) ;
      u -- ;
      v -- ;
      links . put ( u , new Integer ( v ) ) ;
    }
    final long [ ] r = new long [ n ] ;
    for ( int i = 0 ;
    i < n ;
    ++ i ) {
      r [ i ] = 0 ;
    }
    final long [ ] visitedFwd = new long [ n ] ;
    final long [ ] visitedFwd = new long [ n ] ;
    for ( int i = 0 ;
    i < n ;
    ++ i ) {
      final int u = Integer . parseInt ( input . readLine ( ) ) ;
      final int v = Integer . parseInt ( input . readLine ( ) ) ;
      final int d = Integer . parseInt ( input . readLine ( ) ) ;
      u -- ;
      v -- ;
      links . get ( u ) [ i ] = d ;
    }
    System . out . println ( solve ( s , t , links ) ) ;
  }
  return ( shortestCount * 2 - collisionCount ) ;
  