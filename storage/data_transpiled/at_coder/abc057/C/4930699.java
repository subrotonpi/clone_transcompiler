static final int input ( ) {
  int num = Integer . parseInt ( input ( ) ) ;
  int num_sqrt = ( int ) Math . sqrt ( num ) ;
  int ans = 11 ;
  for ( int A = 1 ;
  A <= num_sqrt ;
  A ++ ) {
    if ( num % A == 0 ) {
      int B = ( int ) ( num / A ) ;
      A = String . valueOf ( A ) ;
      B = String . valueOf ( B ) ;
      int now_ans = Math . max ( A . length ( ) , B . length ( ) ) ;
      ans = Math . min ( ans , now_ans ) ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
