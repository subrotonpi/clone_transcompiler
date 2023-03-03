public static int [ ] [ ] f ( int b , int m ) {
  if ( m > ( 1 << ( b - 2 ) ) ) return new int [ b ] [ b ] ;
  int [ ] [ ] x = new int [ b ] [ b ] [ b ] ;
  for ( int i = 0 ;
  i < b ;
  i ++ ) for ( int j = 0 ;
  j < b ;
  j ++ ) x [ i ] [ j ] = ( ( ( i > j ) && ( i < ( b - 1 ) ) ) ? 1 : 0 ) ;
  m -- ;
  x [ 0 ] [ b - 1 ] = 1 ;
  for ( int i = 0 ;
  i < b - 1 ;
  i ++ ) if ( ( m >> ( i - 1 ) ) & 1 ) x [ i ] [ b - 1 ] = 1 ;
  return x ;
}
@ SuppressWarnings ( "unused" ) int [ ] [ ] x = new int [ b ] [ b ] ;
/* Integers */
int [ ] [ ] ints = new int [ b ] [ b ] ;
for ( int i = 0 ;
i < b ;
i ++ ) for ( int cn = 1 ;
cn < b + 1 + getInt ( ) ;
cn ++ ) {
  final int b = ints [ i ] ;
  final int m = m ;
  final int [ ] sol = f ( b , m ) ;
  final String output ;
  if ( sol . length == 0 ) {
    output = "IMPOSSIBLE" ;
  }
  else {
    output = "POSSIBLE\n" + Arrays . toString ( sol ) ;
  }
  System . out . println ( "Case #" + cn + ": " + output ) ;
}
