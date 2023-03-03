public static void main ( String [ ] args ) {
  final int MOD = 100003 ;
  int [ ] f = new int [ 10 ] ;
  Map < Integer , Integer > c = new HashMap < Integer , Integer > ( ) ;
  Map < Integer , Integer > map = new HashMap < Integer , Integer > ( ) ;
  {
    int n ;
    int k ;
    int s ;
    int ret ;
    int n ;
    int i ;
    int s ;
    if ( f . isEmpty ( ) ) {
      s = 1 ;
      for ( i = xrange ( 1010 ) ;
      i > 0 ;
      i -- ) {
        if ( i > 0 ) s *= i ;
        f [ n ] = s ;
      }
    }
    if ( n <= 1 ) return 1 ;
    return f [ n ] ;
  }
  {
    int n ;
    int k ;
    if ( ( n = c . containsKey ( new Integer ( n ) ) ) ) return c . get ( new Integer ( n ) ) ;
    ret = c . put ( new Integer ( n ) , fact ( n ) / fact ( k ) / fact ( n - k ) % MOD ) ;
    return ret ;
  }
  {
    int n ;
    int k ;
    if ( k == 1 ) return 1 ;
    if ( n == k + 1 ) return 1 ;
    if ( ( n = d . get ( new Integer ( n ) ) ) != 0 ) return 1 ;
    if ( d . containsKey ( new Integer ( n ) ) ) return 1 ;
    return d . get ( new Integer ( n ) ) ;
  }
}
