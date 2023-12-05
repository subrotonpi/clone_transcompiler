@ VisibleForTesting static void from ( LinkedHashMap < Integer , Integer > input ) {
  final int MOD = 10 * 9 + 7 ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int a = Integer . parseInt ( input . nextLine ( ) ) ;
  final int b = Integer . parseInt ( input . nextLine ( ) ) ;
  final int M = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] [ ] edges = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    edges [ i ] = new int [ N ] ;
    for ( int j = 0 ;
    j < M ;
    j ++ ) {
      int x = Integer . parseInt ( input . nextLine ( ) ) ;
      int y = Integer . parseInt ( input . nextLine ( ) ) ;
      edges [ x ] [ y ] = y ;
      edges [ y ] [ x ] = x ;
    }
  }
  Queue < Integer > q = new ArrayDeque < > ( ) ;
  q . add ( a ) ;
  boolean [ ] visited = new boolean [ N ] ;
  visited [ a ] = true ;
  int [ ] depth = new int [ N ] ;
  depth [ a ] = - 1 ;
  depth [ a ] = 1 ;
  int [ ] cnts = new int [ N ] ;
  cnts [ a ] = 1 ;
  while ( q . size ( ) > 0 ) {
    int cur = q . poll ( ) ;
    for ( int nex : edges [ cur ] ) {
      if ( ! visited [ nex ] ) {
        q . add ( nex ) ;
        visited [ nex ] = true ;
      }
      if ( depth [ nex ] < 0 ) {
        depth [ nex ] = depth [ cur ] + 1 ;
      }
      if ( depth [ nex ] == depth [ cur ] + 1 ) {
        cnts [ nex ] += cnts [ cur ] ;
        cnts [ nex ] %= MOD ;
      }
    }
  }
  System . out . println ( cnts [ b ] ) ;
}
