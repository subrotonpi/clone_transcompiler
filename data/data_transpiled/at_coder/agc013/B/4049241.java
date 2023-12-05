static final int [ ] [ ] getEdges ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int M = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] edges = new int [ N + 1 ] [ M ] ;
  for ( int a = 0 ;
  a < N ;
  ++ a ) {
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    edges [ a ] [ b ] = b ;
    edges [ b ] [ a ] = a ;
  }
  List < Integer > path = new ArrayList < > ( 1 ) ;
  boolean append = path . append ( 0 ) ;
  boolean [ ] visited = new boolean [ N - 1 ] ;
  while ( true ) {
    if ( Arrays . binarySearch ( edges [ 0 ] , path [ path . size ( ) ] ) < 0 ) {
      System . out . println ( path . size ( ) ) ;
      System . out . println ( ( Integer ) path . get ( 0 ) ) ;
      exit ( ) ;
    }
    for ( int v : edges [ path . size ( ) ] ) {
      if ( ! visited [ v ] ) {
        visited [ v ] = true ;
        append ( v ) ;
        break ;
      }
    }
    else {
      Collections . reverse ( path ) ;
    }
  }
  return edges ;
}
