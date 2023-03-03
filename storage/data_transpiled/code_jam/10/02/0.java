static final int c ( ) {
  int c = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  /* if (b == 0) return a; return gcd(b, a%b); */
  for ( int i = xrange ( c ) ;
  i < c ;
  i ++ ) {
    int [ ] times = ArrayUtil . toIntArray ( System . console ( ) . readLine ( ) . split ( " " ) ) ;
    Arrays . sort ( times ) ;
    int g = times [ 1 ] - times [ 0 ] ;
    for ( int j : xrange ( 1 , times . length ) ) g = gcd ( g , times [ j ] - times [ j - 1 ] ) ;
    int next = ( ( times [ 0 ] + g - 1 ) / g ) * g ;
    System . out . println ( "Case #" + ( i + 1 ) + ": " + ( next - times [ 0 ] ) ) ;
  }
  return c ;
}
