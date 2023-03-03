public static void chmin ( int n , int [ ] h ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    h [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  {
    float fInf = Float . POSITIVE_INFINITY ;
  }
  float [ ] dp = new float [ 10 * 5 + 10 ] ;
  dp [ 0 ] = fInf ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    dp [ i ] = chmin ( dp [ i ] , dp [ i - 1 ] + Math . abs ( h [ i ] - h [ i - 1 ] ) ) ;
    if ( i > 1 ) dp [ i ] = chmin ( dp [ i ] , dp [ i - 2 ] + Math . abs ( h [ i ] - h [ i - 2 ] ) ) ;
  }
  System . out . println ( dp [ n - 1 ] ) ;
}
