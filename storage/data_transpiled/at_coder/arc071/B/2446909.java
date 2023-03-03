static final long solve ( ) {
  final long mod = 1000000007 ;
  {
    final long n = Long . parseLong ( input . nextLine ( ) ) ;
    final long m = Long . parseLong ( input . nextLine ( ) ) ;
    final long [ ] x = Lists . newArrayList ( ) . stream ( ) . mapToLong ( Long :: parseLong ) . toArray ( ) ;
    final long [ ] y = Lists . newArrayList ( ) . stream ( ) . mapToLong ( Long :: parseLong ) . toArray ( ) ;
    long X = Long . MIN_VALUE ;
    for ( long i = 1 ;
    i < n ;
    i ++ ) {
      X += ( x [ i ] - x [ i - 1 ] ) * i * ( n - i ) ;
      X %= mod ;
    }
    long Y = Long . MIN_VALUE ;
    for ( long i = 1 ;
    i < m ;
    i ++ ) {
      Y += ( y [ i ] - y [ i - 1 ] ) * i * ( m - i ) ;
      Y %= mod ;
    }
    System . out . println ( ( X * Y ) % mod ) ;
  }
  if ( __name__ == "main" ) solve ( ) ;
  return 0 ;
}
