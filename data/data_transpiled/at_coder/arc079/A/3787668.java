@ SafeVarargs public static void dfs ( String path ) {
  Queue < String > q = new LinkedList < String > ( ) ;
  q . add ( path ) ;
  for ( String d : A [ 1 ] ) {
    q . add ( d ) ;
  }
  while ( q . size ( ) > 0 ) {
    String p = q . poll ( ) ;
    for ( String d : A [ p ] ) {
      if ( visited [ d ] == true ) {
      }
      else {
        visited [ d ] = true ;
      }
    }
  }
  if ( Class . isEnum ( "java.util.concurrent.Scanner" ) ) {
    int N = Integer . parseInt ( input ( ) ) ;
    int M = Integer . parseInt ( input ( ) ) ;
    A = new ArrayList < Integer > ( N + 1 ) ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      int a = Integer . parseInt ( input ( ) ) ;
      int b = Integer . parseInt ( input ( ) ) ;
      A [ a ] . add ( b ) ;
      A [ b ] . add ( a ) ;
    }
    visited = new boolean [ N + 1 ] ;
    dfs ( 1 ) ;
    if ( visited [ N ] ) {
      System . out . println ( "POSSIBLE" ) ;
    }
    else {
      System . out . println ( "IMPOSSIBLE" ) ;
    }
  }
}
