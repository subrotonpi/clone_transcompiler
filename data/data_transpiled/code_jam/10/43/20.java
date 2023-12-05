@ VisibleForTesting static int solve ( List < Point > Rs ) {
  final String line = readLine ( ) ;
  final int C = Integer . parseInt ( line ) ;
  final int turns = 0 ;
  while ( field . size ( ) > 0 ) {
    turns ++ ;
    final List < Point > will_spawn = new ArrayList < Point > ( ) ;
    final List < Point > will_die = new ArrayList < Point > ( ) ;
    final Iterator < Point > it = field . iterator ( ) ;
    while ( it . hasNext ( ) ) {
      final Point p = it . next ( ) ;
      if ( field . get ( new Point ( p . x , p . y - 1 ) ) . or ( field . get ( new Point ( p . x - 1 , p . y ) ) . contains ( p . y ) ) ) {
      }
      else {
        will_die . add ( new Point ( p . x , p . y ) ) ;
      }
      if ( field . get ( new Point ( p . x + 1 , p . y - 1 ) ) . contains ( p . y ) ) {
        will_spawn . add ( new Point ( p . x + 1 , p . y ) ) ;
      }
      if ( field . get ( new Point ( p . x - 1 , p . y + 1 ) ) . contains ( p . y ) ) {
        will_spawn . add ( new Point ( p . x , p . y + 1 ) ) ;
      }
    }
    for ( final Point p : will_die ) field . remove ( p ) ;
    for ( final Point p : will_spawn ) field . put ( p , true ) ;
  }
  int idx = 1 ;
  for ( int t = 1 ;
  t <= C ;
  t ++ ) {
    final int R = Integer . parseInt ( line . substring ( idx ) ) ;
    final List < Point > Rs = new ArrayList < Point > ( ) ;
    for ( int r = 0 ;
    r < R ;
    r ++ ) {
      Rs . add ( Arrays . asList ( line . substring ( idx + 1 + r ) . split ( " " ) ) ) ;
    }
    idx += R + 1 ;
    final int answer = solve ( Rs ) ;
    System . out . println ( "Case #" + t + ": " + answer ) ;
  }
  return turns ;
}
