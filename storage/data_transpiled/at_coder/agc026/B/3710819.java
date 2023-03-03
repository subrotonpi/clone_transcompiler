public static int gcd ( int a , int b ) {
  if ( b == 0 ) {
    return a ;
  }
  return gcd ( b , a % b ) ;
}
/* in the range */
int T = Integer . parseInt ( input . nextLine ( ) ) ;
int A = Integer . parseInt ( input . nextLine ( ) ) ;
int B = Integer . parseInt ( input . nextLine ( ) ) ;
int C = Integer . parseInt ( input . nextLine ( ) ) ;
int D = Integer . parseInt ( input . nextLine ( ) ) ;
for ( ;
;
) {
  A = Integer . parseInt ( input . nextLine ( ) ) ;
  B = Integer . parseInt ( input . nextLine ( ) ) ;
  C = Integer . parseInt ( input . nextLine ( ) ) ;
  D = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( A < B || B > D ) {
    System . out . println ( "No" ) ;
    continue ;
  }
  if ( C >= B ) {
    System . out . println ( "Yes" ) ;
    continue ;
  }
  int gcdbd = gcd ( B , D ) ;
  if ( ( 1 + ( C - A % B ) / gcdbd ) * gcdbd + A % B >= B ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
