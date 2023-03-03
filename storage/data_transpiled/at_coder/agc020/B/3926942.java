static final int [ ] solve ( ) {
  int k = Integer . parseInt ( input ( ) ) ;
  int [ ] a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  int m = 2 , M = 2 ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    if ( m % a [ i ] != 0 ) m += a [ i ] - ( m ) ;
  }
  return a ;
}
