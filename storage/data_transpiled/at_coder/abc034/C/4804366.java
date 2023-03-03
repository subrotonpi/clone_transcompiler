@ VisibleForTesting static int factorial ( ) {
  int a , b ;
  a = Integer . parseInt ( input . nextLine ( ) ) ;
  b = a - 1 ;
  m = 10 * * 9 + 7 ;
  return ( int ) ( factorial ( a + b ) * Math . pow ( factorial ( b ) * factorial ( a ) % m , m - 2 , m ) ) % m ;
}
