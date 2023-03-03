public static int K = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] src = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int d = Integer . parseInt ( input . nextLine ( ) ) ;
    src [ i ] = new int [ ] {
      a , d }
      ;
    }
    /* ok price */
    int n = 0 ;
    for ( int a = 0 ;
    a < src . length ;
    a ++ ) {
      int d = src [ a ] ;
      n += Math . max ( 0 , ( price - a + d ) / d ) ;
      if ( n >= K ) return true ;
    }
    int l = 0 ;
    int r = 10 * 20 ;
    while ( r - l > 0 ) {
      int m = ( l + r ) / 2 ;
      if ( ok ( m ) ) r = m ;
      else l = m + 1 ;
    }
    int ans = 0 ;
    int k = 0 ;
    for ( int a = 0 ;
    a < src . length ;
    a ++ ) {
      int d = src [ a ] ;
      int n = Math . max ( 0 , ( l - a + d ) / d ) ;
      if ( n == 0 ) continue ;
      k += n ;
      ans += ( 2 * a + d * ( n - 1 ) ) * n / 2 ;
    }
    ans -= ( k - K ) * l ;
    System . out . println ( ans ) ;
    return ans ;
  }
  