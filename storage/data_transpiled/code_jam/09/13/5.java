static HashMap < Integer , Double > mem = new HashMap < Integer , Double > ( ) {
  HashMap < Integer , Double > memch = new HashMap < Integer , Double > ( ) ;
  private double ch ( int n , int k ) {
    if ( k == 0 || k == n ) return 1 ;
    if ( k > n ) return 0 ;
    if ( ( n = memch . get ( new Integer ( n ) ) ) != 0 ) return memch . get ( new Integer ( k ) ) ;
    double rv = ch ( n - 1 , k - 1 ) + ch ( n - 1 , k ) ;
    memch . put ( new Integer ( n ) , rv ) ;
    return rv ;
  }
  private double pGets ( int n , int r , int d , int g ) {
    if ( g > r || g > d || n < g ) return 0.0 ;
    assert n >= r ;
    return ch ( r , g ) * ch ( n - r , d - g ) / ( double ) ch ( n , d ) ;
  }
  private double e ( int c , int r , int n ) {
    if ( r == 0 ) return 0.0 ;
    if ( ( c = mem . get ( new Integer ( c ) ) ) != 0 ) return mem . get ( new Integer ( c ) ) ;
    double pStand = pGets ( n , r , c , 0 ) ;
    double eRed = 0.0 ;
    for ( int g : xrange ( 1 , r + 1 ) ) eRed += pGets ( n , r , c , g ) * e ( c , r - g , n ) ;
    double rv = ( 1 + eRed ) / ( 1 - pStand ) ;
    mem . put ( new Integer ( c ) , rv ) ;
    return rv ;
  }
  private double ans ( int c , int n ) {
    return e ( c , n , n ) ;
  }
  private static class class Test {
    int T = Integer . parseInt ( System . in ) ;
    for ( int i : xrange ( 1 , T + 1 ) ) {
      mem . clear ( ) ;
      memch . clear ( ) ;
      int n = Integer . parseInt ( System . in ) ;
      int c = Integer . parseInt ( System . in ) ;
      System . out . println ( "Case #" + i + ": " + ans ( c , n ) ) ;
    }
  }
}
