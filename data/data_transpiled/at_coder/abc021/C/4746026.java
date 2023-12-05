static final int [ ] [ ] resize ( int [ ] [ ] array ) {
  final String input = "Input array to work on " + "input. " ;
  final int inf = 10 * 18 ;
  final int N = Integer . parseInt ( input ) ;
  final int a = Integer . parseInt ( input [ 0 ] ) ;
  final int b = Integer . parseInt ( input [ 1 ] ) ;
  final int M = Integer . parseInt ( input [ 2 ] ) ;
  final List < Integer > xy = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    xy . add ( Collections . singletonList ( Integer . parseInt ( input [ 2 ] ) ) ) ;
  }
  final List < Integer > tab = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    tab . add ( new ArrayList < > ( ) ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int [ ] tab = new ArrayList < > ( ) ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      tab . add ( new ArrayList < > ( ) ) ;
    }
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      tab . add ( new ArrayList < > ( ) ) ;
    }
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      tab . add ( new ArrayList < > ( ) ) ;
    }
  }
  final boolean [ ] prev = new boolean [ N ] ;
  final int [ ] cnt = new int [ N ] ;
  final Queue < Integer > queue = new Queue < > ( ) ;
  queue . add ( new Integer ( 0 ) ) ;
  queue . add ( new Integer ( a ) ) ;
  while ( queue . size ( ) > 0 ) {
    final int cost = queue . poll ( ) ;
    final int hi = queue . poll ( ) ;
    if ( cost >= d [ b - 1 ] ) continue ;
    for ( int j = 0 ;
    j < tab . length ;
    j ++ ) {
      final int hj = tab [ j ] ;
      if ( hj == prev [ hi - 1 ] ) continue ;
      final int alt = d [ hi - 1 ] + 1 ;
      if ( alt < d [ hj - 1 ] ) {
        d [ hj - 1 ] = alt ;
        prev [ hj - 1 ] = hi ;
        queue . add ( new Integer ( alt ) ) ;
      }
    }
    