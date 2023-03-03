static int solve ( int n , int k , int [ ] sums ) throws IOException {
  final int [ ] a = new int [ n - k ] ;
  final int [ ] r = new int [ k ] ;
  final int [ ] q = new int [ k ] ;
  for ( int i = 1 ;
  i <= n - k ;
  i ++ ) {
    a [ i - 1 ] = sums [ i - 1 ] - sums [ i ] ;
  }
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    final int [ ] b = new int [ n ] ;
    for ( int x = 0 ;
    x < ( n - 1 - i ) / k ;
    x ++ ) b [ x ] = a [ i + k * x ] ;
    for ( int c = 1 ;
    c < b . length ;
    c ++ ) b [ c ] = b [ c - 1 ] + b [ c ] ;
    b [ 0 ] = 0 ;
    final int d = Math . abs ( max ( b ) - min ( b ) ) ;
    r [ i ] = d ;
    q [ i ] = Math . max ( b , 0 ) ;
  }
  final int m = Math . max ( r , 0 ) ;
  final int rem = ( sums [ 0 ] - sum ( q ) ) % k ;
  final int n = m * k - sum ( r ) ;
  if ( n >= rem ) {
    return m ;
  }
  else {
    return m + 1 ;
  }
}
