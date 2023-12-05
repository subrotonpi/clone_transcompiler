static String print ( ) throws IOException {
  final int imp = 100000 ;
  int m = Integer . parseInt ( getLine ( ) ) ;
  int v = Integer . parseInt ( getLine ( ) ) ;
  int [ ] G = new int [ m ] ;
  int [ ] C = new int [ m ] ;
  int [ ] leafs = new int [ m ] ;
  for ( int i = 0 ;
  i < ( m - 1 ) / 2 ;
  i ++ ) {
    int g = Integer . parseInt ( getLine ( ) ) ;
    int c = Integer . parseInt ( getLine ( ) ) ;
    G [ i ] = g ;
    C [ i ] = c ;
  }
  for ( int i = 0 ;
  i < ( m + 1 ) / 2 ;
  i ++ ) leafs [ i ] = Integer . parseInt ( getLine ( ) ) ;
  int [ ] nodes = new int [ ( m - 1 ) / 2 ] ;
  for ( int i = 0 ;
  i < nodes . length ;
  i ++ ) {
    nodes [ i ] = 0 ;
  }
  for ( int i = ( m - 1 ) / 2 - 1 ;
  i >= 0 ;
  i -- ) {
    if ( G [ i ] == 0 ) nodes [ i ] = nodes [ 2 * i + 1 ] == 0 ? 0 : 1 ;
    else nodes [ i ] = nodes [ 2 * i + 1 ] == 0 ? 0 : 1 ;
  }
  cost = new int [ m ] [ ] ;
  for ( int i = 0 ;
  i < nodes . length ;
  i ++ ) {
    cost [ i ] [ 0 ] = null ;
    cost [ i ] [ 1 ] = null ;
    for ( int j = 0 ;
    j < leafs . length ;
    j ++ ) {
      if ( leafs [ j ] == 0 ) cost [ i ] [ j ] = imp ;
      else cost [ i ] [ j ] = imp ;
    }
  }
  for ( int i = ( m - 1 ) / 2 - 1 ;
  i >= 0 ;
  i -- ) {
    cost [ i ] [ v ] = cost [ i ] [ v ] ;
  }
  if ( cost [ 0 ] [ v ] >= imp ) return "IMPOSSIBLE" ;
  else return cost [ 0 ] [ v ] ;
}
