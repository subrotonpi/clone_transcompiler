public static int N = Integer . parseInt ( input ) {
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  int A_tm1 = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    int A_t = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( A_t - A_tm1 < T ) ans += A_t - A_tm1 ;
    else ans += T ;
    A_tm1 = A_t ;
  }
  ans += T ;
  System . out . println ( ans ) ;
  return ans ;
}
