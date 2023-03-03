@ VisibleForTesting static int getStdIn ( ) {
  final int T = Integer . parseInt ( input ) ;
  int test = 1 ;
  while ( test <= T ) {
    System . out . print ( "Case #" + test + ": " ) ;
    test ++ ;
    final String [ ] mnk = input . split ( " " ) ;
    final int m = Integer . parseInt ( mnk [ 0 ] ) ;
    final int n = Integer . parseInt ( mnk [ 1 ] ) ;
    final int k = Integer . parseInt ( mnk [ 2 ] ) ;
    if ( m > n ) {
      final int tmp = n ;
      n = m ;
      m = tmp ;
    }
    if ( m <= 2 ) {
      System . out . println ( k ) ;
      continue ;
    }
    if ( m * n - k <= 4 ) {
      System . out . println ( ( m + n - 4 ) * 2 - m * n + k + 4 ) ;
      continue ;
    }
    final int size = Math . ceil ( Math . sqrt ( k + 4 ) . doubleValue ( ) ) ;
    int w = 0 ;
    if ( size > m ) {
      w = m ;
    }
    else {
      w = size ;
    }
    int h = size - 1 ;
    while ( w * h - 4 < k ) {
      h ++ ;
    }
    int ans = ( w + h - 4 ) * 2 ;
    if ( h > w ) {
      final int tmp = h ;
      h = w ;
      w = tmp ;
    }
    if ( ( w * h - 4 ) - k >= 2 && m > 3 ) {
      ans -- ;
    }
    if ( ( w - 1 ) * h - 3 >= k ) {
      ans = Math . min ( ( w + h - 5 ) * 2 + 1 , ans ) ;
    }
    System . out . println ( ans ) ;
  }
  return T ;
}
