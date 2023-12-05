@ VisibleForTesting static void from ( LinkedHashMap < Integer , Integer > input ) {
  int n = input . size ( ) ;
  List < Integer > xys = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    xys . add ( Integer . parseInt ( input . get ( ) ) ) ;
  }
  int MOD = 998244353 ;
  int excludes = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    final int x1 = xys . get ( i ) ;
    final int y1 = xys . get ( i ) ;
    List < Integer > slopes = new ArrayList < > ( ) ;
    for ( int j = i + 1 ;
    j < xys . size ( ) ;
    j ++ ) {
      final int x2 = xys . get ( j ) ;
      final int y2 = xys . get ( j ) ;
      final int dx = x2 - x1 ;
      final int dy = y2 - y1 ;
      if ( dx == 0 ) {
        slopes . add ( FastMath . abs ( x2 ) ) ;
      }
      else if ( dy == 0 ) {
        slopes . add ( 1 ) ;
      }
      else {
        int m = gcd ( dx , dy ) ;
        slopes . add ( dx / m + dy / m * FastMath . abs ( m ) ) ;
      }
    }
    for ( int c : slopes ) {
      if ( c > 1 ) {
        excludes += 2 * c - c - 1 ;
      }
    }
    excludes %= MOD ;
  }
  System . out . println ( ( Math . pow ( 2 , n ) % MOD ) - excludes - ( n * ( n - 1 ) / 2 ) - n - 1 ) % MOD ) ;
}
