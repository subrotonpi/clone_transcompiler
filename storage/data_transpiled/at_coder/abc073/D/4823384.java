@ VisibleForTesting static int [ ] [ ] floyd_warshall ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int M = Integer . parseInt ( input . nextLine ( ) ) ;
  final int R = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] [ ] r = new int [ N ] [ R ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    r [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  final double [ ] [ ] G = new double [ N ] [ R ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    G [ i ] [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    final int i = Integer . parseInt ( input . nextLine ( ) ) ;
    final int j = Integer . parseInt ( input . nextLine ( ) ) ;
    final int k = Integer . parseInt ( input . nextLine ( ) ) ;
    G [ i - 1 ] [ j - 1 ] = k ;
    G [ j - 1 ] [ i - 1 ] = k ;
  }
  final double [ ] [ ] wf = new double [ N ] [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    wf [ i ] [ i ] = wf [ i ] [ i ] ;
  }
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    wf [ i ] [ j ] = wf [ i ] [ j ] ;
  }
  return wf ;
}
