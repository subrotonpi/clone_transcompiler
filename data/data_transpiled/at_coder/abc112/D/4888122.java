static final int N = Integer . parseInt ( input ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int n = 0 ;
  for ( int i = 1 ;
  i <= ( int ) Math . sqrt ( M ) ;
  i ++ ) {
    if ( M < i * N ) break ;
    if ( M % i == 0 ) {
      n = Math . max ( i , n ) ;
      if ( i >= N ) n = Math . max ( M / i , n ) ;
    }
  }
  return n ;
}
