static final int gcd ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int [ ] lives = new int [ N ] ;
  for ( int i = 0 ;
  i < lives . length ;
  i ++ ) {
    lives [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  int gcd_value = lives [ 0 ] ;
  for ( int i = 1 ;
  i < lives . length ;
  i ++ ) {
    gcd_value = gcd ( gcd_value , lives [ i ] ) ;
  }
  return gcd_value ;
}
