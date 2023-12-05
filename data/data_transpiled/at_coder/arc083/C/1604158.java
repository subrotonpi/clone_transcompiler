@ VisibleForTesting static Iterable < Pair < Integer , Integer >> combinations ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > P = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) P . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  List < Integer > X = Lists . newArrayList ( ) ;
  List < List < Integer >> L = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) L . add ( Lists . newArrayList ( ) ) ;
  List < Pair < Integer , Integer >> debug = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int p = P . get ( i ) ;
    List < Integer > l = L . get ( i ) ;
    int x = X . get ( i ) ;
    int m ;
    if ( l . size ( ) < 10 ) {
      m = - 1 ;
      for ( int s : l ) {
        int n = Integer . parseInt ( s ) ;
        if ( n <= x ) m = Math . max ( n , m ) ;
      }
      if ( m == - 1 ) {
        System . err . println ( "IMPOSSIBLE" ) ;
        exit ( ) ;
      }
      m = Integer . parseInt ( Iterables . getLast ( l ) ) - m ;
    }
    else {
      int offset = Integer . parseInt ( Iterables . getLast ( l ) ) ;
      x -= offset ;
      if ( x < 0 ) {
        System . err . println ( "IMPOSSIBLE" ) ;
        exit ( ) ;
      }
      boolean [ ] dp = new boolean [ x + 1 ] ;
      dp [ 0 ] = true ;
      int s = 0 ;
      for ( int a = 0 ;
      a < l . size ( ) ;
      a ++ ) {
        int b = l . get ( a ) ;
        int d = Math . abs ( a - b ) ;
        s += d ;
        for ( int j = 0 ;
        j < x - d + 1 ;
        j ++ ) dp [ j + d ] = dp [ j + d ] || dp [ j ] ;
      }
      int m = x ;
      while ( ! dp [ m ] ) m -- ;
      m = s - m ;
      m += offset ;
      x += offset ;
    }
    debug . add ( new Pair < > ( x , m ) ) ;
    L . set ( p , null ) ;
  }
  return debug ;
}
