@ VisibleForTesting static void from ( LinkedHashMap < Integer , Integer > input ) {
  final long MOD = 1000000007 ;
  final Function < Integer , Integer > iist = input -> Integer . parseInt ( input . nextLine ( ) ) ;
  final int N = iist . apply ( 0 ) ;
  final int M = iist . apply ( 0 ) ;
  final LinkedHashMap < Integer , Integer > Q = new LinkedHashMap < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    final int l = iist . apply ( i ) ;
    final int r = iist . apply ( i ) ;
    final int x = iist . apply ( i ) ;
    Q . put ( r , new Integer ( l ) ) ;
  }
  if ( CollectionUtils . isEmpty ( Q . get ( 1 ) ) ) {
    System . out . println ( 0 ) ;
    exit ( 0 ) ;
  }
  final LinkedHashMap < Integer , Integer > dp = new LinkedHashMap < > ( ) ;
  dp . put ( 0 , 0 ) ;
  final int [ ] xSum = new int [ N ] ;
  final int [ ] ySum = new int [ N ] ;
  int s = 3 ;
  for ( int pk = 1 ;
  pk < N ;
  pk ++ ) {
    final int k = pk + 1 ;
    for ( int i = 0 ;
    i < xSum . length ;
    i ++ ) {
      final int a = xSum [ i ] ;
      final int b = ySum [ i ] ;
      final int c = ( a + b ) % MOD ;
      dp . put ( i , pk , c ) ;
      xSum [ i ] += c ;
    }
    xSum [ 0 ] = 0 ;
    ySum [ 0 ] = ( 2 * s ) % MOD ;
    s *= 3 ;
    final int [ ] subQ = Q . get ( k ) ;
    for ( int i = 0 ;
    i < dp . size ( ) ;
    i ++ ) {
      final int j = dp . keySet ( ) . iterator ( ) . next ( ) ;
      for ( int l = 0 ;
      l < subQ . length ;
      l ++ ) {
        final int x = subQ [ i ] ;
        if ( x != ( l <= i ) + ( l <= j ) + 1 ) {
          final int c = dp . get ( i , j ) ;
          xSum [ i ] -= c ;
          ySum [ j ] -= c ;
          s -= c ;
          dp . remove ( i , j ) ;
          break ;
        }
      }
    }
  }
  System . out . println ( s ) ;
  