public static int gcd ( int a , int b ) {
  if ( b == 0 ) return a ;
  return gcd ( b , a % b ) ;
}
int t = Integer . parseInt ( input . nextLine ( ) ) ;
for ( ;
;
) {
  a = Integer . parseInt ( input . nextLine ( ) ) ;
  b = Integer . parseInt ( input . nextLine ( ) ) ;
  c = Integer . parseInt ( input . nextLine ( ) ) ;
  d = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( a < b || d < b ) {
    System . out . println ( "No" ) ;
    continue ;
  }
  if ( c >= b ) {
    System . out . println ( "Yes" ) ;
    continue ;
  }
  int g = gcd ( d , b ) ;
  System . out . println ( b - g + a % g <= c ? "Yes" : "No" ) ;
}
