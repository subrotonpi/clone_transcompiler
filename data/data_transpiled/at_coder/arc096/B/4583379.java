public static int [ ] getStdDev ( ) {
  final int N = 10 * 9 ;
  final String input = System . getProperty ( "line.separator" ) ;
  final int C = Integer . parseInt ( input ) ;
  final List < Integer > sushis = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    sushis . add ( Collections . singletonList ( input . charAt ( i ) ) ) ;
  }
  final int [ ] valA = new int [ sushis . size ( ) ] ;
  final int [ ] valArev = new int [ sushis . size ( ) ] ;
  int sumV = 0 ;
  int tmpMax = - Float . MAX_VALUE ;
  for ( int i = 0 ;
  i < sushis . size ( ) ;
  i ++ ) {
    final int d = sushis . get ( i ) ;
    sumV += d ;
    valArev [ i ] = sumV - 2 * d ;
    tmpMax = Math . max ( tmpMax , sumV - d ) ;
    valA [ i ] = tmpMax ;
  }
  final int [ ] valB = new int [ sushis . size ( ) ] ;
  final int [ ] valBrev = new int [ sushis . size ( ) ] ;
  sumV = 0 ;
  tmpMax = - Float . MAX_VALUE ;
  for ( int i = 0 ;
  i < sushis . size ( ) ;
  i ++ ) {
    final int d = sushis . get ( i ) ;
    sumV += d ;
    final int revD = C - d ;
    valBrev [ i ] = sumV - 2 * revD ;
    tmpMax = Math . max ( tmpMax , sumV - revD ) ;
    valB [ i ] = tmpMax ;
  }
  int ans = Math . max ( valA , valB . length + Arrays . asList ( 0 ) ) ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    ans = Math . max ( ans , valArev [ i ] + valB [ N - i - 2 ] ) ;
  }
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    ans = Math . max ( ans , valBrev [ i ] + valA [ N - i - 2 ] ) ;
  }
  System . out . println ( ans ) ;
  return valA ;
}
