@ VisibleForTesting static BigInteger gcdL ( BigInteger [ ] L ) {
  BigInteger g = L [ 0 ] ;
  for ( int i = 1 ;
  i < L . length ;
  i ++ ) {
    if ( g . equals ( BigInteger . ONE ) ) {
      return ( BigInteger . ONE ) ;
    }
    g = gcd ( g , L [ i ] ) ;
  }
  return g ;
}
