@ VisibleForTesting static int [ ] solve ( ) {
  final String input = System . getProperty ( "line.separator" ) ;
  final double INF = Double . MAX_VALUE ;
  final int MOD = 10 * 9 + 7 ;
  {
    final int N = Integer . parseInt ( input ) ;
    final Map < Integer , Integer > G = new TreeMap < > ( ) ;
    for ( int i = 0 ;
    i < N - 1 ;
    i ++ ) {
      final int a = Integer . parseInt ( input ) ;
      final int b = Integer . parseInt ( input ) ;
      G . put ( a - 1 , b - 1 ) ;
      G . put ( b - 1 , a - 1 ) ;
    }
  }
  {
    final LinkedList < Integer > stack = new LinkedList < > ( ) ;
    stack . add ( start ) ;
    final double [ ] dist = new double [ N ] ;
    dist [ N ] = INF ;
    dist [ N ] = 0 ;
    int maxDist = 0 ;
    int farthestV = start ;
    while ( stack . size ( ) > 0 ) {
      final int curr = stack . removeLast ( ) ;
      for ( final int next : G . get ( curr ) ) {
        if ( dist [ next ] != INF ) continue ;
        dist [ next ] = dist [ curr ] + 1 ;
        stack . add ( next ) ;
        if ( dist [ next ] > maxDist ) {
          maxDist = dist [ next ] ;
          farthestV = next ;
        }
      }
    }
  }
  return farthestV ;
}
