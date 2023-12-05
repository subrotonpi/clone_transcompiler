static final int [ ] [ ] G = new int [ M ] [ ] ;
final int [ ] [ ] F = new int [ M ] [ ] ;
int H = 0 ;
final double INF = Double . MAX_VALUE ;
for ( int r = 0 ;
r < N ;
++ r ) {
  for ( int c = 0 ;
  c < M ;
  ++ c ) {
    int [ ] neighbours = new int [ M ] ;
    int a = ( r == 0 ) ? 1 : 0 ;
    if ( a == 0 ) {
      neighbours [ a ] = ( r + 1 ) ;
    }
    if ( a - 1 >= 0 ) {
      neighbours [ a ] = ( r - 1 ) ;
    }
    if ( c + 1 >= 0 ) {
      neighbours [ a ] = ( r + 1 ) ;
    }
    if ( a - 1 >= 0 ) {
      neighbours [ a ] = ( r - 1 ) ;
    }
    G [ a ] = neighbours ;
  }
  int end = ( N - 1 ) ;
  int [ ] [ ] D = Dijkstra ( G , ( 0 , 0 ) , end ) ;
  System . out . println ( "Case #" + ( end ) + ": " + D [ end ] ) ;
  if ( max ( fa , fb , water_level ) + 50 <= cb ) {
    return timeTaken ( water_level , fa , t ) ;
  }
  if ( max ( fa , fb ) + 50 <= cb ) {
    double drop = water_level - ( cb - 50 ) ;
    double dropTime = drop / 10.0 ;
    return dropTime + timeTaken ( ( cb - 50 ) , fa , t + dropTime ) ;
  }
  return INF ;
}
