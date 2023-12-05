public static int [ ] getN ( ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] L = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L [ i ] = Integer . parseInt ( input ) ;
  }
  Arrays . sort ( L ) ;
  int mod = 10 * 9 + 7 ;
  if ( N == 1 ) {
    System . out . println ( Math . pow ( 2 , L [ 0 ] , mod ) ) ;
    exit ( ) ;
  }
  /* BigInteger gcd */
  BigInteger x = BigInteger . valueOf ( max ( L [ 0 ] , mod ) ) ;
  BigInteger y = BigInteger . valueOf ( min ( L [ 1 ] , mod ) ) ;
  BigInteger M [ ] = new BigInteger [ N ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    M [ i ] = L [ i + 1 ] - L [ i ] ;
  }
  int g = M [ 0 ] ;
  for ( int i = 1 ;
  i < N - 1 ;
  i ++ ) {
    g = gcd ( g , M [ i ] ) ;
  }
  return M ;
}
