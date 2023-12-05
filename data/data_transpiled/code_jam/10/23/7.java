@ GwtIncompatible ( "gmpy" ) static int [ ] [ ] getArgs ( ) {
  final int MAX_N = 510 ;
  final int MOD = 100003 ;
  int [ ] [ ] d = new int [ MAX_N ] [ ] ;
  for ( int i = 0 ;
  i < d [ 0 ] ;
  i ++ ) {
    d [ i ] = new int [ MAX_N ] ;
  }
  {
    int n ;
    int res ;
    if ( n < 0 || k < 0 ) return 0 ;
    if ( n <= k ) return 0 ;
    if ( n == k + 1 ) return 1 ;
    if ( d [ n ] [ k ] != 0 ) return d [ n ] ;
    int i ;
    int n = n - 1 ;
    if ( n == 0 ) return d [ n ] ;
    int res = 0 ;
    for ( i = 1 ;
    i < n ;
    i ++ ) {
      res += f ( n , i ) ;
    }
    sl [ n ] [ i ] = Integer . parseInt ( res ) ;
    int T = Integer . parseInt ( f . readLine ( ) ) ;
    for ( int i = 0 ;
    i < T ;
    i ++ ) {
      n = n - 1 ;
      for ( int j = 0 ;
      j < t ;
      j ++ ) {
        res += f ( k , j - i - 1 ) * comb ( t , j ) ;
        res %= MOD ;
      }
      d [ n ] [ k ] = res ;
      return d [ n ] ;
    }
  }
  int [ ] sl = {
    0 , 0 , 1 , 2 , 3 , 5 , 8 , 14 , 24 , 43 , 77 , 140 , 472 , 874 , 1628 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 3747 , 37 @ @