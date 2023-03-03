public static int getMinCost ( int n , int h ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int d = Integer . parseInt ( input . nextLine ( ) ) ;
  int e = Integer . parseInt ( input . nextLine ( ) ) ;
  /* min cost */
  int cheap = Math . max ( ( e * ( n - normal ) - b * normal - h ) / ( d + e ) + 1 , 0 ) ;
  if ( normal + cheap <= n ) {
    return a * normal + c * cheap ;
  }
  return 0 ;
}
