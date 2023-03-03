public static int N ( ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  for ( int i = 1 ;
  i <= ( int ) ( M * 0.5 ) ;
  i ++ ) {
    if ( M % i == 0 ) {
      if ( M / i >= N ) ans = Math . max ( ans , i ) ;
      if ( i >= N ) ans = Math . max ( ans , M / i ) ;
    }
  }
  return ans ;
}
