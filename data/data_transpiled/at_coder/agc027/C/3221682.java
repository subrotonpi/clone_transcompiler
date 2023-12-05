@ VisibleForTesting static void dfs ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int M = Integer . parseInt ( input . nextLine ( ) ) ;
  final LinkedList < Integer > s = new LinkedList < > ( ) ;
  for ( int i = 0 ;
  i < 2 * N ;
  i ++ ) {
    s . add ( i ) ;
  }
  final int [ ] lines = new int [ 2 * N ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    a -- ;
    b -- ;
  }
}
