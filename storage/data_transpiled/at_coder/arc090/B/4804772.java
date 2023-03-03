static final String getInput ( ) {
  final String input = "Enter a list of integers: " ;
  final int N = Integer . parseInt ( input ) ;
  final int M = Integer . parseInt ( input ) ;
  final Set < IntPair > AdjList = new HashSet < IntPair > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    final int a = Integer . parseInt ( input ) ;
    final int b = Integer . parseInt ( input ) ;
    final int c = Integer . parseInt ( input ) ;
    AdjList . get ( a - 1 ) . add ( new IntPair ( b - 1 , c ) ) ;
    AdjList . get ( b - 1 ) . add ( new IntPair ( a - 1 , - c ) ) ;
  }
  final Integer [ ] visited = new Integer [ N ] ;
  boolean ok = true ;
  final Stack < IntPair > stack = new Stack < IntPair > ( ) ;
  for ( int x = 0 ;
  x < N ;
  x ++ ) {
    if ( visited [ x ] != null ) continue ;
    visited [ x ] = 0 ;
    stack . push ( x ) ;
    while ( stack . size ( ) > 0 ) {
      final int v = stack . pop ( ) ;
      for ( IntPair to : AdjList . get ( v ) ) {
        final int d = to . getDistance ( ) ;
        if ( visited [ to ] == null ) {
          visited [ to ] = visited [ v ] + d ;
          stack . push ( to ) ;
        }
        else {
          if ( visited [ to ] != visited [ v ] + d ) {
            ok = false ;
            break ;
          }
        }
      }
    }
    if ( ok == false ) break ;
  }
  System . out . println ( ok ? "Yes" : "No" ) ;
  return input ;
}
