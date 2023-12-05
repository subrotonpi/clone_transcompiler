public static int ncr ( int n , int r ) {
  return fact [ n ] * invFact [ r ] * invFact [ n - r ] % div ;
  /* find duplicated elements */
  int [ ] appeared = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    appeared [ i ] = - 1 ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( appeared [ i ] >= 0 ) {
      return appeared [ i ] ;
    }
    appeared [ i ] = i ;
  }
  int div = ( int ) ( 1e9 + 7 ) ;
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  aa = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    aa [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] fact = new int [ n + 1 ] , invFact = new int [ n + 1 ] ;
  fact [ 0 ] = 1 ;
  invFact [ 0 ] = 1 ;
  int fact_tmp = 1 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    fact_tmp *= i ;
    fact_tmp %= div ;
    fact [ i ] = fact_tmp ;
    invFact [ i ] = Math . pow ( fact_tmp , div - 2 , div ) ;
  }
  int i1 = findUnique ( aa ) ;
  int i2 = findUnique ( aa ) ;
  int outsideN = n + 1 - ( i2 - i1 + 1 ) ;
  for ( int partN = 1 ;
  partN <= n ;
  partN ++ ) {
    int sub = outsideN >= partN - 1 ? ncr ( outsideN , partN - 1 ) : 0 ;
    System . out . println ( ( ncr ( n + 1 , partN ) - sub ) % div ) ;
  }
  return 0 ;
}
