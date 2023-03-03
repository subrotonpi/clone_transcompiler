@ VisibleForTesting static void dfs ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int M = Integer . parseInt ( input . nextLine ( ) ) ;
  final Map < Integer , Integer > g = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    final int a = Integer . parseInt ( input . nextLine ( ) ) ;
    final int b = Integer . parseInt ( input . nextLine ( ) ) ;
    g . put ( a , b ) ;
    g . get ( b ) . add ( a ) ;
  }
  Set < Integer > visited = new HashSet < > ( ) ;
  dfs ( visited ) ;
  for ( int v : g . keySet ( ) ) {
    visited . add ( v ) ;
  }
  int connectedComponent = 0 ;
  for ( int v : g . values ( ) ) {
    if ( ! visited . contains ( v ) ) {
      dfs ( v ) ;
      connectedComponent ++ ;
    }
  }
  System . out . println ( connectedComponent - 1 ) ;
}
