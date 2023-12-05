public static int c_24 ( int N , int K ) {
  int MOD = 1777777777 ;
  /* inverse */
  int n = BigInteger . valueOf ( input . nextLine ( ) ) . intValue ( ) ;
  /* comb */
  int numerator = BigInteger . valueOf ( 1 ) , denominator = BigInteger . valueOf ( 1 ) ;
  for ( int j = n ;
  j > n - r ;
  j -- ) {
    numerator = ( numerator * j ) . mod ( MOD ) ;
  }
  for ( int j = r ;
  j > 0 ;
  j -- ) {
    denominator = ( denominator * j ) . mod ( MOD ) ;
  }
  /* montmort */
  int t1 = BigInteger . valueOf ( 3 ) , t2 = BigInteger . valueOf ( 1 ) ;
  for ( int k = 3 ;
  k <= n ;
  k ++ ) {
    t1 = t2 ;
    t2 = ( ( k - 1 ) * ( t1 + t2 ) ) . mod ( MOD ) ;
  }
  /* ans */
  return ans ;
}
