public static int Q ( int Q , int H , int S , int D ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = Math . min ( 8 * Q , 4 * H , 2 * S , D ) ;
  int ans = 0 ;
  ans += a * ( N / 2 ) ;
  if ( N % 2 != 0 ) ans += Math . min ( 4 * Q , 2 * H , S ) ;
  System . out . println ( ans ) ;
  return ans ;
}
