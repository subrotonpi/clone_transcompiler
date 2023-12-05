public static int [ ] N ( ) {
  N = [ int . valueOf ( i ) for i in input . split ( ) ] ;
  Arrays . sort ( N ) ;
  return ( int ) ( String . valueOf ( N [ 2 ] ) + String . valueOf ( N [ 1 ] ) + N [ 0 ] ) ;
}
