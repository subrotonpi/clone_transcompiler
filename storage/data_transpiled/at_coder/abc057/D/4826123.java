private static HashMap < Integer , Integer > map = new HashMap < Integer , Integer > ( ) {
  private int nCr ( int n , int r ) {
    if ( n < r ) return 0 ;
    if ( n == r || r == 0 ) return 1 ;
    if ( ( n < r ) || ( r > n ) ) return map . get ( ( n ) ) ;
    if ( ( n < r ) || ( r > n ) ) return map . get ( ( n ) ) ;
    map . put ( ( n , r ) , nCr ( n - 1 , r ) + nCr ( n - 1 , r - 1 ) ) ;
    return map . get ( ( n ) ) ;
  }
  @ Override public String toString ( ) {
    return "nCr(n, r)" ;
  }
}
