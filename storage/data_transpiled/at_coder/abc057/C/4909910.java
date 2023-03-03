static final int n ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 1e10 ;
  for ( int i = 1 ;
  i <= ( int ) Math . sqrt ( n ) ;
  i ++ ) {
    if ( ( n % i ) == 0 ) {
      ans = Math . min ( ans , ( int ) Math . log10 ( n / i ) ) ;
    }
  }
  System . out . println ( ans + 1 ) ;
}
