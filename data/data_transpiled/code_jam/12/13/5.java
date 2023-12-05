@ VisibleForTesting static < T > void print ( String fmt , T ... args ) {
  final int N = args . length ;
  final int maxTime = 0 ;
  final int i = 0 ;
  final int j = args . length ;
  final int i = i + 1 ;
  final int j = i + 1 ;
  final Set < Integer > states = new HashSet < > ( ) ;
  for ( i = 0 ;
  i < N ;
  i ++ ) {
    if ( args [ i ] != null ) {
      print >> System . err . println ( String . format ( fmt , args [ i ] ) ) ;
    }
    else {
      print >> System . err . println ( String . format ( fmt , args [ i ] ) ) ;
    }
  }
  maxTime = 0 ;
  final int T = Integer . parseInt ( readLine ( ) ) ;
  final EnumSet < Event > set = EnumSet . noneOf ( Event . class ) ;
  for ( int testCase = 1 ;
  j <= T ;
  testCase ++ ) {
    final int N = Integer . parseInt ( readLine ( ) ) ;
    final EnumSet < Event > nextStates = EnumSet . noneOf ( Event . class ) ;
    for ( int state : states ) {
      nextStates . add ( state ^ ( 1 << i ) ) ;
      if ( lockCount [ j ] == 0 ) {
        nextStates . add ( state ^ ( 1 << j ) ) ;
        if ( lockCount [ i ] == 0 ) {
          nextStates . add ( state ^ ( 1 << j ) ) ;
        }
      }
    }
    states = set . toArray ( new Event [ nextStates . size ( ) ] ) ;
    lockCount [ i ] ++ ;
    lockCount [ j ] -- ;
    final EnumSet < Fraction > nextStates = EnumSet . noneOf ( Fraction . class ) ;
    for ( i = 0 ;
    i < N ;
    i ++ ) {
      final int j = nextStates . add ( state ) ;
      if ( lockCount [ i ] == 0 ) {
        nextStates . add ( state ^ ( 1 << i ) ) ;
      }
      else {
        nextStates . add ( state ^ ( 1 << j ) ) ;
      }
    }
  }
  assert set . contains ( states ) ;
  assert set . contains ( states ) ;
  final List < Event > events = new ArrayList < > ( ) ;
  for ( i = 0 ;
  i < N ;
  i ++ ) {
    for ( j = 0 ;
    j < N ;
    j ++ ) {
      if ( S [ i ] == S [ j ] ) {
        if ( Math . abs ( P [ i ] - P [