public static int N ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = ( N - K ) * ( K - 1 ) * 6 ;
  ans += ( N - 1 ) * 3 ;
  ans ++ ;
  System . out . println ( ans / Math . pow ( N , 3 ) ) ;
  return ans ;
}
