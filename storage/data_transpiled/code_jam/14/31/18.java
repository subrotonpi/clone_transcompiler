@ VisibleForTesting static int gcd ( int a , int b ) {
  if ( b == 0 ) return a ;
  return gcd ( b , a % b ) ;
  /* solve the testnum */
  int p = Integer . parseInt ( input . nextLine ( ) ) , q = Integer . parseInt ( input . nextLine ( ) ) ;
  int g = gcd ( p , q ) ;
  return g ;
}
