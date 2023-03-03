static final int [ ] getDigitsSum ( ) {
  int n = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  int a = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  int b = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  int total = 0 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    int digit_sum = Integer . parseInt ( String . valueOf ( i ) ) ;
    if ( a <= digit_sum && digit_sum <= b ) {
      total += i ;
    }
  }
  System . out . println ( total ) ;
  return new int [ ] {
  }
  ;
}
