public static int gcd ( int a , int b ) {
  return b > 0 ? gcd ( b , a % b ) : a ;
}
List < Integer > pows = new ArrayList < > ( ) ;
for ( int i : xrange ( 41 ) ) {
  pows . add ( 2 * i ) ;
}
for ( int t : xrange ( input -> {
  int a = Integer . parseInt ( input . readLine ( ) ) , int b = Integer . parseInt ( input . readLine ( ) ) ;
  int d = gcd ( a , b ) ;
  a /= d ;
  b /= d ;
  if ( ! pows . contains ( b ) ) {
    System . out . println ( "Case #" + ( t + 1 ) + ": impossible" ) ;
  }
  else {
    int res = 0 ;
    while ( a < b ) {
      a *= 2 ;
      res ++ ;
    }
    System . out . println ( "Case #" + ( t + 1 ) + ": " + res ) ;
  }
}
