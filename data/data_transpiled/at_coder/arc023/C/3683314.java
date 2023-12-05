@ Test public static void solve ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] _a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    _a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] a = new int [ _a . length ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    a [ i ] = _a [ i ] ;
  }
  for ( int i = 1 ;
  i < a . length ;
  i ++ ) {
    int n1 = _a [ i ] ;
    int n2 = _a [ i ] ;
    if ( n1 == n2 == - 1 ) {
      a [ a . length - 1 ] -- ;
    }
    else {
      a [ i ] = n2 ;
    }
  }
  int ans = 1 , mod = 10 * 9 + 7 ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    int n = a [ i ] ;
    if ( n > 0 ) continue ;
    int r = - n ;
    n = a [ i + 1 ] - a [ i - 1 ] + 1 ;
    int comb = Math . pow ( n + r - 1 , n - 1 ) / factorial ( r ) ;
    ans = ( ans * comb ) % mod ;
  }
  System . out . println ( ans ) ;
}
