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
  List < Integer > money = new ArrayList < Integer > ( ) ;
  for ( int v = 0 ;
  v < n ;
  v ++ ) {
    if ( edges [ u ] [ v ] == 1 ) {
      money . add ( dfs ( v ) ) ;
    }
  }
  return Math . max ( money . size ( ) , Math . min ( money . size ( ) , 1 ) ) ;
}
