public static int dfs ( int u ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] edges = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    edges [ b - 1 ] [ i + 1 ] = 1 ;
  }
  /*if (!edges[u][0]) {
  return 1;
  }*/
  List < Integer > ls = new ArrayList < > ( ) ;
  for ( int v = 0 ;
  v < edges [ u ] . length ;
  v ++ ) {
    if ( edges [ u ] [ v ] == 1 ) {
      ls . add ( dfs ( v ) ) ;
    }
  }
  return Math . max ( ls . size ( ) , 1 ) + 1 ;
}
