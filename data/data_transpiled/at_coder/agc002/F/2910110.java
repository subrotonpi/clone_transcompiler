public static BigInteger powMod ( BigInteger MOD , BigInteger a , int n ) {
  BigInteger ret = BigInteger . ONE ;
  while ( n != 0 ) {
    if ( n % 2 == 1 ) ret = ret . multiply ( a ) . mod ( MOD ) ;
    a = a . multiply ( a ) . mod ( MOD ) ;
    n /= 2 ;
  }
  return ret ;
  /* fac */
  MOD = 1000000007 ;
  BigInteger ret = BigInteger . ONE ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) ret = ret . multiply ( i ) . mod ( MOD ) ;
  /* facgen */
  BigInteger first = fac ( first ) ;
  BigInteger last = fac ( last ) ;
  MOD = 1000000007 ;
  BigInteger ret = fac ( first ) ;
  /* build combList */
  BigInteger [ ] f = new BigInteger [ n + 1 ] ;
  for ( int i = first + 1 ;
  i <= last ;
  i ++ ) {
    ret = ret . multiply ( f [ i ] ) . mod ( MOD ) ;
    /* build comb */
    f [ i ] = BigInteger . ONE ;
    BigInteger v = powMod ( MOD , f [ m - K * 2 ] . multiply ( f [ 0 ] ) , MOD - 2 ) ;
    for ( int i = m - K ;
    i >= 0 ;
    i -- ) {
      f [ i ] . multiply ( v ) ;
      v = v . multiply ( i ) . mod ( MOD ) ;
    }
  }
  /* solve dp */
  MOD = 1000000007 ;
  BigInteger [ ] dp = new BigInteger [ n + 1 ] ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    int ci = ( i - 1 ) * ( k - 1 ) ;
    BigInteger v = BigInteger . ZERO ;
    for ( int j = 0 ;
    j < i ;
    j ++ , c ++ ) {
      v = ( v . add ( dp [ j ] . multiply ( c ) ) ) . mod ( MOD ) ;
      dp [ j ] = v ;
    }
    dp [ i ] = v ;
  }
  /* solve dp */
  if ( n == 1 || k == 1 ) return BigInteger . ONE ;
  int m = n * k ;
  LinkedList < BigInteger > comb = new LinkedList < BigInteger > ( ) ;
  combgen . add ( facgen ( k - 2 , m - 1 ) ) ;
  /* build comb */
  BigInteger result = BigInteger . valueOf ( result . longValue ( ) ) ;
  System . out . println ( result ) ;
  return