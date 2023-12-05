static boolean T = Integer . parseInt ( input ) {
  int testCase = 0 ;
  int k = input . nextInt ( ) ;
  int [ ] [ ] m = new int [ 2 * k ] [ 2 * k ] ;
  for ( int i = 0 ;
  i <= k ;
  i ++ ) {
    for ( int j = k - i - 1 ;
    j <= k + i ;
    j += 2 ) {
      int s = 2 * c - j ;
      if ( k - i - 1 <= s && s < k + i && m [ i ] [ j ] != m [ i ] [ s ] ) return false ;
    }
  }
  for ( int i = k ;
  i <= 2 * k - 1 ;
  i ++ ) {
    for ( int j = i - k + 1 ;
    j <= 2 * k - i - 2 ;
    j += 2 ) {
      int s = 2 * c - j ;
      if ( i - k + 1 <= s && s < 2 * k - i - 2 && m [ i ] [ j ] != m [ i ] [ s ] ) return false ;
    }
  }
  for ( int i = k ;
  i <= 2 * k - 1 ;
  i ++ ) {
    for ( int j = i - k + 1 ;
    j <= 2 * k - i - 2 ;
    j += 2 ) {
      int s = 2 * c - j ;
      if ( i - k + 1 <= s && s < 2 * k - i - 2 && m [ j ] [ i ] != m [ s ] [ i ] ) return false ;
    }
  }
  for ( int i = k ;
  i <= 2 * k - 1 ;
  i ++ ) {
    for ( int j = i - k + 1 ;
    j <= 2 * k - i - 2 ;
    j += 2 ) {
      int s = 2 * c - j ;
      if ( i - k + 1 <= s && s < 2 * k - i - 2 && m [ j ] [ i ] != m [ s ] [ i ] ) return false ;
    }
  }
  for ( int testCase = 0 ;
  testCase < T ;
  testCase ++ ) {
    k = Integer . parseInt ( input . nextInt ( ) ) ;
    m = new int [ k ] [ 2 * k - 1 ] ;
    for ( int i = 0 ;
    i <= 2 * k - 1 ;
    i ++ ) {
      m [ i ] [ i ] = input . nextInt ( ) ;
    }
    int h = 0 ;
    while ( h < k - 1 ) {
      if ( symh ( m