@ VisibleForTesting static void from ( LinkedHashMap < Integer , Integer > input ) {
  final long MOD = 1000000007 ;
  final Function < Integer , Integer > iist = input -> Integer . parseInt ( input . nextLine ( ) ) ;
  final int N = iist . apply ( 0 ) ;
  final int M = iist . apply ( 1 ) ;
  final Map < Integer , Integer > Q = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    final int l = iist . apply ( i ) ;
    final int r = iist . apply ( i ) ;
    final int x = iist . apply ( i ) ;
    Q . put ( r , new Integer ( l ) ) ;
    Q . put ( x , new Integer ( x - 1 ) ) ;
  }
  if ( CollectionUtils . isEmpty ( Q . get ( 1 ) ) ) {
    System . out . println ( 0 ) ;
    exit ( 0 ) ;
  }
  final HashMap < Integer , Integer > dp = new HashMap < > ( ) ;
  dp . put ( new Integer ( 0 ) , 3 ) ;
  final int [ ] memo = new int [ N ] ;
  memo [ N ] = 6 ;
  int s = 3 ;
  for ( int pk = 1 ;
  pk < N ;
  pk ++ ) {
    final int k = pk + 1 ;
    for ( int i = 0 ;
    i < memo . length ;
    i ++ ) {
      final int c = memo [ i ] ;
      c %= MOD ;
      dp . put ( i , pk , c ) ;
      memo [ i ] *= 2 ;
      memo [ i ] %= MOD ;
    }
    memo [ k ] = 2 * s % MOD ;
    final int [ ] subQ = Q . get ( k ) ;
    for ( int i = 0 , j = list . size ( ) ;
    i < subQ . length ;
    j ++ ) {
      for ( int l = 0 ;
      l <= i ;
      l ++ ) {
        final int x = subQ [ i ] ;
        if ( x != ( l <= i ) + ( l <= j ) ) {
          final int c = dp . get ( i , j ) ;
          memo [ i ] -= c ;
          memo [ j ] -= c ;
          s -= c ;
          list . remove ( i , j ) ;
          break ;
        }
      }
    }
    s %= MOD ;
  }
  System . out . println ( s ) ;
}
