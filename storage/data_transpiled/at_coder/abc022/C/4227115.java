@ VisibleForTesting static Iterable < Integer > combinations ( ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int N = input . nextInt ( ) ;
  final int M = input . nextInt ( ) ;
  double ans = Double . MAX_VALUE ;
  final int [ ] [ ] adj0 = new int [ N ] [ ] ;
  final double [ ] [ ] mat = new double [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < M ;
    j ++ ) {
      final int s = input . nextInt ( ) ;
      final int g = input . nextInt ( ) ;
      final int w = input . nextInt ( ) ;
      if ( s == 1 ) {
        adj0 [ i ] [ j ] = g - 1 ;
      }
      else if ( g == 1 ) {
        adj0 [ i ] [ j ] = s - 1 ;
      }
      else {
        mat [ i ] [ j ] = w ;
        mat [ i ] [ j ] = s ;
      }
    }
  }
  final int [ ] [ ] mat = floydWarshall ( mat , false ) ;
  final Iterable < Pair < Integer , Integer >> comb = combinations ( adj0 , 2 ) ;
  for ( final Pair < Integer , Integer > p1 : comb ) {
    final Pair < Integer , Integer > p2 = p2 . first ;
    ans = Math . min ( ans , p1 . second + p2 . second + mat [ p1 . first ] [ p2 . first ] ) ;
  }
  if ( ans == Double . MAX_VALUE ) {
    ans = - 1 ;
    System . out . println ( ans ) ;
  }
  else {
    System . out . println ( ( int ) ans ) ;
  }
  return comb ;
}
