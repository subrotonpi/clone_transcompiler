@ VisibleForTesting static void readInfinite ( Scanner fin ) throws IOException {
  final Scanner fin = new Scanner ( System . in ) ;
  final int T = Integer . parseInt ( fin . nextLine ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    final int N = Integer . parseInt ( fin . nextLine ( ) ) ;
    final List < Pair < Integer , Integer >> vines = new ArrayList < > ( N ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      final int di = Integer . parseInt ( fin . nextLine ( ) ) ;
      final int li = Integer . parseInt ( fin . nextLine ( ) ) ;
      vines . add ( new Pair < > ( di , li ) ) ;
    }
    final int D = Integer . parseInt ( fin . nextLine ( ) ) ;
    vines . add ( new Pair < > ( D , 0 ) ) ;
    final Queue < Pair < Integer , Integer >> queue = new ArrayDeque < > ( ) ;
    queue . add ( new Pair < > ( vines . get ( 0 ) . first ( ) , vines . get ( 0 ) . first ( ) * 2 ) ) ;
    for ( int i = 1 ;
    i < N ;
    i ++ ) {
      final int d = vines . get ( i ) . first ( ) ;
      final int l = vines . get ( i ) . second ;
      while ( queue . size ( ) > 0 && queue . get ( 0 ) . second < d ) {
        queue . poll ( ) ;
      }
      if ( queue . isEmpty ( ) ) break ;
      final int distance = Math . min ( l , d - queue . get ( 0 ) . first ( ) ) ;
      final int p = d + distance ;
      if ( p > queue . get ( queue . size ( ) - 1 ) . second ) {
        queue . add ( new Pair < > ( d , p ) ) ;
      }
    }
    final boolean success = queue . isEmpty ( ) ;
    System . out . println ( "Case #" + testCase + ": " + ( success ? "YES" : "NO" ) ) ;
  }
}
