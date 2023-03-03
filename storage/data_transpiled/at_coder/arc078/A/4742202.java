public static int [ ] getSums ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = 0 ;
  }
  a [ 0 ] = a [ 0 ] ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    a [ i ] = sums [ i - 1 ] + a [ i ] ;
  }
  int [ ] res = new int [ n - 1 ] ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    res [ i ] = Math . abs ( 2 * sums [ i ] - sums [ i - 1 ] ) ;
  }
  return res ;
}
