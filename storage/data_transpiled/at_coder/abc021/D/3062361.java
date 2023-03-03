public static int [ ] factorialMemo ( int n , int p ) {
  int [ ] F = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    F [ i + 1 ] = F [ i ] * ( i + 1 ) % p ;
  }
  return F ;
  /* inverse of the array */
  int [ ] Finv = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    Finv [ i ] = F [ i ] ;
  }
  Finv [ n - 1 ] = Math . pow ( Finv [ n - 1 ] , p - 2 , p ) ;
}
