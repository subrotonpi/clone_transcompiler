static final int [ ] [ ] G = new int [ G . length ] [ G . length ] ;
final int [ ] [ ] friends = new int [ G . length ] ;
for ( int i = 0 ;
i < G . length ;
i ++ ) {
  final int [ ] [ ] girls = new int [ G [ i ] . length ] ;
  for ( int j = 0 ;
  j < G [ i ] . length ;
  j ++ ) girls [ i ] [ j ] = i ;
  System . err . println ( Arrays . toString ( names [ id ( i ) ] ) + " = " + Arrays . toString ( girls [ i ] ) ) ;
}
class Ford_Fulkerson {
  int N ;
  boolean [ ] [ ] used = new boolean [ G . length ] [ G [ i ] . length ] ;
  int [ ] [ ] G = new int [ G . length ] [ G [ i ] . length ] ;
  for ( int i = 0 ;
  i < G . length ;
  i ++ ) {
    used [ i ] = new boolean [ G [ i ] . length ] ;
    G [ i ] = new int [ G [ i ] . length ] ;
    for ( int j = 0 ;
    j < G [ i ] . length ;
    j ++ ) {
      G [ i ] [ j ] = 0 ;
    }
  }
  int N = N ;
  for ( int i = 0 ;
  i < G . length ;
  i ++ ) {
    if ( i == G . length ) continue ;
    used [ i ] = true ;
    for ( int j = 0 ;
    j < G [ i ] . length ;
    j ++ ) {
      if ( i == G [ i ] [ j ] ) continue ;
      if ( ( ! used [ i ] ) && G [ i ] [ j ] > 0 ) {
        int d = dfs ( i , t , Math . min ( f , G [ i ] [ j ] ) ) ;
        if ( d > 0 ) {
          G [ i ] [ j ] -= d ;
          G [ i ] [ j ] += d ;
          return d ;
        }
      }
    }
  }
  int flow = 0 ;
  while ( true ) {
    used [ i ] = false ;
    int f = dfs ( 0 , G [ i ] [ 1 ] , 10 * 9 ) ;
    if ( f == 0 ) break ;
    flow += f ;
  }
}
