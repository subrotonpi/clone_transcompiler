static final int log10 ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int n_s = ( int ) Math . sqrt ( n ) ;
  int b = n ;
  int a = 1 ;
  for ( int i = 2 ;
  i <= n_s ;
  i ++ ) {
    if ( n % i == 0 ) {
      a = i ;
      b = n / i ;
    }
  }
  return a + b ;
}
