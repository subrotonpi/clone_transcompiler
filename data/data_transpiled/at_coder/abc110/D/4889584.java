static final int [ ] getM ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int MOD = 10 * 9 + 7 ;
  int [ ] d = new int [ M ] ;
  for ( int i = 2 ;
  i <= ( int ) Math . sqrt ( M ) ;
  i ++ ) {
    if ( M % i == 0 ) {
      d [ i ] = 0 ;
    }
    while ( M % i == 0 ) {
      d [ d . length - 1 ] ++ ;
      M /= i ;
    }
  }
  if ( M != 1 ) {
    d [ M ] = 1 ;
  }
  /*comb = 1;*/
  int a = 1 ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    a *= ( n - i ) ;
  }
  for ( int i = 0 ;
  i < d . length ;
  i ++ ) {
    a /= ( d [ i ] + 1 ) ;
  }
  answer %= MOD ;
  return d ;
}
