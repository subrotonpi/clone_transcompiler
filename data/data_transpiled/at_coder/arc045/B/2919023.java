@ VisibleForTesting static LinkedHashMap < Integer , Integer > map ( String input ) {
  final double INF = Double . MAX_VALUE ;
  final int mod = 10 * 9 + 7 ;
  final char [ ] AtoZ = new char [ 65 ] ;
  for ( int i = 65 ;
  i < 65 + 26 ;
  i ++ ) AtoZ [ i ] = ( char ) i ;
  final char [ ] atoz = new char [ 97 ] ;
  for ( int i = 97 ;
  i < 97 + 26 ;
  i ++ ) AtoZ [ i ] = ( char ) i ;
  final int N = Integer . parseInt ( input ) ;
  final int M = Integer . parseInt ( input ) ;
  final int [ ] tb = new int [ N + 2 ] ;
  final int [ ] [ ] STs = new int [ M ] [ N + 2 ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int s = Integer . parseInt ( input ) ;
    int t = Integer . parseInt ( input ) ;
    STs [ i ] [ s ] = t ;
    tb [ s ] ++ ;
    tb [ t + 1 ] -- ;
  }
  int SUM = 0 ;
  for ( int i = 0 ;
  i < N + 2 ;
  i ++ ) {
    SUM += tb [ i ] ;
    tb [ i ] = SUM ;
  }
  SUM = 0 ;
  for ( int i = 0 ;
  i < N + 2 ;
  i ++ ) {
    if ( tb [ i ] == 1 ) SUM ++ ;
    tb [ i ] = SUM ;
  }
  final ArrayList < Integer > ans = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int s = STs [ i ] ;
    final int t = STs [ i ] ;
    if ( tb [ t ] - tb [ s - 1 ] == 0 ) ans . add ( i ) ;
  }
  System . out . println ( ans . size ( ) ) ;
  for ( int a : ans ) {
    System . out . println ( a + 1 ) ;
  }
  return ans ;
}
