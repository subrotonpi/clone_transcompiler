public static int N ( ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  LinkedList < Integer > [ ] edgeList = new LinkedList [ N ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    edgeList [ a - 1 ] . add ( b - 1 ) ;
    edgeList [ b - 1 ] . add ( a - 1 ) ;
  }
  boolean [ ] done = new boolean [ N ] ;
  int chk = 0 ;
  /* dfs */
  done = new boolean [ N ] ;
  for ( int s = 0 ;
  s < N ;
  s ++ ) {
    done [ s ] = true ;
    if ( Arrays . equals ( done , edgeList [ s ] ) ) chk ++ ;
  }
  for ( int i = 0 ;
  i < edgeList [ s ] . size ( ) ;
  i ++ ) {
    if ( ! done [ i ] ) {
      /* dfs */
    }
  }
  return chk ;
}
