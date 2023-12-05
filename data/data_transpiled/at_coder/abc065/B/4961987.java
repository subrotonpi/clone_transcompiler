public static int [ ] getSolution ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  int botan = a [ 0 ] ;
  int ans = - 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( botan == 2 ) {
      ans = i + 1 ;
      break ;
    }
    botan = a [ botan - 1 ] ;
  }
  return ans ;
}
