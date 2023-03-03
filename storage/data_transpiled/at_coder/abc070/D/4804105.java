@ VisibleForTesting static void main ( String [ ] args ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < List < Integer >> d = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    d . add ( new ArrayList < > ( ) ) ;
  }
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    int c = Integer . parseInt ( input . nextLine ( ) ) ;
    a = a - 1 ;
    b = b - 1 ;
    d . get ( a ) . add ( new Integer ( b ) ) ;
    d . get ( b ) . add ( new Integer ( c ) ) ;
  }
  final int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  K -- ;
  final int [ ] kDist = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    kDist [ i ] = 0 ;
  }
  final Deque < Integer > start = new ArrayDeque < > ( ) ;
  start . add ( K ) ;
  while ( start . size ( ) > 0 ) {
    final int s = start . removeFirst ( ) ;
    for ( final int dest : d . get ( s ) ) {
      final int cost = d . get ( dest ) ;
      if ( kDist [ dest ] > 0 ) {
        continue ;
      }
      kDist [ dest ] = kDist [ s ] + cost ;
      start . add ( dest ) ;
    }
  }
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    final int x = Integer . parseInt ( input . nextLine ( ) ) ;
    final int y = Integer . parseInt ( input . nextLine ( ) ) ;
    System . out . println ( kDist [ x - 1 ] + kDist [ y - 1 ] ) ;
  }
}
