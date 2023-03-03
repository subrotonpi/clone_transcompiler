static final int solve ( int n , int r ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  String input = System . getProperty ( "line.separator" ) ;
  Class < ? extends BigInteger > clazz = BigInteger . class ;
  {
    int mod = 1 ;
    BigInteger [ ] f = new BigInteger [ n + 1 ] ;
    for ( int i = 1 ;
    i <= n ;
    i ++ ) {
      f [ i ] = f [ i - 1 ] . multiply ( i ) . mod ( mod ) ;
    }
    BigInteger [ ] inv = new BigInteger [ n + 1 ] ;
    inv [ 0 ] = new BigInteger ( pow ( f [ n - 1 ] . subtract ( BigInteger . ONE ) , mod - 2 , mod ) ) ;
    for ( int i = 1 ;
    i <= n ;
    i ++ ) {
      inv [ i ] = inv [ i - 1 ] . multiply ( i ) . mod ( mod ) ;
    }
    Collections . reverse ( inv ) ;
  }
  int fact = f [ n ] . intValue ( ) ;
  int comb = n + r ;
  int ret = fact * fact ;
  ret %= fact ;
  return ret ;
}
