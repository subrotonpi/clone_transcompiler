@ VisibleForTesting static void binarySearch ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int M = Integer . parseInt ( input . nextLine ( ) ) ;
  final Set < Integer > [ ] dicts = new Set [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    dicts [ i ] = new HashSet < > ( ) ;
  }
  for ( int m = 0 ;
  m < M ;
  m ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    a -- ;
    b -- ;
    dicts [ a ] . add ( b ) ;
    dicts [ b ] . add ( a ) ;
  }
  if ( dicts [ 0 ] . containsAll ( dicts [ N - 1 ] ) ) System . out . println ( "POSSIBLE" ) ;
  else System . out . println ( "IMPOSSIBLE" ) ;
}
