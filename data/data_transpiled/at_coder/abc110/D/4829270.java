@ Function public static void apply ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int MOD = 10 * 9 + 7 ;
  /* Factorize */
  List < Pair < Integer , Integer >> fct = new ArrayList < > ( ) ;
  int b = 2 , e = 0 ;
  while ( b * b <= n ) {
    while ( n % b == 0 ) {
      n /= b ;
      e ++ ;
    }
    if ( e > 0 ) fct . add ( new Pair < > ( b , e ) ) ;
    b = b + 1 ;
    e = 0 ;
  }
  if ( n > 1 ) fct . add ( new Pair < > ( n , 1 ) ) ;
  /* nCr */
  int n = Math . min ( n , m ) ;
  if ( n == 0 ) {
    return ;
  }
  int over = Math . min ( n , m - n ) ;
  int under = Math . min ( 1 , m ) ;
  /* nCr */
  List < Pair < Integer , Integer >> f = factorize ( m ) ;
  long ans = 1 ;
  for ( Pair < Integer , Integer > p : f ) {
    int num = p . first ( ) ;
    ans *= nCr ( num + n - 1 , num ) ;
    ans %= MOD ;
  }
  System . out . println ( ans ) ;
}
