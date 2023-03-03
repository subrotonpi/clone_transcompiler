static final long gcd ( long a , long b ) {
  while ( b > 0 ) {
    a = b ;
    b = a % b ;
  }
  return a ;
  /* Compute gcd */
  long gcd_l = reduce ( gcd , ( a , b ) -> gcd ( a , b ) ) ;
  int C = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int i : xrange ( C ) ) {
    List < Long > l = new ArrayList < Long > ( ) ;
    for ( String s : System . console ( ) . readLine ( ) . split ( " " ) ) {
      l . add ( Long . parseLong ( s ) ) ;
    }
    Collections . sort ( l ) ;
    Collections . reverse ( l ) ;
    long now = l . get ( 0 ) ;
    long [ ] g = new long [ l . size ( ) ] ;
    for ( int j = 0 ;
    j < l . size ( ) ;
    j ++ ) {
      g [ j ] = now - l . get ( j ) ;
    }
    long T = gcd_l ( g ) ;
    System . out . println ( "Case #" + ( i + 1 ) + ": " + ( ( ( now - 1 ) / T + 1 ) * T - now ) ) ;
  }
  return gcd ( gcd , ( a , b ) -> gcd ( a , b ) ) ;
}
