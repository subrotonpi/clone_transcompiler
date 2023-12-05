public static int gcd ( int a , int b ) {
  return b == 0 ? a : gcd ( b , a % b ) ;
}
int n = input . nextInt ( ) ;
for ( int test : xrange ( n ) ) {
  a = Integer . parseInt ( input . nextLine ( ) ) ;
  b = Integer . parseInt ( input . nextLine ( ) ) ;
  a = a / gcd ( a , b ) ;
  b = b / gcd ( a , b ) ;
  if ( ( b & ( b - 1 ) ) == 0 ) {
    int res = 0 ;
    while ( a < b ) {
      a *= 2 ;
      res ++ ;
    }
    System . out . println ( "Case #" + ( test + 1 ) + ": " + res ) ;
  }
  else {
    System . out . println ( "Case #" + ( test + 1 ) + ": impossible" ) ;
  }
}
